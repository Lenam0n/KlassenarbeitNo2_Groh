import java.util.Scanner;

public class harmone_rechner {
    public static void main(String[] args) {
        double result;
        double buffer = 0;
        System.out.println("wieviele");
        int anzahl = new Scanner(System.in).nextInt();
        for (int i = 0; i < anzahl ; i++) {
            System.out.println("Wert " + (i+1));
            double wert = new Scanner(System.in).nextInt();
            buffer = buffer + 1.0/wert;
        }
        result = anzahl/buffer;
        System.out.println(result);
    }
}
