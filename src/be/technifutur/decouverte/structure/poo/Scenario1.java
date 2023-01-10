package be.technifutur.decouverte.structure.poo;

public class Scenario1 {

    public static void main(String[] args) {
        VaisseauStructure v1 = new VaisseauStructure();
        VaisseauStructure v2 = new VaisseauStructure();
        VaisseauStructure v3 = v2;

        v1.pilote = "Luc";
        v1.nom = "Interceptor";
        v2.pilote = "Darkvador";
        v2.nom = "Iamurfather";

        System.out.println(v1.nom);
        System.out.println(v2.nom);
        System.out.println(v3.nom);
        v2.nom = "toto";
        System.out.println(v3.nom);

    }
}
