public class harmonisch02 {
    public static void main(String[] args) {
        //Eingabe
        double[] werte = {5,15,55,575,1275,7895};
        double n = werte.length;
        double result;

        //Verarbeitung
            System.out.println("Harmonisches Mittel 2.0 Version");

        for (int i = 0; i < n; i++) {
            System.out.println("x"+ i +"           = " + werte[i]);
        }

        result = n/(1.0 / werte[0] + 1.0 / werte[1] + 1.0 / werte[2] + 1.0 / werte[3] + 1.0 / werte[4] + 1.0 / werte[5]);

        //Ausgabe
        System.out.println("xharmonisch  = " + result);
    }
}
