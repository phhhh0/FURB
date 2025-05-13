import java.util.Scanner;

public class CustoAzulejos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoAzulejo = 12.50;
        int azulejosPorMetro = 9;
        
        System.out.print("Comprimento da parede (m): ");
        double comprimento = sc.nextDouble();
        System.out.print("Altura da parede (m): ");
        double altura = sc.nextDouble();

        double area = comprimento * altura;
        int totalAzulejos = (int) Math.ceil(area * azulejosPorMetro); 
        double custoTotal = totalAzulejos * precoAzulejo;

        System.out.printf("Valor gasto: R$ %.2f%n", custoTotal);

       sc.close();
    }
}
