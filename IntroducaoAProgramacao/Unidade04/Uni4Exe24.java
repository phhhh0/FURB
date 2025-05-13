public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o primeiro valor: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int c = scanner.nextInt();
        
       
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                int[] crescente = {a, b, c};
                Arrays.sort(crescente);
                System.out.println("Ordem crescente: " + crescente[0] + ", " + crescente[1] + ", " + crescente[2]);
                break;
            case 2:
                int[] decrescente = {a, b, c};
                Arrays.sort(decrescente);
                System.out.println("Ordem decrescente: " + decrescente[2] + ", " + decrescente[1] + ", " + decrescente[0]);
                break;
            case 3:
                int maior = Math.max(a, Math.max(b, c));
                int menor = Math.min(a, Math.min(b, c));
                int meio = a + b + c - maior - menor;
                System.out.println("Maior no meio: " + menor + ", " + maior + ", " + meio);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
    
}