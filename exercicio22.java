import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        int maior = 0;
        int menor = 0;
        int numero = 1;

        while (numero != 0) {

            System.out.println("Informe um número (digite 0 para parar):");
            numero = scanner.nextInt();

            if (numero != 0) {

                quantidade++;

                if (quantidade == 1) {
                    maior = numero;
                    menor = numero;
                } else {

                    if (numero > maior) {
                        maior = numero;
                    }

                    if (numero < menor) {
                        menor = numero;
                    }
                }
            }
        }

        System.out.println("Quantidade de números digitados: " + quantidade);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}