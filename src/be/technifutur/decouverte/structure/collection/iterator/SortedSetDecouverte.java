package be.technifutur.decouverte.structure.collection.iterator;

import be.technifutur.decouverte.structure.collection.data.Personne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDecouverte {

    public static void main(String[] args) {

        Personne[] datatest = Personne.dataTest();
        Comparator<Personne> monComparator = new NameComparator();
        SortedSet<Personne> monSet = new TreeSet<>(monComparator);
        monSet.addAll(Arrays.asList(datatest));

        for (Personne p : monSet){
            System.out.println(p);
        }


        Arrays.sort(datatest, monComparator);


    }
}
