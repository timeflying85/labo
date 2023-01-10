package be.technifutur.decouverte.structure.structure;

import be.technifutur.decouverte.structure.poo.VaisseauStructure;

public class Scenario1Copy {

    public static void main(String[] args) {
        VaisseauStructure v1 = new VaisseauStructure();
        VaisseauStructure v2 = new VaisseauStructure();

        //v1.pilote = "Luc";  //'pilote' is not public in 'poo.Vaisseau'. Cannot be accessed from outside package
        v1.nom = "Interceptor";
        //v2.pilote = "Darkvador"; // 'pilote' is not public in 'poo.Vaisseau'. Cannot be accessed from outside package
        v2.nom = "Iamurfather";

    }
}
