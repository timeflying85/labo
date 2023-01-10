package be.technifutur.sudoku.model;

import be.technifutur.sudoku.model.SudokuModel;

import java.util.Scanner;

public class SudokuModel4x4 extends AbstractModel implements SudokuModel {
  //  public static final char EMPTY = 0;


 //   private char[][] grille= new char[4][4];

    public SudokuModel4x4 (){
        super(4);
    }


/*
    @Override
    public char getValue(int lig, int col) {
        return this.grille[lig][col];
    }


    public char getValue(char lig, char col) {
        return this.grille[lig][col];
    }


*/
    @Override
    public boolean isPositionValid(int lig, int col) {
        if (lig < 4 && lig >= 0 && col < 4 && col >= 0) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isValueValid(char val) {
        if (val <= '4' && val >= '0') {
            return true;
        } else {
            return false;
        }
    }


}
