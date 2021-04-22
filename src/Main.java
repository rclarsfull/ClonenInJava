import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String [] args) throws CloneNotSupportedException{
        TestObjekt a=new TestObjekt();

        System.out.println("Erstes objekt erstellt:\n "+a.toString());

        TestObjekt b=a;

        System.out.println("Zweites Objekt erstellt durch Zuweisugsoperator: \n"+a.toString()+"\n"+b.toString());



        System.out.println("Erstes Objekt verändert: \n"+a.toString()+"\n"+b.toString());
        System.out.println("Warum ändert sich das zweite Objekt auch mit??");
        System.out.println("Der Zuweisugsoperator macht nur eine Kopie von der Referrenzvariable nicht von deem Objekt selber.\n" +
                        "Die Referenzvariable ist nur ein Zeiger oder Pointer der aud die Stelle im Speicher zeigt in welcher des Objekt gespeichert ist. \n"+
                "Wenn also das Objekt über die eine Referenzvariable verändert wird, dann ändert sich auch der Wert auf welche die andere Referanzvariable deutet" +
                "\nda es im endeffekt die selbe Speicheradresse ist auf die die beiden Refernzvariabeln deuten.");


        System.out.println("\n\nWie Wir es Verhindern: Clonen\n");

        TestObjektClonable c=new TestObjektClonable();
        System.out.println("Erstes Clonable-Objekt erstellt:\n "+c.toString());

        TestObjektClonable d= (TestObjektClonable) c.clone();
        System.out.println("Zweites Objekt erstellt durch Clonen erstellt: \n"+c.toString()+"\n"+d.toString());

        c.a=1234;
        c.b=56456623;

        System.out.println("Erstes Objekt verändert: \n"+c.toString()+"\n"+d.toString());
        System.out.println("in der Fachsprache nennt man Kopien mittels dem Zuweisungsoperator Shallow-Copies und geclonte kopien Deep-Copies");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.println("Jetzt mal andere Datentypen als Beispiel:");

        ArrayList<String> strings=new ArrayList<>();
        strings.add("a");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        for (String s:strings) {
            System.out.println(s);
        }
        System.out.println();
        ArrayList<String> stringsZuweisungsoperator=strings;
        ArrayList<String> stringsGeklont= (ArrayList<String>) strings.clone();

        strings.add("f");
        for (String s:strings) {
            System.out.println(s);
        }
        System.out.println();
        for (String s:stringsZuweisungsoperator) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Wieder der selbe Fehler (Hat mich schon mehre Tage debugging gekostet, weil ich das darmals nicht gewusst hab.\n"
        +"Geclont ist der fehler nicht da: ");
        for (String s:stringsGeklont) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------------------------------------------------------------------");

        Date datum=new Date();
        datum.setYear(2000);
        System.out.println("Kopiervorlage: "+datum.getYear());
        Date datumZuweisungsoperator=datum;
        Date datumgeClont=(Date) datum.clone();
        datum.setYear(2020);
        System.out.println("veränderte Kopiervorlage: "+datum.getYear());
        System.out.println("ZuweisungsOperator: "+datumZuweisungsoperator.getYear());
        System.out.println("Geclont: "+datumgeClont.getYear());




    }
}
