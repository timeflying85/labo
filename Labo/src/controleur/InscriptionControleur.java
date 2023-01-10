package controleur;

import activite.Activite;
import listePersonne.Participants;

import java.util.LinkedList;
import java.util.Scanner;

public class InscriptionController {
    ActiviteController ac;
    LinkedList<Activite> aList;

    public InscriptionController(ActiviteController ac, LinkedList<Activite> aList) {
        this.aList = aList;
        this.ac = ac;
    }

    public void addParticipantToActivities(Participants p){
        int userentry = 0;
        int quitter = aList.size() + 1;
        Scanner scan = new Scanner(System.in);

        while (userentry != quitter){
            ac.listActivity();
            System.out.println(quitter + ". Quitter\n");
            System.out.println("A quelle(s) activité(s) voulez-vous ajouter le participant");
            try {
                userentry = Integer.parseInt(scan.nextLine());
                if (userentry > 0 && userentry <= aList.size())
                {
                    System.out.println("Le participant a bien été inscrit à l'activité");
                    System.out.println("");
                }
                else if (userentry < 1 || userentry > quitter )
                    System.out.println("Entrée invalide");
                System.out.println("");
            }
            catch (NumberFormatException n){
                System.out.println("Entrée invalide !");
                System.out.println("");
            }
        }
    }



}
