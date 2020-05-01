package exercicio_func;

import java.util.Scanner;

public class Exercicio_Func30042020 {

    static Scanner sc = new Scanner(System.in);

    public static void imprima(String s){

        System.out.println(s);

    }

    public static int somar(int a, int b) {

        int soma;
        soma = a + b;
        return soma;
        
    }

    public static int multiplicar(int a,int b) {
        
        return a * b;
        
    }

    public static int dobro(int a) {
        
        return somar(a, a);
        
    }

    public static int lerInt(String s) {

        int num;
        System.out.println(s);
        num = sc.nextInt();
        return num;
        
    }

    public static void main(String[] args) {

        int x,  y, z;

        x = lerInt("Primeiro Número:  ");
        y = lerInt("Primeiro Número:  ");
        z = lerInt("Primeiro Número:  ");

        imprima("Soma:  " + somar(x, y));
        imprima("Teste:  " + somar(20, 13));
        imprima("Produto:  " + multiplicar(x, y));
        imprima("Dobro do Primeiro:  " + dobro(x));
        imprima("Dobro do Segundo :  " + dobro(y));
        imprima("Dobro do Terceiro:  " + dobro(z));
         
    }
}
