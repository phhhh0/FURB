package Unidade03;

import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do valor em dólares e da cotação do dólar
        double valorDolares = scanner.nextDouble();
        double cotacaoDolar = scanner.nextDouble();
        
        // Calculando o valor em reais
        double valorReais = valorDolares * cotacaoDolar;
        
        // Exibindo o valor a ser devolvido
        System.out.printf("O atendente deve devolver R$%.2f para o cliente.\n", valorReais);
        
        scanner.close();
    }
}
