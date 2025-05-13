import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.print("Número de dependentes: ");
        int dependentes = sc.nextInt();

      
        double salarioTrabalho = horasTrabalhadas * 10.00;
        double salarioFamilia = dependentes * 60.00;
        double salarioBruto = salarioTrabalho + salarioFamilia;

      
        double descontoINSS = salarioTrabalho * 0.085;
        double descontoIR = salarioTrabalho * 0.05;
        double salarioLiquido = salarioBruto - (descontoINSS + descontoIR);

        System.out.println("\nNome: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
