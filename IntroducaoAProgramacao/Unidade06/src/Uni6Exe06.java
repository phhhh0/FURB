import java.util.Scanner;

public class Uni6Exe06 {

    
    public static double[] lerVetor(int n) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[n];  

        System.out.println("Digite " + n + " valores reais para preencher o vetor:");

        
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        return vetor;  
    }

    
    public static boolean buscarValor(double[] vetor, double valor) {
        
        for (double v : vetor) {
            if (v == valor) {
                return true; 
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor N (tamanho do vetor): ");
        int N = scanner.nextInt();

        
        double[] vetor = lerVetor(N);

        
        System.out.print("Digite um valor real para buscar no vetor: ");
        double valorBuscado = scanner.nextDouble();

        
        boolean encontrado = buscarValor(vetor, valorBuscado);

        
        if (encontrado) {
            System.out.println("O valor " + valorBuscado + " foi encontrado no vetor.");
        } else {
            System.out.println("O valor " + valorBuscado + " não foi encontrado no vetor.");
        }
    }
}