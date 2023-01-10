package be.technifutur.sudoku.vue;

public interface SudokuVue {

    public abstract void afficheGrilleVide();

    public abstract void afficheGrille();

    void setMessage(String entrée_non_valide);

}
