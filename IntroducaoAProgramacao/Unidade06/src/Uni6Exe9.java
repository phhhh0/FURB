import java.util.Scanner;

public class Uni6Exe9 {

    static int[] vetor = new int[50];
    static int tamanho = 0;

    public static void incluirValor(int valor) {
        if (tamanho < vetor.length) {
            vetor[tamanho++] = valor;
            System.out.println("Valor " + valor + " incluído com sucesso.");
        } else {
            System.out.println("Espaço insuficiente para incluir o valor.");
        }
    }

    public static boolean pesquisarValor(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void alterarValor(int valorAntigo, int valorNovo) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorAntigo) {
                vetor[i] = valorNovo;
                System.out.println("Valor " + valorAntigo + " alterado para " + valorNovo + ".");
                return;
            }
        }
        System.out.println("Valor " + valorAntigo + " não encontrado.");
    }

    public static void excluirValor(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                for (int j = i; j < tamanho - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                vetor[--tamanho] = 0;
                System.out.println("Valor " + valor + " excluído com sucesso.");
                return;
            }
        }
        System.out.println("Valor " + valor + " não encontrado.");
    }

    public static void mostrarValores() {
        if (tamanho == 0) {
            System.out.println("Nenhum valor armazenado.");
        } else {
            System.out.print("Valores armazenados: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }

    public static void ordenarValores() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Valores ordenados com sucesso.");
    }

    public static void inverterValores() {
        int inicio = 0;
        int fim = tamanho - 1;
        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;
            inicio++;
            fim--;
        }
        System.out.println("Valores invertidos com sucesso.");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser incluído: ");
                    int valorInclusao = scanner.nextInt();
                    incluirValor(valorInclusao);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser pesquisado: ");
                    int valorPesquisa = scanner.nextInt();
                    if (pesquisarValor(valorPesquisa)) {
                        System.out.println("Valor " + valorPesquisa + " encontrado.");
                    } else {
                        System.out.println("Valor " + valorPesquisa + " não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor a ser alterado: ");
                    int valorAntigo = scanner.nextInt();
                    System.out.print("Digite o novo valor: ");
                    int valorNovo = scanner.nextInt();
                    alterarValor(valorAntigo, valorNovo);
                    break;
                case 4:
                    System.out.print("Digite o valor a ser excluído: ");
                    int valorExclusao = scanner.nextInt();
                    excluirValor(valorExclusao);
                    break;
                case 5:
                    mostrarValores();
                    break;
                case 6:
                    ordenarValores();
                    break;
                case 7:
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 8);
    }

    public static void main(String[] args) {
        menu();
    }
}
