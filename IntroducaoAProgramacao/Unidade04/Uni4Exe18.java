import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do vencimento: ");
        int diaVencimento = scanner.nextInt();

        System.out.print("Digite o dia do pagamento: ");
        int diaPagamento = scanner.nextInt();

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        double valorFinal = valorPrestacao;

        if (diaPagamento <= diaVencimento) {
            valorFinal = valorPrestacao * 0.90;
            System.out.println("O pagamento está em dia.");
        } else if (diaPagamento <= diaVencimento + 5) {
            System.out.println("O pagamento está atrasado, mas dentro do período de tolerância.");
        } else {
            int diasAtraso = diaPagamento - diaVencimento;
            double multa = (diasAtraso - 5) * 0.02 * valorPrestacao;
            valorFinal += multa;
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso.");
        }

        System.out.printf("Valor da prestação = R$ %.2f%n", valorFinal);
        scanner.close();
    }
}