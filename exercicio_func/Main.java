package exercicio_func;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = Func.max(a, b, c);

        Func.showResult(higher);


        sc.close();
        
    }

}