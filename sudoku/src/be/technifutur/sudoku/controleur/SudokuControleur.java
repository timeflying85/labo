package be.technifutur.sudoku.controleur;

import be.technifutur.sudoku.model.SudokuModel;
import be.technifutur.sudoku.model.SudokuPositionException;
import be.technifutur.sudoku.model.SudokuValueException;
import be.technifutur.sudoku.vue.SudokuVue;

import java.util.Scanner;

public class SudokuControleur {

    private SudokuVue vue;
    
    private SudokuModel model;

    public SudokuControleur(SudokuVue v,SudokuModel m){
        model = m;
        vue = v;
    }
    

    /*public void start(){
        int lig =0;
        int col=0;
        char val='0';
        int cpt = 0;
        boolean sortie = true;
        /*System.out.println("Entrez Numero de Ligne : ");
        Scanner scanner = new Scanner(System.in);
        lig = Integer.parseInt(scanner.nextLine())-1;
        System.out.println("Entrez Numero de colonne : ");
        col = Integer.parseInt(scanner.nextLine())-1;
        System.out.println("Entrez la valeur à inserer : ");
        val = scanner.nextLine().charAt(0); */

       /*do {

           do {
               System.out.println("Entrez (1)Numero de Ligne, (2)numero de colonne, (3)la valeur à insérer : ");
               Scanner scanner = new Scanner(System.in);
               try{
                    lig = Integer.parseInt(scanner.nextLine()) - 1;
               } catch (Exception e){
                   System.err.println("Numéro de ligne incorrect, réessayez");
                   System.err.println(e);
               }
               try {
                   col = Integer.parseInt(scanner.nextLine()) - 1;
               } catch (Exception e1){
                   System.out.println("Numéro de colonne incorrect, réessayez");
               }
               new Scanner(System.in);
               try {
                   val = scanner.nextLine().charAt(0);
               } catch (Exception e2){
                   System.out.println("Valeur incorrecte, réessayez");
               }


           } while (!(model.isPositionValid(lig, col) && model.isValueValid(val)));
           //}while(!(lig < 9 && lig >= 0 && col < 9 && col >= 0 && val <= '9' && val >= '0'));

           model.setValue(lig, col, val);
           vue.afficheGrille();
           cpt++;

           System.out.println("Voulez-vous entrez une autre valeur ? ([oui]/non)");
           sortie = "non".equalsIgnoreCase(new Scanner(System.in).nextLine());

       }while (cpt < 81 && ! sortie);

    }*/



     private String[] tabS = new String[3];
    //3 -> nombre max d'informations demandees en 1x
    private String input;

    public void start(){
        boolean conti = true;

        while(conti){
            System.out.println("""
                    Menu :

                    1. Afficher Grille Vide
                    2. Afficher Grille Remplie
                    3. Entrer une valeur
                    4. Supprimer une valeur

                    0. Quitter
                    """);

            Scanner scan = new Scanner(System.in);
            switch (scan.nextInt()) {
                case 0 -> conti = false;

                case 1 -> vue.afficheGrilleVide();
                case 2 -> vue.afficheGrille();

                case 3 -> entrerValeur();
                case 4 -> supprimerValeur();

                default -> System.out.println("T'es con");
            }
        }
        System.out.println("Bye");
    }

    private void entrerValeur(){
        try {
            System.out.println("Entrer une ligne, une colonne et une valeur séparées par un point (ex : 2.5.1)");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();

            tabS = input.split("\\.");

            int lig = Integer.parseInt(tabS[0]) - 1;
            int col = Integer.parseInt(tabS[1]) - 1;
            char value = tabS[2].charAt(0);

            if (tabS[2].length() > 1) {
                System.err.println(tabS[2] + " n'est pas une valeur valable");
            }

            model.setValue(lig, col, value);
        }catch (NumberFormatException e){
            System.err.println("La ligne ou la colonne entrez n'est pas un nombres");
        } catch (SudokuValueException e) {
            System.err.println("la valeur n'est pas conforme");;
        } catch (SudokuPositionException e) {
            System.err.println("la position est incorrecte");;
        }
    }

    private void supprimerValeur(){
        try {
            System.out.println("Entrer une ligne et une colonne séparées par un point (ex : 2.5)");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();

            tabS = input.split("\\.");

            int lig = Integer.parseInt(tabS[0]) - 1;
            int col = Integer.parseInt(tabS[1]) - 1;

            model.deleteValue(lig, col);
        }catch (Exception e){
            System.err.println(e);
        }
    }

}
