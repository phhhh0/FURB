import java.util.Scanner;

public class Uni6Exe7 {

   
    public static void inserirValores(int[] vetor, int n) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
      
        while (i < n) {
            System.out.print("Digite um número inteiro: ");
            int valor = scanner.nextInt();
           
            boolean existe = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] == valor) {
                    existe = true;
                    break;
                }
            }
           
            if (!existe) {
                vetor[i] = valor;
                i++;
            } else {
                System.out.println("O valor " + valor + " já foi inserido. Tente outro.");
            }
        }
    }

    public static void ordenarValores(int[] vetor, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                  
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void exibirVetor(int[] vetor) {
        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print("][");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor N (tamanho do vetor, máximo 20): ");
        int N = scanner.nextInt();

        if (N > 20) {
            N = 20;
            System.out.println("O tamanho máximo do vetor é 20. Ajustando para N = 20.");
        }
        int[] vetor = new int[N];
        inserirValores(vetor, N);  

        System.out.print("Vetor origem: ");
        exibirVetor(vetor);    

        ordenarValores(vetor, N);
        
        System.out.print("Vetor ordenado: ");
        exibirVetor(vetor);
    }
}
