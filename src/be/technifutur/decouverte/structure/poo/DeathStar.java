package be.technifutur.decouverte.structure.poo;

public class DeathStar {

    public void attireVaisseau(VaisseauAncetre v) {
        if(v instanceof Millenium){
            this.attireVaisseau((Millenium) v);
        }else if (v instanceof  Xwing x){
            attireVaisseau(x);
        }
        System.out.println("DeathStar.attireVaisseau");
        v.Landing();
        v.afficherCamps();
        v.tirer();
        v.TakeOff();
    }

    public void attireVaisseau(Millenium m){
        m.Landing();
        m.afficherCamps();
        System.out.println("A l'aide Obiwan");
        m.TakeOff();
        m.vitesseLumiere();
    }

    public void attireVaisseau(Xwing m){
        m.Landing();
        m.afficherCamps();
        System.out.println("Gaaaarde à vous Darklord");
        m.TakeOff();

    }
}
