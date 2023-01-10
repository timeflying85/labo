package be.technifutur.decouverte.structure.poo;

public class VaisseauMethode {
    // variables d'instances
    private int nbMisille = 7;
    private boolean inflight;
    static int Vaisseauinflight=0;
    static int Vaisseauonground=3;

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


    public void Landing(){

        if(inflight) {
            System.out.println("Termination of flight, proceed to landing");
            inflight = false;
            Vaisseauinflight--;
            Vaisseauonground++;
            System.out.println("Nbr de vaisseau de la flotte en vol : "+Vaisseauinflight+" / Nbr de vaisseau au sol : "+Vaisseauonground);
            System.out.println("");
        }else{
            System.out.println("Still on the ground so cannot land");
            System.out.println("");
            inflight = true;
        }
    }


}
