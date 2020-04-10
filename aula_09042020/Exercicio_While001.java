package aula_09042020;

import java.util.Scanner;

public class Exercicio_While001 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = 0;

        System.out.println("Digite um número: ");
        x = sc.nextInt();

        while (x != 0) {

            System.out.println("Digite outro número: ");
            x = sc.nextInt();
            
        }

        System.out.println("Final do programa - o programa encerrou normalmente quando você digitou zero");


        sc.close();
        
    }

}