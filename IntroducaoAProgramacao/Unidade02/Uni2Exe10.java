import java.sql.Date;
import java.text.DateFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uni2Exe10 {
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    System.out.print("Digite o tempo em segundos: ");
        int segundos = sc.nextInt();

        int hrs = segundos / 3600;
        int min = (segundos % 3600) / 60;
        int segRes = segundos % 60;

        System.out.printf("%d:%02d:%02d\n", hrs, min, segRes);

 }
}
