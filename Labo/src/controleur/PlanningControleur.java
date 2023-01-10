package controleur;

import activite.Activite;
import activite.Planning;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class CreatePlanningControleur {

    Planning planning;

    public CreatePlanningControleur(Planning planning) {
        this.planning = planning;
    }

    /*public void addActivites(Activite a) {
        // Vérifie si l'emplacement choisi est disponible
        planning.getPlanning().add(a);
       if (planning.getPlanning()[day][hour] == null) {
            // Ajoute l'activité au planning
            planning.getPlanning()[day][hour] = activity;
        } else {
            System.out.println("Emplacement déjà pris, veuillez en choisir un autre.");
        }
    }*/

    /*public Activite getActivity(int day, int hour) {
        // Retourne l'activité à l'emplacement spécifié du planning
        return planning.getPlanning()[day][hour];
    }

    public void removeActivity(int day, int hour) {
        // Supprime l'activité à l'emplacement spécifié du planning
        planning.getPlanning()[day][hour] = null;
    }*/

    public void init(){
        System.out.println("" +
                "" +
                "██████╗ ██╗      █████╗ ███╗   ██╗███╗   ██╗██╗███╗   ██╗ ██████╗ \n" +
                "██╔══██╗██║     ██╔══██╗████╗  ██║████╗  ██║██║████╗  ██║██╔════╝ \n" +
                "██████╔╝██║     ███████║██╔██╗ ██║██╔██╗ ██║██║██╔██╗ ██║██║  ███╗\n" +
                "██╔═══╝ ██║     ██╔══██║██║╚██╗██║██║╚██╗██║██║██║╚██╗██║██║   ██║\n" +
                "██║     ███████╗██║  ██║██║ ╚████║██║ ╚████║██║██║ ╚████║╚██████╔╝\n" +
                "╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚═╝╚═╝  ╚═══╝ ╚═════╝ \n" +
                "                                                                  \n" +
                " █████╗  ██████╗████████╗██╗██╗   ██╗██╗████████╗███████╗███████╗ \n" +
                "██╔══██╗██╔════╝╚══██╔══╝██║██║   ██║██║╚══██╔══╝██╔════╝██╔════╝ \n" +
                "███████║██║        ██║   ██║██║   ██║██║   ██║   █████╗  ███████╗ \n" +
                "██╔══██║██║        ██║   ██║╚██╗ ██╔╝██║   ██║   ██╔══╝  ╚════██║ \n" +
                "██║  ██║╚██████╗   ██║   ██║ ╚████╔╝ ██║   ██║   ███████╗███████║ \n" +
                "╚═╝  ╚═╝ ╚═════╝   ╚═╝   ╚═╝  ╚═══╝  ╚═╝   ╚═╝   ╚══════╝╚══════╝ \n" +

                "                                                                  ");
    }


}
