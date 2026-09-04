import java.util.Scanner;

public class exercicio26 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero = 1;
        double soma = 0;
        double maior = 0;
        double menor = 0;
        int quantidade = 0;

        while(numero != 0){
            System.out.println("Informe um numero");
            numero = scanner.nextDouble();

          
            if(numero !=0){
                quantidade ++;
                soma += numero;

                if(quantidade == 1){
                    maior = numero;
                    menor = numero;
                    } else{
                    if(numero > maior){
                    maior = numero;
                 }

                if (numero < menor){
                    menor = numero;
                 }

                }

            }
        }

        double media = soma / quantidade;
        
        System.out.println("A soma dos numeros informados é " + soma);
        System.out.println("A quantidade de numeros informados foi " + quantidade);
        System.out.println("O maior numero informado foi " + maior);
        System.out.println("O menor numero informado foi " + menor);
        System.out.println("A media dos numeros informados é " + media);
        scanner.close();
    }
}
