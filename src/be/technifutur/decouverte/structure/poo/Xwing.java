package be.technifutur.decouverte.structure.poo;

public class Xwing extends VaisseauAncetre{

    public Xwing(int nbMissile){
        super(nbMissile);
    }

    // illustration de class abstract
    @Override
    public void afficherCamps() {
        System.out.println("Je suis un vaisseau Rebel");
    }
}
