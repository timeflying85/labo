package be.technifutur.decouverte.structure.poo;

public abstract class Empire extends Personnage{



    public Empire(String nom) {
        super(nom);
    }

    public void afficheCamp(){
        System.out.println("je suis un fdp de l'empire");
    }
}
