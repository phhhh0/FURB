package Unidade03;

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura das notas
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        
        // Calculando a média ponderada
        double mediaPonderada = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
        
        // Exibindo a média
        System.out.printf("%.2f\n", mediaPonderada);
        
        scanner.close();
    }
}
