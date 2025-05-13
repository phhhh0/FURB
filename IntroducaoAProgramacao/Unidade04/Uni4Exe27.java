import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora de chegada: ");
        int horaChegada = scanner.nextInt();
        System.out.print("Minuto de chegada: ");
        int minChegada = scanner.nextInt();

        System.out.print("Hora de saída: ");
        int horaSaida = scanner.nextInt();
        System.out.print("Minuto de saída: ");
        int minSaida = scanner.nextInt();

        if (horaChegada < 0 || horaChegada > 23 || minChegada < 0 || minChegada > 59 ||
            horaSaida < 0 || horaSaida > 23 || minSaida < 0 || minSaida > 59) {
            System.out.println("Horário inválido.");
            return;
        }

        int chegadaEmMinutos = horaChegada * 60 + minChegada;
        int saidaEmMinutos = horaSaida * 60 + minSaida;

        if (saidaEmMinutos < chegadaEmMinutos) {
            saidaEmMinutos += 24 * 60;
        }

        int tempoEstacionado = saidaEmMinutos - chegadaEmMinutos;

        if (tempoEstacionado % 60 >= 30) {
            tempoEstacionado = (tempoEstacionado / 60 + 1) * 60;
        } else {
            tempoEstacionado = (tempoEstacionado / 60) * 60;
        }

        double preco = 0.0;

        if (tempoEstacionado <= 120) {
            preco = tempoEstacionado / 60 * 5.0;
        } else if (tempoEstacionado <= 240) {
            preco = 120 / 60 * 5.0 + (tempoEstacionado - 120) / 60 * 7.5;
        } else {
            preco = 120 / 60 * 5.0 + 120 / 60 * 7.5 + (tempoEstacionado - 240) / 60 * 10.0;
        }

        System.out.println("Tempo estacionado: " + tempoEstacionado / 60 + " hora(s)");
        System.out.printf("Preço cobrado = R$%.2f\n", preco);
    }
}
