package be.technifutur.decouverte.structure.structure;

import static be.technifutur.decouverte.structure.structure.ListePersonne.ajouterPersonne;

public class RemplissageTab {
    public static void main(String[] args) {
        Personne[] tab = new Personne[10];
        int cpt = 0;

        for(cpt=0;cpt< tab.length;cpt++){
            ajouterPersonne();

        }
    }
}
