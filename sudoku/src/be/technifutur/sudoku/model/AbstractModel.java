package be.technifutur.sudoku.model;

import static be.technifutur.sudoku.model.SudokuModel.empty;

public abstract class AbstractModel {


    private char[][] grille;

    public AbstractModel(int LIM){
        grille = new char[LIM][LIM];
    }

    public char getValue(int lig, int col){
        return this.grille[lig][col];
    }



    public void setValue(int lig, int col, char value) {
        if(isPositionValid(lig, col) && isValueValid(value))
            grille[lig][col] = value;
    }

    protected abstract boolean isValueValid(char value);

    protected abstract boolean isPositionValid(int lig, int col);

    public void deleteValue(int lig, int col) {
        if(isPositionValid(lig, col))
            grille[lig][col] = empty;
    }
}
