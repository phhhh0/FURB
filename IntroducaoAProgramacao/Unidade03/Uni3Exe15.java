package Unidade03;

import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do número inteiro
        int numero = scanner.nextInt();
        
        // Calculando as centenas, dezenas e unidades
        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;
        
        // Exibindo o resultado
        System.out.printf("%d centena(s) %d dezena(s) %d unidade(s)\n", centena, dezena, unidade);
        
        scanner.close();
    }
}
