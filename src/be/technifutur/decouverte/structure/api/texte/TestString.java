package be.technifutur.decouverte.structure.api.texte;

public class TestString {

    public static void main(String[] args) {
        testEgalite();
        testStringBuilder();
        testStringBloc();
        testCaractereSpeciaux();
        testStringFormat();

    }

    private static void testStringFormat(){
        String s = String.format(" (%2$s) ++ %1$15s %s","1",23);
        System.out.println(s);
        System.out.printf(" (%2$s) ++ %1$15s","1",23);
        testauPassage(4,5,7,8,9,8,2,7);
    }

    private static void  testauPassage(int...i){
        System.out.println(i[1]);
    }

    private static void testCaractereSpeciaux(){
        String s = " \t ";
        String dir = new String("Path c:\\Users\\doc");
        System.out.println(dir);
    }

    private static void testStringBloc(){
        String s = """
                \"petite\" texte 
                en plusieurs 
                lignes.
                """;
        System.out.println(s);
    }

    private static void testStringBuilder() {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder("to");

        builder2.append("dede");
        builder2.append("lulu")
                .replace(2,5,"nouveau texte")
                .append(20);

        String s = builder2.toString();
    }

    private static void testEgalite(){
        String s = "toto";
        String s2 = "toto";
        String a = "to";
        String b = a + a;

        System.out.println(s == b); //false
        System.out.println(s == s2); //true
        System.out.println(s.equals(b)); //true
        System.out.println(s.equalsIgnoreCase("TOTO")); //true

    }
}
