package Unidade03;

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura das dimensões da parede
        double altura = scanner.nextDouble();
        double comprimento = scanner.nextDouble();
        
        // Calculando a área da parede
        double area = altura * comprimento;
        
        // Calculando a quantidade de azulejos necessários
        int quantidadeAzulejos = (int)(area * 9);
        
        // Calculando o valor gasto com os azulejos
        double valorGasto = quantidadeAzulejos * 12.50;
        
        // Exibindo o valor final
        System.out.printf("O valor final é R$%.2f\n", valorGasto);
        
        scanner.close();
    }
}
