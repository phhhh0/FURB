import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite qual opção deseja: ");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");
        
        int opcao = scanner.nextInt();
        int resultado = 0;

        switch(opcao){
            case 1:
                resultado = num1 + num2;
            break;

            case 2:
                resultado = num1 - num2;
            break;

            case 3:
                resultado = num1 * num2;
            break;

            case 4:
             if (num1 || num2 == 0){
                system.out.println("Numero invalido.")
                return;
             }else{
                resultado = num1 / num2;
             } 
            break;
        }
        system.out.println(resultado);

    }
}