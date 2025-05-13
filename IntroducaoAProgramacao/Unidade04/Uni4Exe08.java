import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        String letra = sc.next();

        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
            System.out.println("É uma vogal");
        }   
            else {
                System.out.println("Não é vogal");
            }

    }
}
