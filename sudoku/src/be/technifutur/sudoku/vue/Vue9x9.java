package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SudokuModel;
import be.technifutur.sudoku.model.SudokuModel4x4;
import be.technifutur.sudoku.model.SudokuModel9x9;
import be.technifutur.sudoku.vue.SudokuVue;

public class Vue9x9 implements SudokuVue {

    private final int GRID_SIZE = 9;

    private SudokuModel9x9 sudo ;

    public Vue9x9(SudokuModel9x9 sudo) {
        this.sudo = sudo;
    }


   /* public void Board9x9(String[] args) {
        char[][] board =
                {

                        {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0', '0', '0', '0', '0'},

                };


    }*/

    public void AfficheBoard9() {
        System.out.println("+-------+-------+-------+");
        for (char row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("+-------+-------+-------+");
            }
            System.out.print("| ");

            for (char column = 0; column < GRID_SIZE; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print("| ");
                }
                char value = sudo.getValue(row,column);
                value = value== SudokuModel.empty?'.':value;
                System.out.print(value +" ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }


    public void afficheGrille(){
        AfficheBoard9();

    }

    @Override
    public void setMessage(String entrée_non_valide) {

    }


    @Override
    public void afficheGrilleVide() {
        AfficheBoard9();
    }

    /*
    private static boolean isNumberInRow(char[][] board, char number, char row) {
        for (char i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private  static  boolean isNumberInColumn(char[][] board, char number, char column){
        for (char i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(char[][] board, char number, char row, char column) {
        char localBoxRow = (char) (row - row % 3);
        char localBoxColumn = (char) (column - column % 3);

        for (char i = localBoxRow; i < localBoxRow + 3; i++) {
            for (char j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(char[][] board, char number, char row, char column) {
        return !isNumberInRow(board, number, row) &&
                !isNumberInColumn(board, number, column) &&
                !isNumberInBox(board, number, row, column);
    }

    private static boolean solveBoard(char[][] board) {
        for (char row = 0; row < GRID_SIZE; row++) {
            for (char column = 0; column < GRID_SIZE; column++) {
                if (board[row][column] == 0) {
                    for (char numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        if (isValidPlacement(board, numberToTry, row, column)) {
                            board[row][column] = numberToTry;

                            if (solveBoard(board)) {
                                return true;
                            }
                            else {
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    */

}
