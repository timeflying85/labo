package be.technifutur.decouverte.structure.structure;

import java.util.Random;
import java.util.Scanner;

public class TableauRotation {

    public static void main(String[] args) {
        int nb;
        int lig;
        int col;
        int n;
        boolean rotate=true;
        boolean sens=true;


        System.out.println("Entrez le nombre de lignes/colonnes : ");
        n=(new Scanner(System.in)).nextInt();

        int [][]tab=new int[n][n];

        System.out.println();
        System.out.println("Voila votre tableau de "+n+" Lignes/Colonnes : ");

        for (lig=0;lig<n;lig++) {
            for (col=0;col<n;col++) {
                Random r=new Random();
                nb=r.nextInt(10);
                tab[lig][col]=nb;
                System.out.print(tab[lig][col]+" \t ");

            }
            System.out.println();
        }
        System.out.println();

        int [][]tab2=new int[tab.length][tab.length];

        for (col=0;col<tab2.length;col++) {
            for(lig=tab.length-1;lig>=0;lig--) {
                tab2[col][lig]=tab[tab.length-1-lig][col];
            }

        }
        System.out.println();
        System.out.println("Voici votre tableau apres une rotation de 90deg : ");

        for (lig=0;lig<tab2.length;lig++) {
            for (col=0;col<tab2.length;col++) {


                System.out.print(tab2[lig][col]+" \t ");
            }
            System.out.println();
        }
        System.out.println();



        do {
            System.out.println();
            System.out.println("Voulez-vous faire une rotation supplémentaire ? True/False ");
            rotate=(new Scanner(System.in)).nextBoolean();

            if (rotate==false){
                System.out.println();
                System.out.println("Merci et à bientôt");
            }
            if (rotate==true) {
                System.out.println();
                System.out.println("Voulez-vous continuer à tourner dans le sens horloger ? True/False ");
                sens=(new Scanner(System.in)).nextBoolean();
                if (sens==true) {
                    tab2=rotation(tab2);
                    System.out.println();
                    System.out.println("Voilà votre tableau avec un rotation de 90° supplémentaire : ");
                    afficher(tab2);
                }
                if (sens==false) {
                    tab2=reverse(tab2);
                    System.out.println();
                    System.out.println("Voilà votre tableau après une rotation de 90° dans le sens Anti-horloger : ");
                    afficher(tab2);
                }
            }
        }
        while
        (rotate);
    }


    public static int[][] rotation (int[][]tab) {
        int[][]tab2;
        tab2=new int[tab.length][tab.length];
        for (int col=0;col<tab2.length;col++) {
            for(int lig=tab.length-1;lig>=0;lig--) {
                tab2[col][lig]=tab[tab.length-1-lig][col];
            }

        }
        return tab2;

    }

    public static int[][] reverse (int[][]tab){
        int[][]tab2;
        tab2=new int[tab.length][tab.length];
        for (int col=0;col<tab2.length;col++) {
            for(int lig=tab.length-1;lig>=0;lig--) {
                tab2[tab.length-1-lig][col]=tab[col][lig];
            }

        }
        return tab2;
    }

    public static void afficher (int[][]tab2) {


        for (int lig=0;lig<tab2.length;lig++) {
            for (int col=0;col<tab2.length;col++) {


                System.out.print(tab2[lig][col]+" \t ");
            }
            System.out.println();
        }

    }


}