package be.technifutur.sudoku.model;

public interface SudokuModel {

    //Méthodes
    char getValue(int lig, int col) throws SudokuPositionException;

    final char empty = 0;

    //public abstract char getValue(char lig, char col) throws SudokuPositionException;

    public abstract void setValue(int lig, int col, char value)
            throws SudokuPositionException, SudokuValueException;

    public abstract void deleteValue(int lig, int col) throws SudokuValueException;

    public abstract boolean isPositionValid(int lig, int col);

    public abstract boolean isValueValid(char value);

}
