package be.technifutur.decouverte.structure.constructeur;

public class TestConstructeur {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c);
    }
}
class C extends B{
        int cpt;

        C(){
            super(getval()); // SI pas de paramètre, optionnel car si pas écrit, le compilateur l'induit automatiquement, voir class A
            System.out.println("C.C");
            //text = "toto";
        }

        private static int getval() {
            return 5;
        }

        @Override
        public String toString() {
            return "C{"+
                    "cpt=" + cpt +
                    ", flag=" + flag +
                    ", text=" + text + '\'' +
                    '}';
        }
}

class B extends A {
        // début phase 3
        // à ce moment not et flag ont leur valeur par défaut
        boolean not = this.getFlag(); // this existe et compile automatiquement si pas écrit
        boolean flag = true;


    private boolean getFlag() {
        System.out.println(flag);
        return !flag;
    }

    {
        System.out.println("not : "+ not);
    }

        B(int val){
            super(val);
            System.out.println("B.B");
            //text = "dede";
        }
}

class A {
        String text = "rené";
        //initialisateur d'instance

    {
        text ="Alain";
    }

        A(int val){
            //super(); // 1er ligne par défaut
            System.out.println("A.A");
            text = "cucu" + String.valueOf(val); //String.valueOf() est inclu automatiquement si pas écrit
        }

        A(){
            this(25);
            text = "beber";
        }

}

