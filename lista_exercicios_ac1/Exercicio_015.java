/*15. Entrar com dois números e imprimi-los em ordem decrescente (suponha números diferentes).*/

package lista_exercicios_ac1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_015 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o um numero: ");
        int x = sc.nextInt();

        System.out.print("Digite um numero diferente do primeiro: ");
        int y = sc.nextInt();

        if (x > y) {

            System.out.println(+x + "\n" + y);

        } else if (x < y) {

            System.out.println(+y + "\n" + x);

        }else{

            System.out.println("Numeros iguais impossivel ordenar");
        }

        sc.close();
    }

}