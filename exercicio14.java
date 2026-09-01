import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um valor em reais para converter para dolar");
        double reais = ler.nextDouble();

        System.out.println("Informe um valor para taxa de cambio");
        double cambio = ler.nextDouble();

        double dolar = reais / cambio;

        System.out.println(reais +  " reais á uma taxa de cambio de " + cambio + 
        " é igual a: " + dolar + " doláres");

        ler.close();
    }

}
