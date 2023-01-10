package be.technifutur.decouverte.structure.poo;

public abstract class Personnage {

    private final String nom;

    public Personnage(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    };

    public abstract void combattre();

    public abstract void afficheCamp();

}
