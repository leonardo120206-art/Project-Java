import java.util.Scanner;

public class exercicio17 {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um comprimento em metros");
        double comprimento = ler.nextDouble();

        double centimetros = comprimento * 100;
        double milimetros = comprimento * 1000;

        System.out.println(comprimento + " metros é igual a " + 
        centimetros + " centimetros que também é igual " + milimetros + " milimetros");

        ler.close();
        

    }


}
