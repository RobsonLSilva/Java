package aula_23042020;

import java.util.Scanner;

public class Exercicio_003 {

    public static int max(int x, int y, int z){

        int aux;
        if (x > y && x > z) {
            aux = x;            
        }else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
          
        return aux;
    }

    public static void showResult(int valor){

        System.out.println("O maior número digitado foi : "+ valor);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }

}