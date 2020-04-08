package aula_07042020;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_IntervaloValor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        float n1 = sc.nextFloat();

        if (n1 < 0.0 || n1 > 100) {

            System.out.println("Fora do intervalo ");

        } else if (n1 <= 25.0) {

            System.out.println("Intervalo [0, 25]");

        } else if (n1 <= 50.0) {

            System.out.println("Intervalo [25, 50]");

        } else if (n1 <= 75.0) {

            System.out.println("Intervalo [50, 75]");

        } else {

            System.out.println("Intervalo [75, 100]");
        }

        sc.close();

    }

}