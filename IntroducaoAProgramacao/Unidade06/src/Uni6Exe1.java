import java.util.Scanner;

public class Uni6Exe1 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];


        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite" + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        
        System.out.println("Os números digitados na ordem inversa: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i]);
        }

 
       scanner.close();        
        
    }
}
