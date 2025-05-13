import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaGrupo = 0, somaMulheres = 0;
        int totalGrupo = 0, totalMulheres = 0;

        while (true) {
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            if (altura == 0) break;

            System.out.print("Gênero (M/F/O): ");
            char genero = sc.next().toUpperCase().charAt(0);

            somaGrupo += altura;
            totalGrupo++;

            if (genero == 'F') {
                somaMulheres += altura;
                totalMulheres++;
            }
        }

        System.out.printf("A média da altura das mulheres é: %.2f%n",
                totalMulheres > 0 ? somaMulheres / totalMulheres : 0);
        System.out.printf("A média de altura do grupo é: %.2f%n",
                totalGrupo > 0 ? somaGrupo / totalGrupo : 0);
        sc.close();
    }
}
