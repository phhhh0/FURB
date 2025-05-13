import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a massa inicial (em Kg): ");
        double massa = sc.nextDouble();
        double massaGramas = massa * 1000;
        double massaFinal = massaGramas;
        int tempo = 0;

        while (massaFinal >= 0.5) {
            massaFinal /= 2;
            tempo += 50;
        }

        System.out.printf("Massa inicial: %.3fg%n", massaGramas);
        System.out.printf("Massa final: %.3fg%n", massaFinal);
        System.out.printf("Tempo necessário: %d segundos%n", tempo);
        sc.close();
    }
}
