import javax.swing.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        /*for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }


        int count = 0;

        int suma = 0;

        while(count <=100) {
            suma += count;
            count ++;
        }

        System.out.println(suma);

        int number = 0;



        for (int i = 1; i<=10; i++){
            System.out.println("\n Tabla de "+i);
            for (int e = 1; e<=10 ;e++){
                System.out.println(i*e);
            }
        }


         */
/*        double saldo = 1000;
        String option;
        do {
            option = JOptionPane.showInputDialog(null,"\n\n Menu de opciones \n 1.Ver saldo \n 2.Deposite Dinero \n 3.Retirar \n 4.Salir");



            switch(option){
                case "1":
                    JOptionPane.showMessageDialog(null,"Tu saldo es de: "+saldo+"$");
                    break;
                case  "2":
                    try{
                        String Depost = JOptionPane.showInputDialog(null,"Cuanto quiere depositar");
                        double despost =Double.parseDouble (Depost);
                        if (despost <= 0){
                            JOptionPane.showMessageDialog(null,"El deposito no puede ser menor a 0");
                            break;
                        }
                        saldo += despost;
                        JOptionPane.showMessageDialog(null,saldo+"$");
                    }
                    catch (Exception e){
                        JOptionPane.showMessageDialog(null,"El valor del precio no es valido");
                    }

                    break;
                case  "3":
                    try{
                        String Get = JOptionPane.showInputDialog(null,"Cuanto quiere retirar: ");
                        double get = Double.parseDouble(Get);
                        if (get > saldo){
                            JOptionPane.showMessageDialog(null,"No puedes retirar un valor mayor a tu saldo: "+saldo+"$");
                        }else {
                            saldo -= get;
                            JOptionPane.showMessageDialog(null,saldo +"$");
                        }

                    }

                    catch (Exception e){
                        JOptionPane.showMessageDialog(null,"El valor no es valido");
                    }

                    break;
            }

        }while(!option.equals("4") );*/


        String[][] triqui = new String[3][3];

        triqui[0][0]="X";
        triqui[0][1]="X";
        triqui[0][2]="X";

        triqui[0][0]="o";
        triqui[1][0]="o";
        triqui[2][0]="o";

        System.out.println(triqui);


    }

}
