public class Uni5Exe10 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1000; i <= 9999 && count < 10; i++) {
            int parte1 = i / 100;
            int parte2 = i % 100;

            int soma = parte1 + parte2;
            if (soma * soma == i) {
                System.out.println(i);
                count++;
            }
        }
    }
}
