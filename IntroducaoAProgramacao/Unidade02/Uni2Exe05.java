import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uni2Exe05 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe um número: ");
            int A = sc.nextInt();
        
            System.out.println("Informe um número: ");
            int B = sc.nextInt();

            System.out.println("Informe um número: ");
            int C = sc.nextInt();

            System.out.println("Informe um número: ");
            int D = sc.nextInt();

            int DIFERENCA = (A * B - C * D);

            System.out.println(DIFERENCA);
    }
}
