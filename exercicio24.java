import java.util.Scanner;

public class exercicio24 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int soma = 0;

        while(numero != 0){
            System.out.println("Informe um numero");
            numero = scanner.nextInt();

            if(numero !=0){
                soma += numero;
            }
        }
    
        System.out.println("A soma de todos os valores informados é igual a: " + soma);
        scanner.close();
    }
}
