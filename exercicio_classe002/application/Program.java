package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Product produto = new Product();

        System.out.println("Por favor digite o nome do produto:");
        produto.name = sc.nextLine();

        System.out.println("Por favor digite o preço do produto:");
        produto.price = sc.nextDouble();

        System.out.println("Digite a quantidade de produto em estoque:");
        produto.quantity = sc.nextInt();

        produto.Print();

        System.out.println("Digite uma quantidade para entrada no estoque:");
        produto.quantity += sc.nextInt();

        produto.Print();

        System.out.println("Digite a quantidade para retirada do estoque:");
        produto.quantity -= sc.nextInt();

        produto.Print();    


        sc.close();

    }

}