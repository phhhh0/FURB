import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o peso da carta em gramas: ");
        int peso = scanner.nextInt();
        
        // Cálculo do custo do selo
        double custo = 0.45;
        if (peso > 50) {
            int excesso = peso - 50;
            int adicional = (int) Math.ceil(excesso / 20.0);
            custo += adicional * 0.45;
        }
        
        // Exibe o custo do selo
        System.out.printf("Custo do selo: %.4f\n", custo);
        
        scanner.close();
    }
}