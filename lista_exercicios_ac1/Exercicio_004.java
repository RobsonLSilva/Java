/*4. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
seu nome, o salário fixo e salário no final do mês.*/

package lista_exercicios_ac1;

import java.util.Scanner;

public class Exercicio_004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String vendedor = sc.nextLine();

        System.out.println("Digite o salário do vendedor:");
        float salario = sc.nextFloat();

        System.out.println("Digite o total de vendas efetuadas em dinheiro pelo vendedor:");
        float vendas = sc.nextFloat();

        float salario_final = salario + ((vendas * 15) / 100);

        System.out.printf("\nVendedor: %s\nSalário fixo: R$ %.2f\nSalário + comissão: R$ %.2f \n", vendedor, salario,
            salario_final);

        sc.close();
    }

}