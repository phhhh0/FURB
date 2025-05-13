import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as idades dos dois homens: ");
        int homem1 = scanner.nextInt();
        int homem2 = scanner.nextInt();

        System.out.print("Digite as idades das duas mulheres: ");
        int mulher1 = scanner.nextInt();
        int mulher2 = scanner.nextInt();

        // Identificar o homem mais velho e o mais novo
        int homemMaisVelho = Math.max(homem1, homem2);
        int homemMaisNovo = Math.min(homem1, homem2);

        // Identificar a mulher mais velha e a mais nova
        int mulherMaisVelha = Math.max(mulher1, mulher2);
        int mulherMaisNova = Math.min(mulher1, mulher2);

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);

        scanner.close();
    }
}