import java.util.Scanner;

public class exercicio20 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 10 até acertar o numero escolhido");
        double variavel = scanner.nextDouble();
        double numeroSecreto = 8;
        int tentativa = 1;
        if (variavel != numeroSecreto) {
            System.out.println("Você errou");
            }

        while (variavel != numeroSecreto) {
            System.out.println("Digite um numero:");
            variavel = scanner.nextDouble();
            if (variavel != numeroSecreto) {
                System.out.println("Você errou");
            }
            tentativa++;
        } 
        
        System.out.println("Parabéns você acertou o numero escolhido é o " + numeroSecreto);
        System.out.println("Você precisou de " + tentativa + " tentativas");


        scanner.close();
 
        }

    }

