import java.util.Scanner;

public class exercicio23 {
        
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int positivo = 0;
        int negativo = 0;

        while(numero != 0){
            System.out.println("Informe um numero");
            numero = scanner.nextInt();

            if(numero != 0){

            if(numero >= 0){
                positivo ++;
            } else {
                negativo ++;
            }

            }
                
        }

        System.out.println(" O numero secreto é 0");
        System.out.println(positivo + " numeros que você digitou eram positivos");
        System.out.println(negativo + " numeros que você digitou eram negativos");

        scanner.close();
    
    }
    
}
