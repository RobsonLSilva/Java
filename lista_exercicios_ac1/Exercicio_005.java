/*5. Escrever um programa que leia o nome de um aluno e as notas das três
provas que ele obteve no semestre. No final informar o nome do aluno e a
sua média (aritmética).*/

package lista_exercicios_ac1;

import java.util.Scanner;

public class Exercicio_005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String aluno = sc.nextLine();

        System.out.println("Digite a primeira nota:");
        float n1 = sc.nextFloat();

        System.out.println("Digite a segunda nota:");
        float n2 = sc.nextFloat();

        System.out.println("Digite a terceira nota:");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.printf("A média referente as 3 notas do aluno %s foi %.1f\n", aluno, media);

        sc.close();
    }
}