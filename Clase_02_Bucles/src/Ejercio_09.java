import java.util.Scanner;

public class Ejercio_09 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00;

        int opcion;

        do {
            System.out.println("\nBienvenidoo al Sistema de Banco");
            System.out.println("1. ver saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. retirar Dinero");
            System.out.println("4. salir");
            System.out.println("Selecciona una opcion");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Su saldo es de "+ saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0){
                        saldo+=deposito;
                        System.out.println("Depositaste ="+deposito);
                    }else {
                        System.out.println("No puedes depositar una cantidad negativa");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa la cantidad a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo){
                        saldo -= retiro;
                        System.out.println("Retiraste"+retiro);
                    } else {
                        System.out.println("Cantidad invalida o saldo insuficiente");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema");
                    break;
            }
        }while (opcion!=4);

        scanner.close();
    }
}
