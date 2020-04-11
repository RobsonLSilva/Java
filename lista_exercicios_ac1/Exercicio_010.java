/*10. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. 
Faça um programa que receba um valor de uma comprae mostre o valor das prestações.*/

package lista_exercicios_ac1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double valorproduto;
        double valorprestacao;
        int parcelas = 5;

        System.out.println("Digite o valor da compra: ");
        valorproduto = sc.nextDouble();

        valorprestacao = valorproduto / parcelas;

        System.out.println("O valor de cada parcela é de R$ " + valorprestacao);


        sc.close();
    }
}