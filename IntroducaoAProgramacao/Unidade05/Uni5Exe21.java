public class Uni5Exe21 {
    public static void main(String[] args) {
        double chico = 1.5, ze = 1.1;
        int anos = 0;

        while (ze <= chico) {
            chico += 0.02;
            ze += 0.03;
            anos++;
        }

        System.out.printf("Serão necessários %d anos para Zé ser mais alto que Chico.%n", anos);
    }
}
