import Bancos.Person_Banck;

import javax.swing.*;
import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {

        ArrayList<Person_Banck> usersBancks = new ArrayList<>();

        String option = "";
        do {
            option = JOptionPane.showInputDialog("BANCO\n" +
                    "1. Añadir una cuenta\n" +
                    "2. Depositar dinero\n" +
                    "3. Retirar dinero\n" +
                    "4. Ver dinero");
            switch (option) {
                case "1":
                    addCount(usersBancks);
                    break;
                case "2":
                    addMoney(usersBancks);
                    break;
            }
        } while (!option.equals("4"));
    }

    public static void addCount(ArrayList<Person_Banck> newUserBanck) {
        Person_Banck persona = new Person_Banck();

        String user = JOptionPane.showInputDialog("Digite el nombre del titular de la cuenta");
        String cantidad = JOptionPane.showInputDialog("Desea ingresar una cantidad por primera vez? ");
        double cantidadT = Double.parseDouble(cantidad);
        persona.setBalance(cantidadT);
        persona.setTitular(user);

        newUserBanck.add(persona);

    }

    public static void addMoney(ArrayList<Person_Banck> user) {

        String nombreTitular = JOptionPane.showInputDialog("Digite el nombre del titular de la cuenta");

        for(int i =0;i<user.size();i++){
            System.out.println(user.get(i).getTitular());
            if (user.get(i).getTitular().equals(nombreTitular)){
                JOptionPane.showMessageDialog(null,"El nombre no coincide con la cuenta buscada");
                break;
            }else {
                String cantidadInicial = JOptionPane.showInputDialog("Digite la contidad del dinero que quiera añadir");
                double contidadFinal = Double.parseDouble(cantidadInicial);
                double cantidadVieja = user.get(i).getBalance();
                double suma = cantidadVieja + contidadFinal;
                System.out.println(suma+cantidadVieja+contidadFinal);
            };

        }


    }
}
