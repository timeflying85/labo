package be.technifutur.decouverte.structure.poo;

public class Soldat extends Jedi{


    public Soldat(String nom) {
        super(nom);
    }

    public void combattre(){
        System.out.println("Je combat avec les rebelles, Mort à l'empire");
    }
}
