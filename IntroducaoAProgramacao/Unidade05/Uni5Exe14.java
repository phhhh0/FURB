import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lucroMenor10 = 0, lucroEntre10e20 = 0, lucroMaior20 = 0;
        double totalCompra = 0, totalVenda = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Nome da mercadoria " + i + ": ");
            String nome = sc.next();
            System.out.print("Preço de compra: ");
            double pc = sc.nextDouble();
            System.out.print("Preço de venda: ");
            double pv = sc.nextDouble();

            double lucroPercentual = (pv - pc) / pc * 100;

            if (lucroPercentual < 10) lucroMenor10++;
            else if (lucroPercentual <= 20) lucroEntre10e20++;
            else lucroMaior20++;

            totalCompra += pc;
            totalVenda += pv;
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("Mercadorias com lucro < 10%: " + lucroMenor10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Mercadorias com lucro > 20%: " + lucroMaior20);
        System.out.println("Valor total de compra: ");
    }
}
