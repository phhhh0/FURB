package Unidade03;

import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do preço do par de sapatos
        double preco = scanner.nextDouble();
        
        // Calculando o valor do desconto
        double desconto = preco * 0.12;
        
        // Calculando o preço com desconto
        double precoComDesconto = preco - desconto;
        
        // Exibindo os resultados
        System.out.printf("O valor do desconto é de R$%.2f\n", desconto);
        System.out.printf("O preço do par de sapatos com desconto é R$%.2f\n", precoComDesconto);
        
        scanner.close();
    }
}
