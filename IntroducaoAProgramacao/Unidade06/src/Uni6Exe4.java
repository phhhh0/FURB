import java.util.Scanner;

public class Uni6Exe4 {
    
public static int[] lerValores(String nomevetor) {

   Scanner scanner = new Scanner(System.in);    
   int[] vetores = new int[10];

    System.out.println("Digite 10 números inteiros:" + nomevetor + ": ");
  
    for (int i = 0; i < vetores.length; i++) {
        System.out.print("Digite " + (i + 1) + "º número: ");
        vetores[i] = scanner.nextInt();
    }
   return vetores;
}



public static int[] somarvetores(int[] vetor1, int[] vetor2){
   int[] vetorResultado = new int[10];

for (int i = 0; i < vetor1.length; i++) {
   vetorResultado[i] = vetor1[i] + vetor2[i];
}
   
return vetorResultado;
}

public static void imprimirvalores(int[] vetor1, int[] vetor2, int[] vetorResultado){

System.out.println("Os valores do vetor 1 são: ");
for (int i = 0; i < vetor1.length; i++) {
   System.out.print(vetor1[i] + " ");

}

System.out.println("\nOs valores do vetor 2 são: ");
for (int i = 0; i < vetor2.length; i++) {
   System.out.print(vetor2[i] + " ");
}
System.out.println("\nOs valores do vetor resultado são: ");
for (int i = 0; i < vetorResultado.length; i++) {
   System.out.print(vetorResultado[i] + " ");
}

System.out.println();
}

public static void main(String[] args){
 
    int[] vetor1 = lerValores("vetor 1");
    int[] vetor2 = lerValores("vetor 2");
    int[] vetorResultado = somarvetores(vetor1, vetor2);

    imprimirvalores(vetor1, vetor2, vetorResultado);


}
}