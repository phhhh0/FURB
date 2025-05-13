import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as três notas das provas: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double media = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;
        char conceito;
        String status;

        if (media >= 9.0) {
            conceito = 'A';
            status = "Aprovado";
        } else if (media >= 7.5) {
            conceito = 'B';
            status = "Aprovado";
        } else if (media >= 6.0) {
            conceito = 'C';
            status = "Aprovado";
        } else if (media >= 4.0) {
            conceito = 'D';
            status = "Reprovado";
        } else {
            conceito = 'E';
            status = "Reprovado";
        }

        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %c. %s%n", media, conceito, status);
    }
}