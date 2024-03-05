import javax.swing.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        // De la siguiente manera se puede imprimir un mensaje por consola
        System.out.println("Hola Mundo");






        /*Scanner objScanner = new Scanner(System.in);
        System.out.printf("Ingrese tu nombre: ");
        String nombre = objScanner.next();

        System.out.printf("Ingrese tu edad: ");
        int edad = objScanner.nextInt();

        System.out.printf("Ingrese su altura: ");
        double altura = objScanner.nextDouble();

        System.out.println("Datos: " + " Nombre es: " + nombre + " Edad es: " + edad + " Altura es: " + altura);
        objScanner.close();

        if (edad >= 18){
            System.out.printf("Eres mayor de edad ");
            if (altura < 1.60){
                System.out.printf("Eres bajito ");
            } else if (altura <= 1.70 ) {
                System.out.printf("Eres una persona promedio ");
            }else {
                System.out.printf("Eres una persona alta ");
            }
        }else {
            System.out.printf("Eres menor de edad ");
        }*/


        //Ejercicio 1
        //Calculadora basica

        /*Scanner objScanner1 = new Scanner(System.in);*/

        String option = JOptionPane.showInputDialog(  null, "MENU DE OPERACIONES \n 1.Suma \n 2.Resta \n 3.Multiplicar \n 4.Dividir");


        switch (option){
            case "1":
                //Obtener los datos ingresados
                String num1 = JOptionPane.showInputDialog( null, "Ingrese el primer numero");
                String num2 = JOptionPane.showInputDialog(null,"Ingrese el Segundo numero");

                //Convertir los numeros que estan en String a enteros

                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);

                JOptionPane.showMessageDialog(null,a+b);

                break;
            case "2":

                String num3 = JOptionPane.showInputDialog(null,"Ingrese el primer numero");
                String num4 = JOptionPane.showInputDialog(null,"Ingrese el Segundo numero");

                double res1 = Double.parseDouble(num3);
                double res2 = Double.parseDouble(num4);

                JOptionPane.showMessageDialog(null,res1-res2);
                break;
            case "3":

                String num5 = JOptionPane.showInputDialog(null,"Ingrese el primer numero");
                String num6 = JOptionPane.showInputDialog(null,"Ingrese el Segundo numero");

                double mul1 = Double.parseDouble(num5);
                double mul2 = Double.parseDouble(num6);

                JOptionPane.showMessageDialog(null, mul1*mul2);
                break;
            case "4":
                String num7 = JOptionPane.showInputDialog(null,"Ingrese el primer numero");
                String num8 = JOptionPane.showInputDialog(null,"Ingrese el Segundo numero");

                double div1 = Double.parseDouble(num7);
                double div2 = Double.parseDouble(num8);

                if (div2 == 0){
                    JOptionPane.showMessageDialog(null,"El numero tiene que ser mayor que cero");
                }else {
                    JOptionPane.showMessageDialog(null,div1/div2);
                }

                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion valida");
        }

    }
}
