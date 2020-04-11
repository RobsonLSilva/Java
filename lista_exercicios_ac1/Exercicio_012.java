/*12. Escreva um programa para ler o raio de um circulo, calcular e escrever a sua área. (pr²)
Calculo: área = PI*(raio²)*/

package lista_exercicios_ac1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo:");
        double raio = sc.nextDouble();

        double area = Math.PI * (raio * raio);

        System.out.printf("A Area do circulo é: %.2f m\n", area);

        sc.close();

    }
}