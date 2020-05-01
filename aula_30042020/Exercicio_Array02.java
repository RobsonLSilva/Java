package aula_30042020;

public class Exercicio_Array02 {

    public static void main(String[] args) {

        int [] array = {78, 20, 56, 89, 1};
        System.out.printf("%s%s\n", "Indice   ", "Valores(Conteúdo de cada ocorrência do Array)");

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%5d%5d\n", i , array[i] );
            
        }
    }

}