package aula_07042020;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Quadrante {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("          | y        ");
        System.out.println("          |          ");
        System.out.println("   Q2     |    Q1    ");
        System.out.println("          |          ");
        System.out.println("          |         x");
        System.out.println("----------|----------");
        System.out.println("          |          ");
        System.out.println("          |          ");
        System.out.println("   Q3     |    Q4    ");
        System.out.println("          |          ");
        System.out.println("          |          ");


        System.out.println("Digite a cordenada de X:");
        float x = sc.nextFloat();

        System.out.println("Digite a cordenada de Y:");
        float y = sc.nextFloat();

        if (x == 0.0 && y == 0.0) {

            System.out.println("Origem");
            
        } else if (x > 0.1 && y > 0.1 ) {

            System.out.println("Q1");

        }else if (x < 0.0 && y > 0.1 ) {

            System.out.println("Q2");

        }else if (x < 0.0 && y < 0.0 ) {

            System.out.println("Q3");

        }else if (x > 0.1 && y < 0.0 ) {

            System.out.println("Q4");
        }else{

            System.out.println("Cordenada incorreta!");
        }



        sc.close();
    }

}