package aula_09042020;

import java.util.Scanner;

public class Exercicio_While006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 1;
        int y = 1;

        while ((x != 0) || (y != 0)) {

            System.out.println("Digite a cordenada de X:");
            x = sc.nextInt();

            System.out.println("Digite a cordenada de Y:");
            y = sc.nextInt();

            if (x > 0 && y > 0) {

                System.out.println("Primeiro");

            } else if (x < 0 && y > 0) {

                System.out.println("Segundo");

            } else if (x < 0 && y < 0) {

                System.out.println("Terceiro");

            } else if (x > 0 && y < 0) {

                System.out.println("Quarto");
            }

        }

        sc.close();

    }

}