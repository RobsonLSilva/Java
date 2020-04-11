/*9. Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
Considere fixo o juro da poupança em 0.70% a. m.*/
package lista_exercicios_ac1;

import java.util.Scanner;

public class Exercicio_009 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double deposito;
        double juros;
        double rendimento;

        System.out.println("Digite o valor do deposito:");
        deposito = sc.nextDouble();

        juros = (deposito * 0.70) / 100; // calculando a porcentagem de juros

        rendimento = juros + deposito;

        System.out.printf("O rendimento da poupança no mês foi de R$ %.2f\n", rendimento);

        sc.close();

    }
}
