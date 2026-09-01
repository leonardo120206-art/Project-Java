import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int numeroUm = ler.nextInt();

        System.out.println("Digite outro numero ");
        int numeroDois = ler.nextInt();

        int soma = numeroUm + numeroDois;
        int subtracao = numeroUm - numeroDois;
        int multiplicacao = numeroUm * numeroDois;
        int divisao = numeroUm / numeroDois;

        System.out.println("A soma dos dois numeros é igual á: " + soma);
        System.out.println("A subtracao dos dois numeros é igual á: " + subtracao);
        System.out.println("A multiplicacao dos dois numeros é igual á: " + multiplicacao);
        System.out.println("A divisão do numero " + numeroUm + " por " + numeroDois + " é igual a: " + divisao);
        
        ler.close();

    }

}
