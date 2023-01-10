package be.technifutur.decouverte.structure.poo;

public class Clone extends Empire{

    public Clone(){
        this("Clone");
    }

    public Clone(String nom){
        super(nom);
    }

    public void combattre(){
        System.out.println("Je combats comme tout les autres clones, sans réfléxion");
    }
}
