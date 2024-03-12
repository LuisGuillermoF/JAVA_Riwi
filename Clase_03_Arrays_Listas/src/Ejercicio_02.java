import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i =0;i<numeros.length;i++){
            System.out.println("Por favor, ingresa 5 numeros enteros: #"+1);
            numeros[i]=scanner.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];


        for (int numero : numeros){
            if (numero>mayor){
                mayor = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }

        System.out.println("El numero mayor es: "+ mayor);
        System.out.println("El numero menor es: "+ menor);
    }
}
