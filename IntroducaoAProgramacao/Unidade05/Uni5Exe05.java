import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite o valor de n (maior que 2): ");
            n = sc.nextInt();
        } while (n <= 2);

        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }

        System.out.println("Soma da série: " + soma);
        sc.close();
    }
}
