//1. Escrever um programa java que receba dois números e exiba o resultado da sua soma.

package lista_exercicios_ac1;

import java.util.Scanner;

public class Exercicio_001 {

    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int n1 = sc.nextInt();

        System.out.println("Digite o primeiro numero:");
        int n2 = sc.nextInt();

        int result = n1 + n2;
        System.out.println("O resultado da soma é "+result);
        
        sc.close();
        
        }
        
}