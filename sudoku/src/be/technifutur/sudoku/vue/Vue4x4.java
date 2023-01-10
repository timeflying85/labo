package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SudokuModel;
import be.technifutur.sudoku.model.SudokuModel4x4;
import be.technifutur.sudoku.vue.SudokuVue;

public class Vue4x4 implements SudokuVue {
    private final int GRID_SIZE = 4;

    private SudokuModel4x4 sudo;

    public Vue4x4(SudokuModel4x4 sudo) {
        this.sudo = sudo;
    }

    public void Board4x4(String[] args) {
        char[][] board =
                {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},

                };

    }

    public void AfficheBoard4(){
        System.out.println("+-----------+");
        for (char row = 0; row < GRID_SIZE; row++) {
            if (row % 2 == 0 && row != 0) {
                System.out.println("+-----------+");
            }
            System.out.print("| ");

            for (char column = 0; column < GRID_SIZE; column++) {
                if (column % 2 == 0 && column != 0) {
                    System.out.print("| ");
                }
                char value = sudo.getValue(row, column);
                value = value== SudokuModel.empty?'.':value;
                System.out.print(value +" ");
            }
            System.out.println("|");
        }
        System.out.println("+-----------+");
    }


    public void afficheGrille(){
        AfficheBoard4();
    }

    @Override
    public void setMessage(String entrée_non_valide) {

    }


    @Override
    public void afficheGrilleVide() {
        AfficheBoard4();
    }


}
