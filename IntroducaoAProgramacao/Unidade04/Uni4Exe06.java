import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char letra = sc.next().toUpperCase().charAt(0);

        switch (letra) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'I':
                System.out.println("Não Informado");
                break;
            default:
                System.out.println("Entrada Incorreta");
        }

    }
}


