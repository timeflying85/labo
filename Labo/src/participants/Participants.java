package listePersonne;


import java.util.LinkedList;
import java.util.Scanner;

public class Participants {

    private String name;
    private String prenom;
    private float addition;

    public float getAddition() {
        return addition;
    }

    public void addPrice(float price){
        addition += price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public String toString() {
        return (name+" "+prenom+" / Somme à payer = "+ addition + " euros");
    }

//static LinkedList<Participants> participants = new LinkedList<>();


}
