public class Uni5Exe11 {
    public static void main(String[] args) {
        int quebrados = 1;
        int total = 0;

        for (int hora = 1; hora <= 16; hora++) {
            System.out.println("Hora " + hora + ": " + quebrados + " biscoitos quebrados");
            total += quebrados;
            if (hora == 1) {
                quebrados = 3;
            } else {
                quebrados *= 3;
            }
        }

        System.out.println("Total de biscoitos quebrados no dia: " + total);
    }
}
