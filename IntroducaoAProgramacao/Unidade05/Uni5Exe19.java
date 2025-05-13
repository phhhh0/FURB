import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        while (true) {
            System.out.print("Valor da compra: ");
            double valor = sc.nextDouble();
            if (valor == 0) break;

            double desconto = valor > 500 ? 0.20 : 0.15;
            double valorFinal = valor - (valor * desconto);

            System.out.printf("Valor a pagar: R$%.2f%n", valorFinal);
            total += valorFinal;
        }

        System.out.printf("O valor total recebido foi de R$%.2f%n", total);
        sc.close();
    }
}
