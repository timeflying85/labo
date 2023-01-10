package Model;

public interface SudokuModel {
    int EMPTY = 0;

    char getValue(int lig, int col)throws SudokuPositionException;

    void setValue(int lig, int col, char value)
            throws SudokuPositionException, SudokuValueException;

    void deleteValue(int lig, int col)throws SudokuPositionException;

    boolean isValueValid(char value);

    boolean isPositionValid(int lig, int col);

    int getNbvalues();

    int getMaxSize();
}
