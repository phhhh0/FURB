public class Uni2Exe11 {
    public static void main(String[] args) {
        
        int A = 5;
        int B = 10;
        int C = 7;

        int calcArea = (A * C) /2;
    
        double pi = 3.14159;
        double aCirc = pi * (C * C);
        double aTrap = ((A + B) * C) / 2;
        double aQuadrado = B * B;
        double aRet = A * B;

        // Exibir os resultados formatados
        System.out.printf("Área do Triângulo: %.3f\n", pi);
        System.out.printf("Área do Círculo: %.3f\n", aCirc);
        System.out.printf("Área do Trapézio: %.3f\n", aTrap);
        System.out.printf("Área do Quadrado: %.3f\n", aQuadrado);
        System.out.printf("Área do Retângulo: %.3f\n", aRet);
    }
}
