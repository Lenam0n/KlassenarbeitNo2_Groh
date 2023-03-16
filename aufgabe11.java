public class aufgabe11 {
    public static void main(String[] args) {
        double[] strecken = {50.0,60.0,90.0};
        double[] geschwindigkeiten = {150.0,120.0,90.0};
        int n = strecken.length;
        double buffer_1 = 0.0;
        double buffer_2 = 0.0;
        double buffer_3;


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
