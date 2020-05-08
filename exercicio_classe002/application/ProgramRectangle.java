package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Rectangle retangulo = new Rectangle();

            System.out.println("Entre com a largura do retângulo:");
            retangulo.width = sc.nextDouble();

            System.out.println("Entre com a largura do retângulo:");
            retangulo.height = sc.nextDouble();

            System.out.printf("ÁREA      = %.2f\n", retangulo.Area());
            System.out.printf("Perimetro = %.2f\n", retangulo.Perimeter());
            System.out.printf("Diagonal  = %.2f\n", retangulo.Diagonal());


            sc.close();
        }
    
}