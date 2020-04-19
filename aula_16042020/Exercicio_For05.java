package aula_16042020;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_For05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de Pares deseja fazer a divisão:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Digite o 1º numero:");
            double n1 = sc.nextInt();

            System.out.println("Digite o 1º numero:");
            double n2 = sc.nextInt();

            if (n2 != 0) {

                System.out.println("O resultado da divisão é "+ n1 / n2);
                
            } else {

                System.out.println("Divisão impossivel");
                
            }
            
        }








        sc.close();

    }

}