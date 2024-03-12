import javax.swing.*;

public class Ejercicio_05 {

    public static void main(String[] args){
        String age = JOptionPane.showInputDialog("Digite su edad por favor");
        int newAge = Integer.parseInt(age);
        int edad =0;
        boolean entrada = false;


        while (!entrada){
            try{
                edad = newAge;

                if (edad >= 1 && <= 120){
                    entrada = true;
                }else{
                    JOptionPane.showMessageDialog(null,"Ingrese una edad entre 1 y 120");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"La entrada fue invalida");
            }

        }
    }

}
