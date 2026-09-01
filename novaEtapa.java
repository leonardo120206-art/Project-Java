import java.util.Scanner;

public class novaEtapa {

    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    System.out.println("Qual seu nome? ");
    String nome = ler.nextLine();

    System.out.println("Qual sua idade? ");
    int idade = ler.nextInt();

    int ano = idade + 1;

    System.out.println("Olá " + nome);
    System.out.println("Sua idade é " + idade);
    System.out.println("Ano que vem sua idade será " + ano);
    
    ler.close();


    }
    
}
