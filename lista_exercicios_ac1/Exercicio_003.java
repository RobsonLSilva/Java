/*3. Escrever um programa para determinar o consumo médio de um automóvel
sendo fornecida a distância total percorrida pelo automóvel e o total de
combustível gasto.*/

package lista_exercicios_ac1;

import java.util.Scanner;

public class Exercicio_003 {

    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância percorrida pelo veiculo:");
        float n1 = sc.nextFloat();

        System.out.println("Digite o total de combustivel gasto:");
        float n2 = sc.nextFloat();

        System.out.println("O consumo médio do veiculo é " + String.format("%.3f", n1 / n2) + " km/l");

        sc.close();
        
        }
        
}