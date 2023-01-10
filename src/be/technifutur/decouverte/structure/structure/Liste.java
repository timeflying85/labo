package be.technifutur.decouverte.structure.structure;

public class Liste {
    int valeur;
    Liste suivant;

    public static void main(String[] args) {
        Liste maliste = null;
        maliste = Push(maliste,5);
        maliste = Push(maliste,7);
        maliste = Push(maliste,9);
        maliste = Push(maliste,12);
        maliste = Push(maliste,18);
        maliste = Push(maliste,25);
        maliste = Push(maliste,54);
        affiche(maliste);
        maliste = Add(maliste,56,3);
        maliste = Add(maliste,0,6);
        System.out.println("");
        affiche(maliste);
        System.out.println("");
        affiche2(maliste,2);
        System.out.println("");
        affiche(maliste);
        System.out.println("");
        System.out.println(Get(maliste,0));
        System.out.println("");
        System.out.println(Taille(maliste));
        Modif(maliste,2,111);
        System.out.println("");
        affiche(maliste);
        System.out.println("");
        System.out.println(Get(maliste,2));
        Supp(maliste,8);
        System.out.println("");
        affiche(maliste);

    }

    public static int Taille(Liste l) {
        int longueur = 0;

        while (l != null) {
            longueur++;
            l = l.suivant;
        }
        return longueur;
    }

    public static void affiche(Liste l) {
        for (int cpt = 0; l != null; cpt++) {
            System.out.println("Valeur" + cpt + " : " + l.valeur);
            l = l.suivant;
        }
    }

    public static void affiche2(Liste l, int nb) {
        for (int cpt = 0; cpt < nb; cpt++) {
            System.out.println("Valeur" + cpt + " : " + l.valeur);
            l = l.suivant;
        }
    }

    public static Liste GoTo(Liste l, int pos) {
        for (int i = 1; i <= pos; i++) {
            l = l.suivant;
        }
        return l;
    }

    public static Liste Push(Liste l, int valeur) {
        Liste result;

        result = new Liste();
        result.valeur = valeur;
        result.suivant = l;

        return result;
    }

    public static Liste Pop(Liste l) {
        return l.suivant;
    }

    public static Liste Add(Liste l, int valeur, int pos) {
        Liste result = l;

        if (pos == 0) {
            result = Push(l, valeur);
        } else {
            l = GoTo(l, pos - 1);
            l.suivant = Push(l.suivant, valeur);
        }
        return result;
    }

    public static Liste Supp(Liste l, int pos) {
        Liste result = l;

        if (pos == 0) {
            result = Pop(l);
        } else {
            l = GoTo(l, pos - 1);
            l.suivant = Pop(l.suivant);
        }
        return result;
    }

    public static int Get(Liste l, int pos) {
        l = GoTo(l, pos);

        return l.valeur;
    }

    public static void Modif(Liste l, int pos, int valeur) {
        l = GoTo(l, pos);
        l.valeur = valeur;
    }

}



