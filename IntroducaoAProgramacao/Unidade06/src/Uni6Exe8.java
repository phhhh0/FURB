import java.util.Scanner;

public class Uni6Exe8 {

  
    public static void lerDados(int[] sexo, int[] nota, int[] idade, int n) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Cliente " + (i + 1) + ":");

            
            System.out.print("Sexo (1=feminino, 2=masculino): ");
            sexo[i] = scanner.nextInt();

          
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();

           
            System.out.print("Nota (0 a 10): ");
            nota[i] = scanner.nextInt();
            System.out.println();
        }
    }

    
    public static double calcularMediaGeral(int[] nota, int n) {
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += nota[i];
        }
        return (double) soma / n;
    }

   
    public static double calcularMediaHomens(int[] sexo, int[] nota, int n) {
        int soma = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sexo[i] == 2) {
                soma += nota[i];
                count++;
            }
        }
        return count > 0 ? (double) soma / count : 0;
    }

    
    public static int encontrarNotaMulherMaisJovem(int[] sexo, int[] nota, int[] idade, int n) {
        int menorIdade = Integer.MAX_VALUE;
        int notaMulherMaisJovem = -1;

        for (int i = 0; i < n; i++) {
            if (sexo[i] == 1 && idade[i] < menorIdade) {
                menorIdade = idade[i];
                notaMulherMaisJovem = nota[i];
            }
        }
        return notaMulherMaisJovem;
    }

  
    public static int contarMulheresAcimaMedia(int[] sexo, int[] nota, int[] idade, int n, double mediaGeral) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaGeral) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 30; 
        int[] sexo = new int[n];
        int[] nota = new int[n];
        int[] idade = new int[n];

        
        lerDados(sexo, nota, idade, n);

        
        double mediaGeral = calcularMediaGeral(nota, n);
        double mediaHomens = calcularMediaHomens(sexo, nota, n);
        int notaMulherMaisJovem = encontrarNotaMulherMaisJovem(sexo, nota, idade, n);
        int mulheresAcimaMedia = contarMulheresAcimaMedia(sexo, nota, idade, n, mediaGeral);

      
        System.out.println("Nota média geral: " + mediaGeral);
        System.out.println("Nota média dos homens: " + mediaHomens);
        System.out.println("Nota da mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Mulheres com mais de 50 anos que deram nota superior à média geral: " + mulheresAcimaMedia);
    }
}
