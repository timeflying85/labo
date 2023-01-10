package controleur;

import activite.Activite;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.Scanner;

public class ActiviteController {

    LinkedList<Activite> aList;
    public ActiviteController(LinkedList<Activite> list) {
        this.aList = list;
    }

    public Activite createActivite(){

        //String option = "o";
        Activite a = new Activite();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy H:mm");
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Voulez-vous rentrez une nouvelle activité : o/n ");
        option = sc.nextLine();
        */

        //if (option.equals("o")){
        a.nom = saisirActivite();
        System.out.println("Entrez le prix de l'activité : ");
        a.price = Integer.parseInt(sc.nextLine());

        try {
            System.out.println("Entrez le début de l'activité (dd-MM-yyyy H:mm): ");
            LocalDateTime time = LocalDateTime.parse(sc.nextLine(), dateFormat);
            a.setStart(time);
        }
        catch (DateTimeParseException e) {
            a.setStart(null);
        }
        try {
            System.out.println("Entrez la fin de l'activité (dd-MM-yyyy H:mm): ");
            LocalDateTime time = LocalDateTime.parse(sc.nextLine(), dateFormat);
            a.setEnd(time);
        }
        catch (DateTimeParseException e) {
            a.setEnd(null);
        }



        aList.add(a);
        System.out.println(a.toString());
        System.out.println("");
        return a;
    }

    private static String saisirActivite() {

        System.out.println("Entrez nom de l'activité : ");
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    public void listActivity(){
        int i = 0;
        for (Activite a : aList)
            System.out.println(++i + ". " + a);
        System.out.println("");
        //itérer sur la linkedlist d'activités et comparer les dates
        // public Boolean check(LocaldateTime date1, LocaldateDateTime date2)
    }


    public LinkedList<Activite> deleteActivity(){
        Scanner scan = new Scanner(System.in);
        listActivity();
        System.out.println("Entrez numéro de l'activité que vous voulez supprimer ?");
        Object index = scan.nextLine();
        return aList;
    }


    public LinkedList<Activite> modifyActivity (){
        listActivity();
        return aList;
    }



    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy H:mm");
    String text = "12-03-2022 8:30";  // user input
    LocalDateTime sTime = LocalDateTime.parse(text, dateFormat);
    //System.out.println(sTime);
    //view
    DateTimeFormatter viewFormat = DateTimeFormatter.ofPattern("'Le' dd LLLL yyyy 'à' HH'h'mm");
    String view = sTime.format(viewFormat);
    //System.out.println(view);


}
