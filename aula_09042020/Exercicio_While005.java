package aula_09042020;

import java.util.Scanner;

public class Exercicio_While005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {

            System.out.println("Senha ivalida!");
            senha = sc.nextInt();
            
        }

        System.out.println("Acesso permitido");
        
        sc.close();

    }

}