package Unidade03;

import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dados do funcionário
        String nome = scanner.nextLine();
        int horasTrabalhadas = scanner.nextInt();
        int dependentes = scanner.nextInt();
        
        // Calculando o salário
        double salarioTrabalho = horasTrabalhadas * 10.00;
        double salarioFamilia = dependentes * 60.00;
        double salarioBruto = salarioTrabalho + salarioFamilia;
        
        // Calculando os descontos
        double inss = salarioTrabalho * 0.085;
        double impostoRenda = salarioTrabalho * 0.05;
        
        // Calculando o salário líquido
        double salarioLiquido = salarioBruto - inss - impostoRenda;
        
        // Exibindo os resultados
        System.out.printf("O funcionário %s possui um salário bruto de R$%.2f e um salário líquido de R$%.2f\n", nome, salarioBruto, salarioLiquido);
        
        scanner.close();
    }
}
