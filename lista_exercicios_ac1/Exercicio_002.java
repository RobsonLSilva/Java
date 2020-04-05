/*2. Escrever um programa que receba dois números e ao final mostre a soma, 
subtração, multiplicação e a divisão dos números lidos*/

package lista_exercicios_ac1;

import java.util.Scanner;

public class Exercicio_002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n1 = sc.nextInt();

        System.out.println("Digite outro numero:");
        int n2 = sc.nextInt();

        System.out.println("=================================");
        System.out.println("Resultado das 4 operações");
        System.out.println("=================================");
        System.out.println("Soma:             " +n1+" + "+n2+" = "+(n1+n2));
        System.out.println("Subtração:        "+n1+" - "+n2+" = "+(n1-n2));
        System.out.println("Multiplicação:    "+n1+" x "+n2+" = "+(n1*n2));
        System.out.println("Divisão:          "+n1+" / "+n2+" = "+(n1/n2));

        sc.close();

    }

}