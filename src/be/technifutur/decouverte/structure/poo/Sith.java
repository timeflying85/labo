package be.technifutur.decouverte.structure.poo;

public class Sith extends Empire implements Force{

    public Sith(String nom) {
        super(nom);
    }

    public void utiliserForce(){
        System.out.println("J'utilise le côté obscure de la force");
    }
    public void combattre(){
        System.out.println("Je combats avec les supots de satan");
    }
}
