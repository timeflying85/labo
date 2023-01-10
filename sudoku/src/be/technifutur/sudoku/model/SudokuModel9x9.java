package be.technifutur.sudoku.model;

import be.technifutur.sudoku.model.SudokuModel;

public class SudokuModel9x9 extends AbstractModel implements SudokuModel{

    //public static final char EMPTY = 0;


    //private char[][] grille = new char[9][9];

    public SudokuModel9x9() {
        super(9);
    }


   /* public void setValue(int lig, int col, char value) {
        if (value <= '9' && value >= '1') {
            grille[lig][col] = value;
        }
        this.grille[lig][col] = value;
    }

    @Override
    public char getValue(int lig, int col) {
        return this.grille[lig][col];
    }


    public char getValue(char lig, char col) {
        return this.grille[lig][col];
    }*/



    @Override
    public boolean isPositionValid(int lig, int col) {
        if (lig < 9 && lig >= 0 && col < 9 && col >= 0) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public boolean isValueValid(char val) {
        if (val <= '9' && val >= '0') {
            return true;
        } else {
            return false;
        }
    }


}
