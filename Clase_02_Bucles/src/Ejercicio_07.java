import javax.swing.*;
import java.util.Random;

public class Ejercicio_07 {
    public static void main(String[] args){
        Random random = new Random();

        int numeroAlt = random.nextInt(100)+1;

        JOptionPane.showMessageDialog(null,"Tengo un numero del 1 al 100 ¿Podras adivinarlo?");
        String user = JOptionPane.showInputDialog("Digite un numero del 1 al 100");
        int numero = Integer.parseInt(user);

        do {

            if (numero < numeroAlt){
                JOptionPane.showMessageDialog(null,"Muy abajo intenta de nuevo");
            } else if (numero > numeroAlt) {
                JOptionPane.showMessageDialog(null,"Muy alto intenta de nuevo");
            }
        }while (numero != numeroAlt);

        JOptionPane.showMessageDialog(null,"El numero era"+numeroAlt);
    }
}
