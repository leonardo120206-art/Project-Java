import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero = 0;
        double menor = 0;


        for(int i =0; i < 5; i++){
            System.out.println("Informe um numero");
            double a = scanner.nextDouble();

            if(i == 0){
                numero = a;
                menor = a;
            }

            else if(a > numero){
                numero = a;
            }

            if(a < menor){
                menor = a;
            }
        }

        System.out.println("o maior numero é o " + numero);
        System.out.println("o menor numero é o " + menor);
        scanner.close();

    }
}

