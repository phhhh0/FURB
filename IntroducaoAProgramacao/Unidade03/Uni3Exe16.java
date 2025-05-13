package Unidade03;

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do valor total da compra e do valor dado pelo cliente
        int valorCompra = scanner.nextInt();
        int valorPago = scanner.nextInt();
        
        // Calculando o troco
        int troco = valorPago - valorCompra;
        
        // Calculando o número de notas
        int notas100 = troco / 100;
        troco %= 100;
        int notas10 = troco / 10;
        troco %= 10;
        int notas1 = troco;
        
        // Exibindo o resultado
        System.out.println("O número mínimo de notas de troco é: " + (notas100 + notas10 + notas1));
        System.out.println("Quantidade de notas de 100 necessárias é: " + notas100);
        System.out.println("Quantidade de notas de 10 necessárias é: " + notas10);
        System.out.println("Quantidade de notas de 1 necessárias é: " + notas1);
        
        scanner.close();
    }
}
