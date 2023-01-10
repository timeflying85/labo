package main;

import activite.Activite;
import activite.Planning;
import listePersonne.Participants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import static activite.Activite.ajouterActivite;
import static listePersonne.Participants.saisirParticipant;

public class Main {


    public static void main(String[] args) {

        System.out.println();

        Planning planning = new Planning();
        Activite activites = new Activite();
        //ajouterActivite();
        Participants participants = new Participants();

        saisirParticipant();
        ajouterActivite(activites);
        System.out.println("/");


    }

}











//   NE SOIS PAS TRISTE TIME!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!