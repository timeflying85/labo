package be.technifutur.decouverte.structure.poo;

import java.util.Objects;

public abstract class VaisseauAncetre {
    // variables d'instances
    protected int nbMisille = 5;
    private boolean inflight;
    static int Vaisseauinflight=0;
    static int Vaisseauonground=3;

    private String name = "test";

    // constructeur
    public VaisseauAncetre(int nbMisille){
        if(nbMisille>=0) {
            this.nbMisille = nbMisille;
        }
    }


    public abstract void afficherCamps();

    // méthode d'instance
    public void tirer(){
        if(this.nbMisille > 0){
            System.out.println("BADABOUM");
            this.nbMisille = this.nbMisille -1 ;
        }else{
            System.out.println("OutOut");
        }
    }

    // accesseur en lecture
    public int getnbMissiles(){
        return this.nbMisille;
    }

    public void addMisilles(){
        if(this.nbMisille + nbMisille >= 0){
            this.nbMisille += nbMisille;
        }
    }

    public void recharger(){
        if(this.nbMisille == 0){
            System.out.println("Empty, Reload");
            this.nbMisille = this.nbMisille +7;
            System.out.println("Fully loaded");
        }
    }

    //accesseur
    public boolean isInflight(){
        return inflight;
    }

   /* @Override
    public String toString(){
        return "VaisseauAncetre { "+"nbMisille = "+nbMisille+" , enVol"+inflight+" }";
    } */

    public void TakeOff(){

        if(!inflight) {
            System.out.println("Ready for departure, proceed to takeoff");
            inflight = true;
            Vaisseauinflight++;
            Vaisseauonground--;
            System.out.println("/ Nbr de vaisseau de la flotte en vol : "+Vaisseauinflight+" , et Nbr de vaisseau au sol : "+Vaisseauonground);
            System.out.println("");
        }else{
            System.out.println("Already airborn");
            System.out.println("");
        }
    }

    public void Landing() {

        if (inflight) {
            System.out.println("Termination of flight, proceed to landing");
            inflight = false;
            Vaisseauinflight--;
            Vaisseauonground++;
            System.out.println("Nbr de vaisseau de la flotte en vol : " + Vaisseauinflight + " / Nbr de vaisseau au sol : " + Vaisseauonground);
            System.out.println("");
        } else {
            System.out.println("Still on the ground so cannot land");
            System.out.println("");
            inflight = true;
        }
    }

    /* ecrit à la main
    @Override
    public boolean equals(Object other){
        boolean egal = other != null;
        if (egal){
            egal = this.getClass() == other.getClass();
            if(egal){
                VaisseauAncetre v = (VaisseauAncetre)  other;
                egal = this.inflight == v.inflight && this.nbMisille == v.nbMisille;
            }
        }
        return egal;
    } */

    // géneré par intelliJ via code -> generate -> equals() and hashcode()
   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VaisseauAncetre that = (VaisseauAncetre) o;

        if (nbMisille != that.nbMisille) return false;
        return inflight == that.inflight;
    }

    @Override
    public int hashCode() {
        int result = nbMisille;
        result = 31 * result + (inflight ? 1 : 0);
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VaisseauAncetre that = (VaisseauAncetre) o;

        if (nbMisille != that.nbMisille) return false;
        if (inflight != that.inflight) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = nbMisille;
        result = 31 * result + (inflight ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}