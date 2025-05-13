import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número total de reabastecimentos: ");
        int n = sc.nextInt();

        double somaKmPorLitro = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Parada " + i + " - Quilometragem: ");
            double km = sc.nextDouble();
            System.out.print("Parada " + i + " - Combustível (litros): ");
            double litros = sc.nextDouble();

            double rendimento = km / litros;
            somaKmPorLitro += rendimento;

            System.out.printf("Parada %d: %.2f km por litro%n", i, rendimento);
        }

        double media = somaKmPorLitro / n;
        System.out.printf("Quilometragem média obtida por litro: %.2f%n", media);
        sc.close();
    }
}
