/*7. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a
temperatura em Fahrenheit e C a temperatura em Celsius.*/

package lista_exercicios_ac1;

import java.util.Scanner;

public class Exercicio_007 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsios:");
        float celsius = sc.nextFloat();

        float fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("A conversão para Fahrenheit do valor digitado é %.1f \n",fahrenheit);

        sc.close();
    }
}