package Unidade03;

import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura das dimensões do terreno
        int largura = scanner.nextInt();
        int comprimento = scanner.nextInt();
        
        // Calculando a área do terreno
        int area = largura * comprimento;
        
        // Exibindo a área
        System.out.println(area);
        
        scanner.close();
    }
}
