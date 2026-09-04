import java.util.Scanner;

public class exercicio25 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero = 1;
        double soma = 0;
        int quantidade = 0;

        while(numero != 0){
            System.out.println("Informe um numero");
            numero = scanner.nextDouble();

          
            if(numero !=0){
                quantidade ++;
                soma += numero;
            }
        }

        double media = soma / quantidade;
    
        System.out.println("A media dos numeros informados é " + media);
        scanner.close();
    }
}
