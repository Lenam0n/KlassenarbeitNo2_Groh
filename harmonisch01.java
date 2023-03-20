public class harmonisch01 {
    public static void main(String[] args) {

        //Eingabe
        double x1 = 12.0;
        double x2 = 80;
        double n = 2.0;
        double result;

        //Verarbeitung
        result = 2/(1 / x1 + 1 / x2);

        //Ausgabe
        System.out.println("Harmonisches Mittel 1.0 Version");
        System.out.println("x1           = " + x1);
        System.out.println("x2           = " + x2);
        System.out.println("n            = " + n);
        System.out.println("xharmonisch  = " + result);

    }
}
