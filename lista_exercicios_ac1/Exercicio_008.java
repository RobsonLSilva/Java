/*8. Elaborar um programa que efetue a apresentação do valor da conversão em
real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor
da cotação do dólar e também a quantidade de dólares disponíveis com o
usuário.*/

package lista_exercicios_ac1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da cotação em dolar:");
        float cotacao = sc.nextFloat();

        System.out.println("Digite a quantidade de dolares para a conversão: ");
        float dolar = sc.nextFloat();

        float real = dolar * cotacao;

        System.out.println("O valor da cotação digitada foi de R$ " + String.format("%.2f", cotacao) + " por US$ 1.00");
        System.out.println("A quandidade de Dolares convertidos em Reais foi de US$ " + String.format("%.2f", dolar)
                + ", equivalente a R$ " + String.format("%.2f.", real));

        sc.close();
    }

}