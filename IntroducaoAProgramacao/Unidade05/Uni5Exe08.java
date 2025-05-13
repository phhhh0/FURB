import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();

        int menorNegativo = 0;
        boolean temNegativo = false;

        int somaPositivos = 0;
        int countPositivos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            int valor = sc.nextInt();

            if (valor < 0) {
                if (!temNegativo || valor < menorNegativo) {
                    menorNegativo = valor;
                    temNegativo = true;
                }
            } else if (valor > 0) {
                somaPositivos += valor;
                countPositivos++;
            }
        }

        if (temNegativo)
            System.out.println("Menor valor negativo: " + menorNegativo);
        else
            System.out.println("Nenhum valor negativo informado.");

        if (countPositivos > 0)
            System.out.println("Média dos números positivos: " + (double)somaPositivos / countPositivos);
        else
            System.out.println("Nenhum número positivo informado.");

        sc.close();
    }
}
