import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = sc.nextDouble();

            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        sc.close();
    }
}
