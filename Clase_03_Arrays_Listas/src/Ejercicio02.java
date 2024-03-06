import javax.swing.*;
import javax.swing.text.html.Option;

public class Ejercicio02 {

    public static void main(String[] args) {
        /*3. Sistema de Reservas: Desarrolla un programa para un teatro para gestionar las
        reservas de asientos. El teatro tiene 5 filas con 10 asientos cada una. Utiliza un
        arreglo bidimensional de boolean donde true representa un asiento ocupado y false
        uno disponible. El sistema debe permitir:
             Reservar y cancelar asientos.
             Mostrar los asientos disponibles.
             Contabilizar el total de asientos ocupados y disponibles.*/

        boolean[][] asientos = new boolean[5][10];
        int option = 0;

        int Menu;
        do {
            String menu = JOptionPane.showInputDialog(null, "Selecione una opcion del menu \n" + "1. Reservar asiento\n" + "2. Cancelar Asiento\n" + "3. Mostrar asiento disponible\n" + "4. Contabilizar el total de asientos ocupados y disponibles\n" + "5. Salir\n");
            Menu = Integer.parseInt(menu);

            switch (Menu) {
                case 1:
                    String Fila = JOptionPane.showInputDialog(null, "Ingrese la fila (1-5)");
                    int numberFila = Integer.parseInt(Fila);
                    String Column = JOptionPane.showInputDialog(null, "Ingrese el asiento (1-10)");
                    int numberColumn = Integer.parseInt(Column);

                    if (asientos[numberFila][numberColumn] == false) {
                        asientos[numberFila][numberColumn] = true;
                        JOptionPane.showMessageDialog(null, "Asiento reservado correctamente");
                    }
                case 2:
                    String FilaDelete = JOptionPane.showInputDialog(null, "Ingrese la fila (1-5)");
                    int numberFilaDelete = Integer.parseInt(FilaDelete);
                    String ColumnDelete = JOptionPane.showInputDialog(null, "Ingrese el asiento (1-10)");
                    int numberColumnDelete = Integer.parseInt(ColumnDelete);

                    if (asientos[numberFilaDelete][numberColumnDelete] == false) {
                        JOptionPane.showMessageDialog(null, "Asiento no ocupado");
                    } else {
                        asientos[numberFilaDelete][numberColumnDelete] = false;
                        JOptionPane.showMessageDialog(null, "Asiento borrado");
                    }
                case 3:
                    printFilas(asientos);
                    break;


            }

        } while (Menu != 5);


    }


public static void printFilas(boolean[][] asientos) {
    JOptionPane.showMessageDialog(null, "Asientos disponibles");
    String cine = "";
    for (int i = 0; i <= 5; i++) {
        for (int j = 0; j <= 10; j++) {
            cine += (i + 1) + " - " + (j + 1)+ " P ";
        }
        cine+="\n";
    }
    JOptionPane.showMessageDialog(null, "Disponibles" +"\n"+ cine);
}
}
