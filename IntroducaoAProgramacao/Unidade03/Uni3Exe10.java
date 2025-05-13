package Unidade03;

import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos catetos
        double cateto1 = scanner.nextDouble();
        double cateto2 = scanner.nextDouble();
        
        // Calculando a hipotenusa usando o teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        // Exibindo o comprimento da hipotenusa
        System.out.printf("A hipotenusa é: %.2f\n", hipotenusa);
        
        scanner.close();
    }
}
