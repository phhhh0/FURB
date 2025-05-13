package Unidade03;

import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura da distância percorrida e do tempo gasto
        double distancia = scanner.nextDouble();
        double tempo = scanner.nextDouble();
        
        // Calculando a velocidade média
        double velocidadeMedia = distancia / tempo;
        
        // Calculando o combustível gasto (o carro faz 12 km/l)
        double combustivelGasto = distancia / 12.0;
        
        // Exibindo os resultados
        System.out.printf("A velocidade média foi de %.2f km/h e a quantidade de combustível usado foi %.2f litros.\n", velocidadeMedia, combustivelGasto);
        
        scanner.close();
    }
}
