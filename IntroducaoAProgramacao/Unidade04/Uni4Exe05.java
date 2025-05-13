import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite uma palavra: ");
        String cor = sc.next();

        if(cor == "Azul" || cor == "azul"){
            System.out.print("Sim");
        }
          else {
            System.out.print("Não");
        }
    }
}