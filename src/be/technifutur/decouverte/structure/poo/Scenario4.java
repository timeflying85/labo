package be.technifutur.decouverte.structure.poo;

public class Scenario4 {

    public static void main(String[] args) {


        Personnage[] pers = {
                new Soldat("Leon"),
                new Jedi("luc"),
                new Sith("Dravador"),
                new Clone(),
                new Clone("Alfred")
        };
        Force force;

        for (Personnage p : pers) {
            System.out.println("Je me nomme "+p.getNom());
            if (p instanceof Force) {
                force = (Force) p;
                System.out.println("");
                force.utiliserForce();
            }
            System.out.println("");
            p.afficheCamp();
            System.out.println("");
            p.combattre();
            System.out.println();


        }

    }
}
