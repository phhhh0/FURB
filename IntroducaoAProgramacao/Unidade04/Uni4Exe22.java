import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o curso (1 - Ciência da Computação, 2 - Licenciatura da Computação, 3 - Sistemas de Informação): ");
        int opcao = scanner.nextInt();
        String titulo;

        switch (opcao) {
            case 1:
                titulo = "Bacharel em Ciência da Computação";
                break;
            case 2:
                titulo = "Licenciado em Computação";
                break;
            case 3:
                titulo = "Bacharel em Sistemas de Informação";
                break;
            default:
                titulo = "Opção inválida";
                break;
        }

        System.out.println(titulo);
        scanner.close();
    }
}