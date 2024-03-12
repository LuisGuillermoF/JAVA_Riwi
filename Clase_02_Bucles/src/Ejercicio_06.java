public class Ejercicio_06 {
    public static void main(String[] args){
        int numero = 39;
        boolean esPrimo = true;

        if (numero<=1){
            esPrimo =false;
        }else {
            for (int i =0;i<numero;i++){
                if (numero % 1 == 0){
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo){
            System.out.println(numero+" es un numero primo");
        }else {
            System.out.println(numero+" no es un numero primo");
        }
    }
}
