package aula_07042020;

import java.util.Scanner;

public class Exercicio_vendas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("Código        Descrição             Preço  ");
        System.out.println("===========================================");
        System.out.println("00001         Cachorro Quente       R$ 4.00");
        System.out.println("00002         X-Salada              R$ 4.50");
        System.out.println("00003         X-Bacon               R$ 5.00");
        System.out.println("00004         Torrada Simples       R$ 2.00");
        System.out.println("00005         Refrigerante          R$ 1.50");
        System.out.println("===========================================");
        
        System.out.println("\nEscolha a opção desejada e digite seu respectivo código");
        int escolha = sc.nextInt();

        System.out.println("Digite a quantidade desejada:");
        float qtde = sc.nextFloat();

        switch (escolha) {
            case 1:
            
                System.out.printf("Total : R$ %.2f\n",qtde * 4.00);
                break;
            case 2:
            
                System.out.printf("Total : R$ %.2f\n",qtde * 4.50);
                break;
            case 3:
            
                System.out.printf("Total : R$ %.2f\n",qtde * 5.00);
                break;
            case 4:
            
                System.out.printf("Total : R$ %.2f\n",qtde * 2.00);
                break;
            case 5:
                System.out.printf("Total : R$ %.2f\n",qtde * 1.50);
                break;
            default:
                System.out.printf("Opção invalida");
                break;
        }
        sc.close();
    }

}