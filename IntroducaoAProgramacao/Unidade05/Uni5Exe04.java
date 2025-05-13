public class Uni5Exe04 {
    public static void main(String[] args) {
        double s = 0.0;
        int numerador = 3;
        int denominador = 2;

        for (int i = 1; i <= 20; i++) {
            s += (double) numerador / denominador;
            numerador += 2;
            denominador += i + 1;
        }

        System.out.println("Valor de S: " + s);
    }
}
