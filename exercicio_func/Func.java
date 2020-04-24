package exercicio_func;

class Func {

    public static int max(int x, int y, int z){

        int aux;
        if (x > y && x > z) {
            aux = x;            
        }else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
          
        return aux;
    }

    public static void showResult(int valor){

        System.out.println("O maior número digitado foi : "+ valor);
    }



}