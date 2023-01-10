package be.technifutur.decouverte.structure.poo;

public class Scenario2 {

    public static void main(String[] args) {
        VaisseauMethode v1 = new VaisseauMethode();
        VaisseauMethode v2 = new VaisseauMethode();
        VaisseauMethode v3 = new VaisseauMethode();

       v1.TakeOff();
       v2.TakeOff();
       v3.TakeOff();
       v2.addMisilles();


    }
}
