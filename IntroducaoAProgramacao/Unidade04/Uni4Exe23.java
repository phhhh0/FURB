import java.util.Scanner;
public class Uni4Exe23{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println('Escolha o mês: 1 - Janeiro, 2 - Fevereiro, 3 - Março, 4 - Abril, 5 - Maio, 6 - Junho, 7 - Julho, 8 - Agosto, 9 - Setembro, 10 - Outubro, 11 - Novembro, 12 - Dezembro');
            int opcao = sc.nextInt();;
            String titulo;

            switch(opcao){
                case 1:
                    titulo = 'Janeiro' 
                    break;

                case 2:
                    titulo = 'Fevereiro' 
                    break;
                    
                case 3:
                    titulo = 'Março' 
                break;

                case 4:
                    titulo = 'Abril' 
                    break;

                case 5:
                    titulo = 'Maio' 
                    break;

                case 6:
                    titulo = 'Junho' 
                    break;

                case 7:
                    titulo = 'Julho' 
                    break;

                case 8:
                    titulo = 'Agosto' 
                    break;

                case 9:
                    titulo = 'Setembro' 
                    break;

                case 10:
                    titulo = 'Outubro' 
                    break;

                case 11:
                    titulo = 'Novembro' 
                    break;

                case 12:
                    titulo = 'Dezembro' 
                    break;

                System.out.println(titulo)
                scanner.close;
            }
    }
}