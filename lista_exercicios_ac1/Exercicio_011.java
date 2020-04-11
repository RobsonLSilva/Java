/*11. Faça um programa que receba o preço de custo de um produto e mostre o
valor de venda. Sabe-se que o preço de custo receberá um acréscimo de
acordo com um percentual informado pelo usuário.*/

package lista_exercicios_ac1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_011 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double precodecusto;
        double acrescimo;
        double valorvenda;

        System.out.println("Digite o preço de custo do produto: ");
        precodecusto = sc.nextDouble();

        System.out.println("Digite a porcentagem de acrescimo: ");
        acrescimo = sc.nextDouble();

        valorvenda = precodecusto + ((precodecusto * acrescimo) / 100) ;

        System.out.printf("O valor de venda do produto é R$ %.2f\n", valorvenda);

        sc.close();

    }

}