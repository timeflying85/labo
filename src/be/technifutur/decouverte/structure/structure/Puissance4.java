package be.technifutur.decouverte.structure.structure;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Puissance4 {

    public static void main(String[] args) {

        char [][]tab=new char [6][7];
        int tab3[]= {0,1,2,3,4,5,6};
        int tab2[] = new int[11];
        int i=0;
        int j=0;
        int lig=0;
        int col=0;
        int cpt=0;
        int verif, verifDiag;
        char pion=' ';
        boolean gagner=false ,plein=false, recommencer=false;



        do {
            System.out.println("Bienvenu(e) dans le jeu de Puissance 4");
            gagner=false;
            rempli(tab);
            affiche(tab);
            affiche2(tab2);
            affiche3(tab3);
            cpt=0;
            while (!gagner) {



                if (cpt%2==0) {
                    pion='O';
                }
                else {
                    pion='X';
                }

                do {

                    i=5;
                    plein=false;
                    do {
                        System.out.println();
                        System.out.println("Choissisez une colonne (Nombre entier de 0 à 6)");
                        j=saisieInt();
                    }
                    while(! (j >= 0 && j < 7 )) ;
                    while (i>=0 && tab[i][j] != ' ')
                    {
                        i--;
                    }
                    if (i==-1) {
                        System.out.println();
                        System.out.println("Cette colonne est remplie, choissisez une autre");
                        System.out.println();
                        //j= (new Scanner(System.in)).nextInt();
                        plein=true;

                    }
                }
                while(plein==true);

                tab[i][j] = pion;
                cpt++;
                affiche(tab);
                affiche2(tab2);
                affiche3(tab3);



                if (cpt>=7) {
                    lig=i;
                    col=j;
                    verif=0;
                    while (lig<tab.length && tab[lig][col] == pion) {
                        verif++;
                        lig++;
                    }
                    if(verif==4) {
                        System.out.println();
                        System.out.println("Félicitaion le joueur avec le pion <"+pion+"> a gagné");
                        gagner = true;


                    }
                    else {
                        lig=i;
                        col=j;
                        verif=0;
                        while (col>=0 && tab[lig][col] == pion) {
                            verif++;
                            col--;
                        }
                        col=j+1;
                        while (col<tab[0].length && tab[lig][col] == pion) {
                            verif++;
                            col++;
                        }

                        if (verif>=4) {
                            System.out.println();
                            System.out.println("Félicitaion le joueur avec le pion < "+pion+" > a gagné");
                            gagner = true;

                        }

                        else {
                            lig=i;
                            col=j;
                            verifDiag=0;
                            while (lig<tab.length && col<tab[0].length && tab[lig][col] == pion) {
                                verifDiag++;
                                col++;
                                lig++;
                            }
                            lig=lig-1;
                            col=j-1;
                            while (lig>=0 && col>=0 && tab[lig][col] == pion) {
                                verifDiag++;
                                col--;
                                lig--;
                            }

                            if(verifDiag>=4) {
                                System.out.println();
                                System.out.println("Félicitaion le joueur avec le pion < "+pion+" > a gagné");
                                gagner = true;


                            }
                            else{



                                lig=i;
                                col=j;
                                verifDiag=0;
                                while (col>=0 && lig<tab.length && col<tab[0].length && tab[lig][col]==pion) {
                                    verifDiag++;
                                    col--;
                                    lig++;
                                }
                                lig=i-1;
                                col=j-1;
                                while (lig>=0 && col>=0 && tab[lig][col] == pion) {
                                    verifDiag++;
                                    col++;
                                    lig--;
                                }

                                if(verifDiag>=4) {
                                    System.out.println();
                                    System.out.println("Félicitaion le joueur avec le pion < "+pion+" > a gagné");
                                    gagner = true;

                                }





                            }
                        }
                    }
                }

            }
            if (gagner==true) {
                System.out.println();
                System.out.println("Voulez-vous recommencer ? True/False");
                System.out.println();
                recommencer=saisieBoolean();


                if (recommencer==false) {
                    System.out.println();
                    System.out.println("Merci d'avoir joué et à bientôt");
                    System.out.println();
                }
            }
        }while(recommencer==true);

    }


    public static void affiche(char tab[][])  {
        int i, j;
        System.out.println();
        for (i=0; i<tab.length ; i++) {
            System.out.print("|");
            for (j=0; j<tab[i].length ; j++) {
                System.out.print(tab[i][j] + "|  "+(j==tab[i].length-1?"":"|"));
            }
            System.out.println();
        }
    }

    public static void affiche2(int tab2[])  {

        for (int i=0; i<tab2.length; i++) {
            System.out.print("___");
        }
        System.out.println();
    }

    public static void affiche3(int tab3[])  {

        for (int i=0; i<tab3.length; i++) {
            System.out.print((i==0?"|":" |")+tab3[i]+"| ");
        }
        System.out.println();
    }

    public static void rempli(char tab[][]) {
        int i,j;
        for (i=0; i<tab.length; i++) {
            for (j=0; j<tab[i].length; j++) {
                tab[i][j] = ' ';
            }
        }
    }

    public static boolean saisieBoolean() {

        boolean ok, choix=false;
        do{
            ok=true;
            try{

                choix=(new Scanner(System.in)).nextBoolean();
            }
            catch(InputMismatchException e) {
                System.out.println();
                System.out.println("Les seules options possible sont : TRUE or FALSE !!");
                System.out.println();
                ok=false;

            }

        }while (!ok);
        return choix;
    }

    public static int saisieInt() {
        boolean ok=true;
        int nb=0;
        do {

            ok=true;
            try {
                nb=new Scanner(System.in).nextInt();

            }
            catch(InputMismatchException e) {
                System.out.println("Vous n'avez pas entrez un nombre ENTIER, recommencez !");
                ok=false;
            }
        }while(! ok);

        return nb;

    }

}

