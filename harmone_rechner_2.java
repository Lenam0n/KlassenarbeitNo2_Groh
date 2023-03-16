import java.util.Scanner;

public class harmone_rechner_2 {
    public static void main(String[] args) {
        System.out.println("anzahl Strecken");
        int anzahlStrecken = new Scanner(System.in).nextInt();
        System.out.println("anzahl geschwindigkeiten");
        int anzahlgeschw = new Scanner(System.in).nextInt();
        double[] strecken = new double[anzahlStrecken];
        double[] geschwindigkeiten = new double[anzahlgeschw];
        int n = strecken.length;
        double buffer_1 = 0.0;
        double buffer_2 = 0.0;
        double buffer_3;

        System.out.println("Strecken");
        for (int i = 0; i < anzahlStrecken; i++) {
            System.out.println("wert " + (i+1));
            double in = new Scanner(System.in).nextDouble();
            strecken[i] = in;
        }
        System.out.println("geschwindigkeiten");
        for (int i = 0; i < anzahlgeschw; i++) {
            System.out.println("wert " + (i+1));
            double in = new Scanner(System.in).nextDouble();
            geschwindigkeiten[i] = in;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Harmonisches Mittel 3.0");
        System.out.println("Strecken aufaddieren");

        for (int i = 0; i < n; i++) {
            System.out.println("g"+ (i+1) +"           = " + strecken[i]);
            buffer_1 = buffer_1 + strecken[i];
        }
        System.out.println("∑ gi         = " + buffer_1);

        System.out.println("Gewichtete Geschwindigkeiten aufaddieren");
        for (int i = 0; i < geschwindigkeiten.length; i++) {
            System.out.println("x"+ (i+1) +"           = " + geschwindigkeiten[i]);
            buffer_2 = buffer_2 + strecken[i] / geschwindigkeiten[i];
        }
        buffer_3 = buffer_1 / buffer_2;
        System.out.println("∑ gi/xi      = " + buffer_2);
        System.out.println("xharmonisch = " + buffer_3);



    }
}
