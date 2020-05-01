package aula_30042020;

import java.util.Scanner;

public class Exercicio_Array04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    

        int[] array = new int[7];
        float soma = 0;
        float media = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Digite o %dº número:\n", i+1);
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
            media = soma / array.length;
        }

        System.out.println("A soma de todos os numeros é: " + soma);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d x %d = %d\n", i, array[i], i * array[i]);     
        }

        System.out.println("a média aritmética dos números é: " + media);

        sc.close();

    }

}