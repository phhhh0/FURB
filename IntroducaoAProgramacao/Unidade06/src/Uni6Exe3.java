import java.util.Scanner;

public class Uni6Exe3 {
    
public static double[] lerValores() {

   Scanner scanner = new Scanner(System.in);    
   double[] valores = new double[12];

    System.out.println("Digite 12 números reais: ");

    for (int i = 0; i < valores.length; i++) {
        System.out.print("Digite " + (i + 1) + "º número: ");
        valores[i] = scanner.nextDouble();
    }

    return valores;

}

public static void ajustevalor (double[] valores) {
   for (int i = 0; i < valores.length; i++){
      if (i % 2 == 0){
         valores[i] = valores[i] * 1.05;
      } else {
         valores[i] = valores[i] * 1.02;
      }
   }
}
       
          public static void imprimirvalores(double[] valores) {
   System.out.println("Os valores ajustados são: ");
   for (int i = 0; i < valores.length; i++) {
      System.out.print("valor" + (i + 1) + ": " + valores[i] + " ");

   }
}

public static void main(String[] args) {
   double[] valores = lerValores();
   ajustevalor(valores);
   imprimirvalores(valores);
}


}

   
