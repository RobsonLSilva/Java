package exercicio_classe001;

import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public int[] LerArray(String s) {

        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s%dº numero:\n", s, i + 1);
            array[i] = sc.nextInt();
        }
        return array;
    }

    public float[] SomaMedia(int[] array) {

        float[] somaMedia = new float[2];

        for (int i = 0; i < array.length; i++) {
            somaMedia[0] += array[i];
            somaMedia[1] = somaMedia[0] / array.length;
        }
        return somaMedia;
    }

    public void multiplicaIndiceValor(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d x %d = %d\n", i, array[i], i * array[i]);
        }

    }

}