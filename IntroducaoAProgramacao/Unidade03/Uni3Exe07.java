package Unidade03;

import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura das quantidades de cada formato
        int quantidade350ml = scanner.nextInt();
        int quantidade600ml = scanner.nextInt();
        int quantidade2L = scanner.nextInt();
        
        // Calculando a quantidade total de litros
        double totalLitros = quantidade350ml * 0.350 + quantidade600ml * 0.600 + quantidade2L * 2.0;
        
        // Exibindo a quantidade total de litros
        System.out.printf("O cliente comprou ao total %.2f litros.\n", totalLitros);
        
        scanner.close();
    }
}
