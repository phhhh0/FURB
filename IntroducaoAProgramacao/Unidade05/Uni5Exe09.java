import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        int acimaDe20 = 0;
        String alunos18 = "";

        for (int i = 1; i <= n; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            if (idade == 18) {
                alunos18 += nome + " ";
            }

            if (idade > 20) {
                acimaDe20++;
            }
        }

        System.out.println("Nomes dos alunos que têm 18 anos: " + alunos18.trim());
        System.out.println("Quantidade de alunos com idade acima de 20 anos: " + acimaDe20);
        sc.close();
    }
}
