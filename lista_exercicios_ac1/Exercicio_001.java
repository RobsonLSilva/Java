package lista_exercicios_ac1;

import java.util.Scanner;

public class Exercicio_001 {

    public static void main(final String[] args) {

        int n1 = 0;
        int n2 = 0;
        int result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        n1 = sc.nextInt();

        System.out.println("Digite o primeiro numero:");
        n2 = sc.nextInt();

        result = n1 + n2;
        System.out.println("O resultado da soma é "+result);        
        
        }
        
}