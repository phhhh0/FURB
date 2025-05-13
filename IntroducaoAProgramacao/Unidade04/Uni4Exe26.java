public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("T - Área de um Triângulo");
        System.out.println("Q - Área de um Quadrado");
        System.out.println("R - Área de um Retângulo");
        System.out.println("C - Área de um Círculo");
        char opcao = scanner.next().toUpperCase().charAt(0); // Converte para maiúscula para evitar erro

        double area = 0; 

        switch (opcao) {
            case 'T':
                System.out.print("Digite a base do triângulo: ");
                double baseT = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double alturaT = scanner.nextDouble();
                area = (baseT * alturaT) / 2;
                break;

            case 'Q': 
                System.out.print("Digite o lado do quadrado: ");
                double ladoQ = scanner.nextDouble();
                area = ladoQ * ladoQ;
                break;

            case 'R':
                System.out.print("Digite a base do retângulo: ");
                double baseR = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double alturaR = scanner.nextDouble();
                area = baseR * alturaR;
                break;

            case 'C':
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                break;

            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.printf("A área da figura escolhida é: %.2f\n", area);
    }
}