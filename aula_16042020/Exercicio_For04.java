package aula_16042020;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_For04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de testes deseja realizar");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
            System.out.println("Digite o 1º valor");
            float n1 = sc.nextFloat();

            System.out.println("Digite o 2º valor");
            float n2 = sc.nextFloat();

            System.out.println("Digite o 3º valor");
            float n3 = sc.nextFloat();

            double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;

            System.out.printf("A média é %.1f\n", media);

        }

        sc.close();

    }

}