package be.technifutur.decouverte.structure.structure;

import java.util.Scanner;

public class TestStructure {

    public static void main(String[] args) {
        Personne client = new Personne();
        client.nom = "Dudu";
        client.prenom = "Toto";
        client.naissance = new MaDate();
        client.naissance.jour = 15;
        client.naissance.mois = 3;
        client.naissance.an = 2000;

        client = saisirPersonne();

        afficherPersonne(client);
        System.out.println("");
        String texte = DateToString(client.naissance);
        System.out.println(texte);
    }

    private static Personne saisirPersonne() {
        Personne pers = new Personne();


        System.out.println("Entrez nom de la personne : ");
        pers.nom = (new Scanner(System.in)).nextLine();
        System.out.println("Entrez prenom de la personne : ");
        pers.prenom = (new Scanner(System.in)).nextLine();
        pers.naissance = new MaDate();
        System.out.println("Entrez le jour de naissance : ");
        pers.naissance.jour = (new Scanner(System.in)).nextInt();
        System.out.println("Entrez le mois de naissance : ");
        pers.naissance.mois = (new Scanner(System.in)).nextInt();
        System.out.println("Entrez l'année de naissance : ");
        pers.naissance.an = (new Scanner(System.in)).nextInt();



        return pers;


    }

    private static String DateToString(MaDate date) {


        String result = String.valueOf(date.jour);
        String result2 = Integer.toString(date.mois);
        String result3 = Integer.toString(date.an);

        return result+" / "+result2+" / "+result3;
    }

    public static void afficherPersonne(Personne p) {
        System.out.println(p);
        System.out.println(p.nom);
        System.out.println(p.prenom);
        System.out.print(p.naissance.jour+" / "+p.naissance.mois+" / "+p.naissance.an);

    }
}
