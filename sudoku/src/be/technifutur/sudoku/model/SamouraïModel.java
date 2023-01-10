package be.technifutur.sudoku.model;

public class SamouraïModel extends AbstractModel implements SudokuModel {



    public SamouraïModel() {
        super(21);
    }

    //Méthodes
   /* @Override
    public char getValue(int lig, int col) {
        return grille[lig][col];
    }*/


    /*@Override
    public char getValue(char lig, char col) {
        return 0;
    }*/

   /* @Override
    public void setValue(int lig, int col, char value) {
        if(isPositionValid(lig, col) && isValueValid(value))
            grille[lig][col] = value;
    }

    @Override
    public void deleteValue(int lig, int col) {
        if(isPositionValid(lig, col))
            grille[lig][col] = empty;
    }*/

    @Override
    public boolean isPositionValid(int lig, int col) {
        boolean valid = false;

        if(lig >= 0 && lig <= 20 && col >= 0 && col <= 20) {
            valid = true;
            if((col >= 9 && col <= 11 && (lig >= 0 && lig <= 5 || lig >= 15 && lig <= 20))
                    || (lig >= 9 && lig <= 11 && (col >= 0 && col <= 5 || col >= 15 && col <= 20)))
                valid = false;
        }

        return valid;
    }

    @Override
    public boolean isValueValid(char value) {
//        boolean valid = false;
//
//        if(value >= '1' && value <= '9')
//            valid = true;
//
//        return valid;
        return (value >= '1' && value <= '9');
    }




}



       /* public static Character[][] values = {
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'p', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'},
                {'1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3', '4', 0, 0, 0, '8', '9', '1', '2', '3'}


        };


        public char getValue(int lig, int col) {
            char value = values[lig][col];
            if (values[lig][col] == empty()) return '.';
            return value;
        }


        public void setValue(char value, int lig, int col) {
            if(isValueValid(value))
                values[lig][col] = value;
            else System.out.println("Mauvais char");
        }

    @Override
    public char empty() {
        return 0;
    }

    @Override
    public char getValue(char lig, char col) {
        return 0;
    }

    @Override
    public void setValue(int lig, int col, char value) {

    }

    public void deleteValue(int lig, int col) {
            values[lig][col] = empty();
        }

    @Override
    public boolean isPositionValid(int lig, int col) {
        return false;
    }


    public boolean isValueValid(char value){
            return (value <= 57 && value >= 48);
        }

        public boolean isPositionValid(int i) {
            return(!(
                    (((i/21>=0 && i/21<=5) || (i/21 >= 15 && i/21 <= 20)) && (i%21 >= 9 && i%21 <= 11)) ||
                            ((i/21 >= 9 && i/21 <=11) && (((i%21 >= 0 && i%21 <= 5)) || (i%21 >= 15 && i%21 <= 20)))
            )
            );
        }
    } */

