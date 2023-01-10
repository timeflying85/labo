package Controleur;


import Main.Input;
import Main.ScannerInput;
import Model.*;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateSudokuControleur implements SudokuControleur {
    private final SudokuModel sudoku;
    private final SudokuVue vue;

    private final Input input;

    private Pattern pattern = Pattern.compile("([1-9][0-9]*)\\.([1-9][0-9]*)(\\..)?");

    public CreateSudokuControleur(SudokuModel sudoku, SudokuVue vue, Input input) {
        this.sudoku = sudoku;
        this.vue = vue;
        this.input = input;
    }

    public CreateSudokuControleur(SudokuModel sudoku, SudokuVue vue) {
        this(sudoku, vue, new ScannerInput());
    }

    @Override
    public void sart() {
        vue.afficherGrille();
        String request = input.read("Modififier (lig.col.valeur), supprimer (lig.col), quitter (q) :");
        while (!request.equalsIgnoreCase("q")) {
            Matcher matcher = pattern.matcher(request);
            if (matcher.matches()) {
                int lig = Integer.parseInt(matcher.group(1)) - 1;
                int col = Integer.parseInt(matcher.group(2)) - 1;
                String value = matcher.group(3);
                try {
                    if (value != null) {
                        char val = value.charAt(1);
                        sudoku.setValue(lig, col, val);
                    } else {
                        sudoku.deleteValue(lig, col);
                    }
                } catch (SudokuException e) {
                    vue.setMessage(e.getMessage());
                }

            } else {
                vue.setMessage("entrée non valide");
            }
            vue.afficherGrille();
            request = input.read("Modififier (lig.col.valeur), supprimer (lig.col), quitter (q) :");
        }
    }

    @Override
    public void init(String fileName) {
        File file = new File("Sudo9x9.txt");

        try(FileReader read = new FileReader(file)) {

            BufferedReader br = new BufferedReader(read);
            StringBuffer sb = new StringBuffer();
            String line;
            int lig = 0;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
                String[] tab = line.split(",");
                //System.out.println(Arrays.toString(tab));

                for (int i = 0; i < tab.length; i++) {
                    //System.out.println(tab[i].length());
                    char value = tab[i].charAt(0);
                    if(sudoku.isValueValid(value)) {
                        sudoku.setValue(lig, i, value);
                    }

                }
                lig++;

            }
             //System.out.println("Contenu du fichier : ");
            //System.out.println(sb.toString());


            /*FileInputStream file = new FileInputStream("Sudo9x9.txt");
            try(Scanner scanner = new Scanner(file));
            while (scanner.hasNextLine());{
                System.out.println(scanner.nextLine());
            }
            scanner.close();*/

        } catch (IOException | SudokuPositionException | SudokuValueException e) {
            e.printStackTrace();
        }


    }
}
