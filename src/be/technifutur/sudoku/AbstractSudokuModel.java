package be.technifutur.sudoku;

public abstract class AbstractSudokuModel implements SudokuModel {

    private char[][] grille;
    public AbstractSudokuModel(int size){
        grille = new char[size][size];
    }

    @Override
    public char getValue(int lig, int col) throws SudokuPositionException {
        testPosition(lig, col);
        return this.grille[lig][col];
    }

    private void testPosition(int lig, int col) throws SudokuPositionException {
        if (!isPositionValid(lig, col)) {
            throw new SudokuPositionException(String.format("la position %s, %s n'est pas valide", lig, col));
        }
    }

    public abstract boolean isPositionValid(int lig, int col);

    @Override
    public void setValue(int lig, int col, char value) throws SudokuPositionException, SudokuValueException {
        testPosition(lig, col);
        testValue(value);
        this.grille[lig][col] = value;
    }

    private void testValue(char value) throws SudokuValueException {
        if (!isValueValid(value)) {
            throw new SudokuValueException(String.format("la valeur %s n'est pas valide", value));
        }
    }

    public int getMaxSize() {
        return this.grille.length;
    }

    @Override
    public void deleteValue(int lig, int col) throws SudokuPositionException {
        testPosition(lig, col);
        grille[lig][col] = SudokuModel.EMPTY;
    }

    @Override
    public abstract boolean isValueValid(char value);
}
