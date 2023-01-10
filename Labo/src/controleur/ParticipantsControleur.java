package controleur;

import listePersonne.Participants;

import java.util.LinkedList;
import java.util.Scanner;

public class ParticipantsController {

    LinkedList<Participants> partList;

    public ParticipantsController(LinkedList<Participants> partList) {
        this.partList = partList;
    }

    public Participants createParticipants() {

        //String option = "o";
        Participants tmp;
        Scanner sc1 = new Scanner(System.in);

        //System.out.println("Voulez-vous rentrez un nouveau participants : o/n ");
        //option = sc1.nextLine();
        //System.out.println(option);
        //while (option.equals("o")) {
        tmp = saisirParticipant();
        ajouterParticipant(tmp);
        //System.out.println("Voulez-vous rentrez un nouveau participants : o/n ");
        //sc1 = new Scanner(System.in);
        //option = sc1.nextLine();

        System.out.println("il y a "+getNumberOfParticipants()+" Participants inscrits");
        System.out.println("le nom des participants sont : "+partList.toString());
        System.out.println("");
        return tmp;
    }




    private void ajouterParticipant(Participants p){

        partList.add(p);
        // return participants;

    }


    private Participants saisirParticipant() {
        Participants p = new Participants();

        System.out.println("Entrez nom du participant : ");
        p.setName((new Scanner(System.in)).nextLine());
        System.out.println("Entrez prenom du participant : ");
        p.setPrenom((new Scanner(System.in)).nextLine());


        return p;
    }

    public Participants getParticipant(int index) {

        // Retourne le participant à l'index spécifié de la liste
        return partList.get(index);
    }

    private int getNumberOfParticipants() {
        // Retourne le nombre de participants dans la liste
        return partList.size();
    }

    public void listeParticipants (){
        int i = 0;

        for (Participants p : partList){
            System.out.println(++i +". "+p);

        }
        System.out.println("");
    }



}
