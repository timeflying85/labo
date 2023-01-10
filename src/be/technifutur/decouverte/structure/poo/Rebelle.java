package be.technifutur.decouverte.structure.poo;

public abstract class Rebelle extends Personnage{

    public Rebelle(String nom){
        super(nom);
    }

    public void afficheCamp(){
        System.out.println("Je suis un rebel");
    }
}
