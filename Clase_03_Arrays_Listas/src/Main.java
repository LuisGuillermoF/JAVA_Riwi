import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Creamos nuestro objeto Scanner
        //Scanner ObjScanner = new Scanner(System.in);

        //Creamos nuestro array que guardara la nota de los estudiantes
        double[] notes = new double[10];


        //Variable para guardar la suma total
        double sumaTotal = 0;


        for (int i = 0; i < 10; i++){

            System.out.println("Ingrese la nota del estudiante #"+(i+1));
            String notas = JOptionPane.showInputDialog(null,"Ingrese la nota del estudiante #"+(i+1));
            double Notas = Double.parseDouble(notas);
            try{
                notes[i] = Notas;
                sumaTotal += notes[i];

            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Nota no valida");
                break;
            }



        }
        double prom = sumaTotal/notes.length;
        JOptionPane.showMessageDialog(null,"El promedio final del estudiante es de: "+prom);

    }
}