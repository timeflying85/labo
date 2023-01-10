package be.technifutur.decouverte.structure.poo;

public class Millenium extends VaisseauAncetre{

    public Millenium() {
        super(10); // obligatoirement en 1ere instruction, ce crée automatiquement si pas noté

    }

    public void vitesseLumiere(){
        System.out.println("je suis un fou je passe à la vitesse lumière");
    }

    // illustration de class abstract
    @Override
    public void afficherCamps(){
        System.out.println("Je suis un vaisseau de l'empire");
    }

    // redefinir methode 'tirer'
    @Override
    public void tirer(){
        super.tirer();
        if(this.nbMisille > 0){
            super.tirer();
        }
    }

    @Override
    public String toString(){
        return "Millenium{ nbMisille:"+nbMisille+", envol:"+this.isInflight()+" }";
    }
}
