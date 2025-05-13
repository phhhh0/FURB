import java.util.Scanner;

public class Uni6Exe5 {



    public static String[] lerRespostas(String nome){
    Scanner scanner = new Scanner(System.in);
    String[] vetor = new String[5];

System.out.println("Digite as 5 respostas do " + nome + "(Sim, Não, Ind):");

for(int i = 0; i < vetor.length; i++){
System.out.print("Digite a " + (i + 1) + "º resposta: ");
vetor [i] = scanner.nextLine().toUpperCase();   
    }
return vetor;
}

public static int calcularafinidade(String[] respostashomem, String[] respostasmulher){
    int afinidade = 0;

     for (int i = 0; i < respostashomem.length; i++) {
            if (respostashomem[i].equals(respostasmulher[i])) {
                afinidade += 3;  
            } else if ((respostashomem[i].equals("IND") && !respostasmulher[i].equals("IND")) ||
                       (respostashomem[i].equals("IND") && !respostasmulher[i].equals("IND"))) {
                afinidade += 1;  
            } else if ((respostashomem[i].equals("SIM") && respostasmulher[i].equals("NÃO")) ||
                       (respostashomem[i].equals("NÃO") && respostasmulher[i].equals("SIM"))) {
                afinidade -= 2;  
            }
        }

        return afinidade; 
    }
  
public static void exibirAfinidade(int afinidade) {
        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }

    public static void main(String[] args) {
        
        String[] respostasRapaz = lerRespostas("rapaz");
        String[] respostasMoca = lerRespostas("moça");

        
        int afinidade = calcularafinidade(respostasRapaz, respostasMoca);

        
        exibirAfinidade(afinidade);
    }


}


