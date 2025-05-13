import java.util.Scanner;

public class Uni6Exe02 {
    public static double[] lerValores() {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[12];

        System.out.println("Digite 12 números reais: ");

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite " + (i + 1) + "º número: ");
            valores[i] = scanner.nextDouble();
        }

        return valores;
    }

    public static double media(double[] valores) {
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma / valores.length;
    }

    public static void maior(double[] valores, double media) {
        System.out.println("Os números maiores que a média " + media + " são: ");
        for (double valor : valores) {
            if (valor > media) {
                System.out.print(valor + " ");
            }
        }
        System.out.println(); // Add a newline for better formatting
    }

    public static void main(String[] args) {
        double[] valores = lerValores();
        double media = media(valores);
        maior(valores, media);


        
    }
}

