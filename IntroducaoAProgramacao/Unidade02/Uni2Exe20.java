import java.util.Scanner;

public class QuadradosDobras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de dobras: ");
        int dobras = sc.nextInt();

        int quadrados = (int) Math.pow(4, dobras / 2);

        System.out.println("Número de quadrados visíveis: " + quadrados);
        sc.close();
    }
}
