package exercicio_func;

import java.util.Scanner;

public class Exercicio_FuncArray {

    static Scanner sc = new Scanner(System.in);

    public static int[] LerArray(String s) {

        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s%dº numero:\n", s, i + 1);
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static float[] SomaMedia(int[] array) {

        float[] somaMedia = new float[2];

        for (int i = 0; i < array.length; i++) {
            somaMedia[0] += array[i];
            somaMedia[1] = somaMedia[0] / array.length;
        }
        return somaMedia;
    }

    public static void multiplicaIndiceValor(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d x %d = %d\n", i, array[i], i * array[i]);
        }

    }

    public static void main(String[] args) {

        int[] array = new int[7];

        array = LerArray("Digite o ");
        float[] soma = SomaMedia(array);
        System.out.printf("A soma de todos os numeros é: %.0f\n", soma[0]);
        multiplicaIndiceValor(array);
        System.out.println("a média aritmética dos números é: " + soma[1]);

    }
}