/*6. Escrever uma programa em que leia dois valores para as variáveis A e B, e
efetuar as trocas dos valores de forma que a variável A passe a possuir o valor
da variável B e a variável B passe a possuir o valor da variável A. Apresentar
os valores trocados.
Lembrando que temos que ter 3 variáveis para que uma haja como variável
de armazenamento, ou seja, para evitar que o valor original de a se perca é
necessário associar a uma outra variável (denominada usualmente de
variável auxiliar) tal valor, estabelecer uma associação de a com o valor em b
e, por último, associar b ao valor "salvo" na variável auxiliar.*/

package lista_exercicios_ac1;

import java.util.Scanner;

public class Exercicio_006 {

    public static void main(String[] args) {

        float aux = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        float n1 = sc.nextFloat();

        System.out.println("Digite o valor de B: ");
        float n2 = sc.nextFloat();

        aux = n1;
        n1 = n2;
        n2 = aux;

        System.out.printf("Valor de A = %.1f\n", n1);
        System.out.printf("Valor de B = %.1f\n", n2);

        sc.close();

    }

}