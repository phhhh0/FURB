import java.util.Scanner;

public class Uni2Exe12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Digite as coordenadas de p1 (x1, y1): ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
    
            System.out.println("Digite as coordenadas de p2 (x2, y2): ");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
    
            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    
            System.out.printf("A distância entre os pontos é: %.4f\n", distancia);
    
        }
    }
    