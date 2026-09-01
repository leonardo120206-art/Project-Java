import java.util.Scanner;

public class exercicio15 {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe uma distancia em KM");
        double distancia = ler.nextDouble();

        System.out.println("Informe o tempo percorrido da distancia em horas");
        double horas = ler.nextDouble();

        double velocidade = distancia / horas;

        System.out.println("Ele levou " + horas + " horas para percorrer " + distancia + "Km então a velocidade média foi " + velocidade + 8"Km por hora");

        ler.close();
    }


}
