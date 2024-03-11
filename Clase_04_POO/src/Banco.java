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
                    "4. Ver dinero\n" +
                    "5. Salir");
            switch (option) {
                case "1":
                    addCount(usersBancks);
                    break;
                case "2":
                    addMoney(usersBancks);
                    break;
                case "3":
                    removeCash(usersBancks);
                    break;
                case "4":
                    showCash(usersBancks);
                    break;
            }
        } while (!option.equals("5"));
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
        boolean bandera =false;
        for(int i =0;i<user.size();i++){
            String findUser = user.get(i).getTitular();
            if (findUser.equals(nombreTitular) ){
                String cantidadInicial = JOptionPane.showInputDialog("Digite la contidad del dinero que quiera añadir");
                double contidadFinal = Double.parseDouble(cantidadInicial);
                double cantidadVieja = user.get(i).getBalance();
                double suma = cantidadVieja + contidadFinal;
                user.get(i).setBalance(suma);
                JOptionPane.showMessageDialog(null,"Su cuenta quedo con= "+user.get(i).getBalance());
                bandera=true;
            }
        }
        if (bandera==false){
            JOptionPane.showMessageDialog(null,"El nombre no coincide con la cuenta buscada");
        }

    }

    public static void removeCash(ArrayList<Person_Banck> user){
        String titular = JOptionPane.showInputDialog("Digite el nombre del titular de la cuenta");
        boolean bandera = false;

        for (int i = 0;i<user.size();i++){
            String findUser = user.get(i).getTitular();
            if (findUser.equals(titular)){
                String remove = JOptionPane.showInputDialog("Digite la cantidad a retirar que desea");
                double newCount = Double.parseDouble(remove);
                double cantidadVieja = user.get(i).getBalance();
                double resta = cantidadVieja - newCount;
                user.get(i).setBalance(resta);

                JOptionPane.showMessageDialog(null,"Su cuenta quedo con= "+user.get(i).getBalance());

                bandera = true;
            }
        }
        if (bandera==false){
            JOptionPane.showMessageDialog(null,"El nombre no coincide con la cuenta buscada");
        }
    }

    public static void showCash(ArrayList<Person_Banck> user){
        String titular = JOptionPane.showInputDialog("Digite el nombre del titular de la cuenta");

        for (int i = 0;i<user.size();i++){
            String findUser = user.get(i).getTitular();
            if (findUser.equals(titular)){
                JOptionPane.showMessageDialog(null,user.get(i));
            }
        }
    }
}
