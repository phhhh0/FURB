import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as idades dos três irmãos: ");
        int idade1 = sc.nextInt();
        int idade2 = sc.nextInt();
        int idade3 = sc.nextInt();

        if (idade1 == idade2 && idade2 == idade3) {
            System.out.println("TRIGÊMEOS");
        } else if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }
    }
}
