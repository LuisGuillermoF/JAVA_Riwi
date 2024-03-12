import javax.swing.*;

public class Ejercicio_08 {

    public static void main(String[] args){
        String inicial = JOptionPane.showInputDialog("Digite el capital inicial");
        double capital = Double.parseDouble(inicial);

        String anual = JOptionPane.showInputDialog("Digite la tasa de interes anual ejemplo 5 para el 5%");
        double tasa = Double.parseDouble(anual);

        String age = JOptionPane.showInputDialog("Introduce el numero de años");
        int fecha = Integer.parseInt(age);

        double tasaDecimal = tasa / 100;

        double saldo = capital;
        for (int i =1; i<= fecha; i++){
            saldo +=saldo * tasaDecimal;
            JOptionPane.showMessageDialog(null,"Saldo al final del año",i,saldo);
        }
    }
}
