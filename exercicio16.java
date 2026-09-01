import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor para o raio da esfera");
        double raio = ler.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("O volume da esfera é: %.2f%n", volume);

        ler.close();
    }
}