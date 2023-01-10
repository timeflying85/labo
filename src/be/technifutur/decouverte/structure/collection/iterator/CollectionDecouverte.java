package be.technifutur.decouverte.structure.collection.iterator;

import be.technifutur.decouverte.structure.collection.data.Personne;

import java.util.*;

public class CollectionDecouverte {

    public static void main(String[] args) {
        Personne[] personneTab = Personne.dataTest();
        Collection<Personne> personneCollection = new LinkedHashSet<>();

        for(Personne p : personneTab){
            System.out.println(personneCollection.add(p));
        }

        /*System.out.println(personneCollection.add(personneTab[0]));
        System.out.println(personneCollection.add(personneTab[0]));
        System.out.println(personneCollection.add(personneTab[1]));

        System.out.println(personneCollection.contains(personneTab[3]));*/

        for (Personne p : personneCollection){
            System.out.println(p);
        }
    }
}
