import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inscricaoMaior = 0, inscricaoMenor = 0;
        double alturaMaior = Double.MIN_VALUE, alturaMenor = Double.MAX_VALUE, soma = 0;
        int count = 0;

        while (true) {
            System.out.print("Nº de inscrição: ");
            int inscricao = sc.nextInt();
            if (inscricao == 0) break;

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            soma += altura;
            count++;

            if (altura > alturaMaior) {
                alturaMaior = altura;
                inscricaoMaior = inscricao;
            }

            if (altura < alturaMenor) {
                alturaMenor = altura;
                inscricaoMenor = inscricao;
            }
        }

        System.out.printf("O atleta mais baixo tem %.2fm e seu número de inscrição é %d%n", alturaMenor, inscricaoMenor);
        System.out.printf("O atleta mais alto tem %.2fm e seu número de inscrição é %d%n", alturaMaior, inscricaoMaior);
        System.out.printf("A altura média do grupo de atletas é: %.2f%n", soma / count);
        sc.close();
    }
}
