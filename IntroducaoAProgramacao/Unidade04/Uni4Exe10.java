import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade de Marquinhos: ");
        int idadeMarquinhos = sc.nextInt();

        System.out.print("Idade de Zezinho: ");
        int idadeZezinho = sc.nextInt();

        System.out.print("Idade de Luluzinha: ");
        int idadeLuluzinha = sc.nextInt();

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("O Marquinhos é o caçula.");
        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            System.out.println("O Zezinho é o caçula.");
        } else {
            System.out.println("A Luluzinha é a caçula.");
        }
    }
}