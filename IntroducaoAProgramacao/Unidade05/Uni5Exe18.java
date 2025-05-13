import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] canais = {4, 5, 9, 12};
        int[] audiencia = new int[4];
        int total = 0;

        while (true) {
            System.out.print("Canal: ");
            int canal = sc.nextInt();
            if (canal == 0) break;

            System.out.print("Pessoas assistindo: ");
            int pessoas = sc.nextInt();
            total += pessoas;

            for (int i = 0; i < canais.length; i++) {
                if (canal == canais[i]) {
                    audiencia[i] += pessoas;
                }
            }
        }

        for (int i = 0; i < canais.length; i++) {
            int percentual = (int) ((double) audiencia[i] / total * 100);
            System.out.printf("Percentual de audiência do canal %d: %d%%%n", canais[i], percentual);
        }

        sc.close();
    }
}
