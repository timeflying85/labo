package be.technifutur.decouverte.structure.structure;

import java.util.Random;

public class TableauCarreMagique {

    public static void main(String[] args) {
        int [][]tab=new int[3][3];
        int nb;
        int lig;
        int col;
        int somme=0;
        int sommeC=0;
        int sommeD=0, sommeD1=0;
        boolean magic=true;
        int cpt=0;
        do {cpt++;

            for (lig=0;lig<3;lig++) {
                for (col=0;col<3;col++) {
                    Random r=new Random();
                    nb=r.nextInt(2);
                    tab[lig][col]=nb;
                    System.out.print(tab[lig][col]+" \t ");

                }
                System.out.println(" ");
            }

            for (lig=0;lig<3;lig++) {
                for (col=0;col<3;col++) {
                    if (col==lig) {
                        sommeD=(sommeD+tab[lig][col]);
                    }
                    if ((col+lig)==2) {
                        sommeD1=(sommeD1+tab[lig][col]);
                    }
                }
            }
            if (sommeD==sommeD1) {
                magic=true;
            }
            else {
                magic=false;
            }





            for (col=0;col<3 && magic;col++) {
                for (lig=0;lig<3;lig++) {
                    somme=somme+tab[lig][col];
                }



                if (somme!=sommeD) {
                    magic=false;
                }
                somme=0;
            }


            for (lig=0;lig<3 && magic;lig++) {
                for (col=0;col<3;col++) {
                    sommeC=sommeC+tab[lig][col];
                }



                if (sommeD!=sommeC) {
                    magic=false;
                }
                sommeC=0;
            }





            if (magic==true) {
                System.out.println("Votre carré est un carré magique en "+cpt);
            }

            else {
                System.out.println("Votre carré n'est pas magique");
            }
        }while( !magic);
    }

}
