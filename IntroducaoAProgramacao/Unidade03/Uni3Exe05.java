package Unidade03;

import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura da quantidade de frangos
        int numFrangos = scanner.nextInt();
        
        // Calculando o gasto total
        double gastoTotal = numFrangos * (4.00 + 3.50 * 2);
        
        // Exibindo o resultado
        System.out.printf("O gasto total para marcar %d é R$%.1f\n", numFrangos, gastoTotal);
        
        scanner.close();
    }
}
