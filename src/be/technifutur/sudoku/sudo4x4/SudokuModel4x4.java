package be.technifutur.sudoku.sudo4x4;

import be.technifutur.sudoku.AbstractSudokuModel;
import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuPositionException;
import be.technifutur.sudoku.SudokuValueException;

public class SudokuModel4x4 extends AbstractSudokuModel implements SudokuModel {

    public SudokuModel4x4() {
        super(4);
    }

    @Override
    public boolean isValueValid(char value) {
        return value >= '1' && value <= '4';
    }

    @Override
    public boolean isPositionValid(int lig, int col) {
        return lig >= 0 &&
                lig < 4 &&
                col >= 0 &&
                col < 4;
    }

    @Override
    public int getNbvalues() {
        return 4*4;
    }
}
