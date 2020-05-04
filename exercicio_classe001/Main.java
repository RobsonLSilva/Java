package exercicio_classe001;

public class Main{

    public static void main(String[] args) {
        
        int[] array = new int[7];

        Metodos mt = new Metodos();

        array = mt.LerArray("Digite o ");
        float[] soma = mt.SomaMedia(array);
        System.out.printf("A soma de todos os numeros é: %.0f\n", soma[0]);
        mt.multiplicaIndiceValor(array);
        System.out.println("a média aritmética dos números é: " + soma[1]);

    }
}