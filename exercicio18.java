import java.util.Scanner;

public class exercicio18 {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do funcionario?");
        String nome = ler.nextLine();

        System.out.println("Qual o cargo do funcionario?");
        String cargo = ler.nextLine();

        System.out.println("Qual o salário do funcionario?");
        double salario = ler.nextDouble();
        
        System.out.println("Quanto ele recebeu de horas extras?");
        double horaExtra = ler.nextDouble();

        System.out.println("Quanto foi descontado do funcionario?");
        double descontado = ler.nextDouble();

        System.out.println("Quanto foi descontado do funcionario sobre o INSS?");
        double inss = ler.nextDouble();

        double salarioBruto = salario + horaExtra;
        double salarioLiquido = salarioBruto - descontado - inss;

        System.out.println("HOLERITE");
        System.out.println("NOME: " + nome);
        System.out.println("CARGO: " + cargo);
        System.out.println("SALARIO BASE: R$" + salario);
        System.out.println("HORAS EXTRAS: R$" + horaExtra);
        System.out.println("DESCONTOS: R$" + descontado);
        System.out.println("INSS: " + inss);

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Salário Liquido: R$" + salarioLiquido);

        ler.close();

    }

}
