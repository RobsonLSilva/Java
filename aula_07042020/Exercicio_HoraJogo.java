/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começa em um dia e terminar em outro, tendo uma duração minima de 1 hora e maxima de 24 horas*/

package aula_07042020;

import java.util.Scanner;

public class Exercicio_HoraJogo {
    public static void main(String[] args) {

        int horaTotal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora final do jogo: ");
        int horaFinal = sc.nextInt();

        

        if (horaInicial < horaFinal){

            horaTotal = horaFinal - horaInicial;

        } else {

            horaTotal = 24 - horaInicial + horaFinal;
        }


        System.out.printf("O jogo durou %d hora(s)\n",horaTotal);

        sc.close();
    }

}