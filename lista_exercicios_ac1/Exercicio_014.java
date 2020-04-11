/*14. Entrar com dois números e imprimir o menor número (suponha números diferentes).*/

package lista_exercicios_ac1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        System.out.print("Digite um número diferente do primeiro: ");
        int y = sc.nextInt();

        if (x < y) {

            System.out.printf("O numero %d é o menor\n", x);

        } else if (x > y) {

            System.out.printf("O numero %d é menor\n", y);

        }

        sc.close();
    }
}