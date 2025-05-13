package Unidade03;

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do peso do prato
        double peso = scanner.nextDouble();
        
        // Calculando o valor a pagar
        double valor = peso * 25;
        
        // Exibindo o valor do prato
        System.out.printf("O valor do prato do cliente é R$%.2f\n", valor);
        
        scanner.close();
    }
}
