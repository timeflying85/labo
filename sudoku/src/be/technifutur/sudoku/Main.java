package be.technifutur.sudoku;

import be.technifutur.sudoku.controleur.SudokuControleur;
import be.technifutur.sudoku.model.SamouraïModel;
import be.technifutur.sudoku.model.SudokuModel4x4;
import be.technifutur.sudoku.model.SudokuModel9x9;
import be.technifutur.sudoku.vue.SamouraïVue;
import be.technifutur.sudoku.vue.Vue4x4;
import be.technifutur.sudoku.vue.Vue9x9;

public class Main {
    public static void main(String[] args) {
       /* SudokuModel4x4 sudoku = new SudokuModel4x4();
        //mettre des valeurs dedans
        char[][] chars = getChars();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                sudoku.setValue(i,j,chars[i][j]);
            }
        }

        Vue4x4 vue4x4 = new Vue4x4(sudoku);
        SudokuControleur Control1 = new SudokuControleur(vue4x4, sudoku);
        Control1.start();*/

        /*SudokuModel9x9 sudoku = new SudokuModel9x9();
        char[][] chars1 = getChars();
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                sudoku.setValue(i, j, chars1[i][j]);
            }
        }

        Vue9x9 vue9x9 = new Vue9x9(sudoku);
        vue9x9.afficheGrilleVide();*/

        /*SudokuModel9x9 sudoku1 = new SudokuModel9x9();
        char[][] chars2 = getChars();
        for (int i = 0; i < chars2.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                sudoku1.setValue(i, j, chars2[i][j]);
            }
        }


        Vue9x9 vue9x92 = new Vue9x9(sudoku1);
        SudokuControleur Control = new SudokuControleur(vue9x92, sudoku1);
        Control.start();*/



        SamouraïModel samourai = new SamouraïModel();
        Character[] tab = new Character[(21*21) - (18*4)];
        for (int i = 0, j = 0; i < 21*21; i++) {
            if (samourai.isPositionValid(i,j)) {
                tab[j] = samourai.getValue(i / 21, i % 21);
                j++;
            }

        }

        SamouraïVue samouraiVue = new SamouraïVue(samourai);
        SudokuControleur Control2 = new SudokuControleur(samouraiVue, samourai);
        Control2.start();


    }

        public static char[][] getChars () {
            char[][] board = {};

            return board;
        }


}