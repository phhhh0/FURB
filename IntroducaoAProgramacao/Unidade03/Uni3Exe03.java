package Unidade03;

import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do preço do litro de gasolina e do valor do pagamento
        double precoLitro = scanner.nextDouble();
        double valorPagamento = scanner.nextDouble();
        
        // Calculando os litros abastecidos
        double litrosAbastecidos = valorPagamento / precoLitro;
        
        // Exibindo a quantidade de litros
        System.out.printf("O motorista conseguiu colocar: %.2f litros.\n", litrosAbastecidos);
        
        scanner.close();
    }
}
