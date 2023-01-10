package be.technifutur.decouverte.structure.structure;

import java.util.Scanner;

public class ListePersonne {

    public static void main(String[] args) {
        Personne[]tab = new Personne[10];
        int cpt=0;
        Personne client = new Personne();
        client.nom="";
        client.prenom="";

        System.out.println("Créez une liste de personne");
            saisirPersonne();
            ajouterPersonne();
            affichePersonne();

        supprimerPersonne();

        modifierPersonne();




    }

    static void ajouterPersonne() {
    }


    private static void affichePersonne() {
        Personne p = new Personne();
        System.out.println(p.nom);
        System.out.println(p.prenom);

    }

    private static void modifierPersonne() {
    }

    private static void supprimerPersonne() {
    }

    private static Personne saisirPersonne() {
        Personne p = new Personne();

        System.out.println("Entrez nom de la personne : ");
        p.nom = (new Scanner(System.in)).nextLine();
        System.out.println("Entrez prenom de la personne : ");
        p.prenom = (new Scanner(System.in)).nextLine();


        return p;
    }

}
