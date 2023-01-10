package be.technifutur.decouverte.structure.poo;

public class Jedi extends Rebelle implements Force{

    public Jedi(String nom) {
        super(nom);
    }

    public void utiliserForce(){
        System.out.println("J'utilise le pouvoir pure de la force");
    }
    public void combattre(){
        System.out.println("Je combats avec les jedis, à mort l'empire");
    }
}
