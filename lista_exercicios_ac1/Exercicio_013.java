/*13. Escreva um programa que entre com um número e o imprima caso seja maior do que 20.*/

package lista_exercicios_ac1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_013 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("digite um número: ");
        int num = sc.nextInt();

        if (num == 20) {

            System.out.printf("numero %d é igual a 20\n", num);
            
        }else if (num > 20) {

            System.out.printf("numero %d é maior que 20\n", num);

        } else if (num < 20) {

            System.out.printf("numero %d é menor que 20\n", num);

        }

        sc.close();
    }

}