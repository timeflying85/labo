package be.technifutur.decouverte.structure.collection.iterator;

import be.technifutur.decouverte.structure.collection.data.Personne;

import java.util.*;

public class MapDecouverte {

    public static void main(String[] args) {

        Map<Integer, Personne> maMap = new LinkedHashMap<>();
      //  Map<Integer, Personne> maMap = new HashMap<>();
      //  Map<Integer, Personne> maMap = new TreeMap<>();

        for(Personne p : Personne.dataTest()){
            maMap.put(p.getAge(), p);
        }

        /*for (Integer i : maMap.keySet() ){
            System.out.printf("age; %s, personne : %s%n", i, maMap.get(i));
        }*/

        Map<Integer, Set<Personne>> calendrier = new TreeMap<>();
        for(Personne p : Personne.dataTest()){
            int age = (p.getAge()/10)*10;  // on divise(modulo) l'age trouvé par 10 (ex:39/10 = 3) car en java division entière et un multiplie par 10 (3x10=30)
            Set<Personne> set = calendrier.get(age); // on crée un espace dans le set
            if(set == null){
                set = new HashSet<>();
                calendrier.put(age, set);
            }
            set.add(p);

        }

        for (Integer i : calendrier.keySet() ){
            System.out.printf("age; %s, personne : %s%n", i, calendrier.get(i));
        }


    }
}
