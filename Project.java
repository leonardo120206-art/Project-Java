import java.util.Scanner;


public class Project{
public static void main(String[] args) {

    Scanner neww = new Scanner(System.in);
    System.out.println("Qual seu nome? ");
    String nome = neww.nextLine();
    
    System.out.println("Qual sua idade? ");
    int idade = neww.nextInt();

    neww.nextLine();

    System.out.println("Qual sua cidade? ");
    String city = neww.nextLine();

    System.out.println("Qual sua Profissão? ");
    String profi = neww.nextLine();

    System.out.println("Olá " + nome);
    System.out.println("Sua idade é: " + idade);
    System.out.println("Sua cidade é: " + city);
    System.out.println("Sua profissão é: " + profi);

    neww.close();


}

}