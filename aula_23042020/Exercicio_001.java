package aula_23042020;

import java.util.Scanner;

public class Exercicio_001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva um número");
        int n = sc.nextInt();
                
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        } 
        
        sc.close();
    }
}