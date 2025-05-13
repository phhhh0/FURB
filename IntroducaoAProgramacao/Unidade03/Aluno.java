package Unidade03;

import java.util.Scanner;

public class Aluno {
                    
     public static int nmrMatricula;
     public static String nome;
     public static char sexo;

     public static void main(String[] args) {
            
        informarNumMatricula();
     }

       public static int informarNumMatricula(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        nmrMatricula = sc.nextInt();
            return nmrMatricula;
    }
}

