package Unidade03;

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura da temperatura em Celsius
        double temperaturaCelsius = scanner.nextDouble();
        
        // Calculando a temperatura em Fahrenheit
        double temperaturaFahrenheit = (9.0 / 5.0) * temperaturaCelsius + 32;
        
        // Exibindo o valor em Fahrenheit
        System.out.printf("%.2f\n", temperaturaFahrenheit);
        
        scanner.close();
    }
}
