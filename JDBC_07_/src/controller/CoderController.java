package controller;

import entity.Coder;
import model.CoderModel;

import javax.swing.*;

public class CoderController {

    public static void getAll(){
        CoderModel objModel = new CoderModel();

        String listCoders = ":D CODER LIST \n";

        for (Object iterador: objModel.findAll()){
            //Convertimos el Object a Coder

            Coder objCoder = (Coder) iterador;
            listCoders += objCoder.toString() +"\n";
        }

        JOptionPane.showMessageDialog(null,listCoders);
    };

    public static String getAllString(){
        CoderModel objModel = new CoderModel();

        String listCoders = ":D CODER LIST \n";

        for (Object iterador: objModel.findAll()){
            //Convertimos el Object a Coder

            Coder objCoder = (Coder) iterador;
            listCoders += objCoder.toString() +"\n";
        }

        return listCoders;
    }

    public static void create(){
        //Usamos el modelo
        CoderModel objCoderModel = new CoderModel();

        //Pedimos los datos al usuario
        String name = JOptionPane.showInputDialog("Insert name");
        String clan = JOptionPane.showInputDialog("Insert clan");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Insert age"));

        //Creamos una instacia de coder
        Coder objCoder = new Coder();
        objCoder.setClan(clan);
        objCoder.setAge(age);
        objCoder.setName(name);

        //Llamamos al método de insercción y guardamos el objeto que retorna en coder previamente instanciado, debemos castearlo.
        objCoder = (Coder) objCoderModel.insert(objCoder);

        JOptionPane.showMessageDialog(null, objCoder.toString());
    }

    public static  void delete(){
        //Usamos el modelo
        String listCoders = getAllString();

        CoderModel objCoderModel = new CoderModel();

        //Pedimos el dato al usuario
        int idDelete = Integer.parseInt(JOptionPane.showInputDialog(listCoders+ "\n Insert id  the coder to delete\n"));

        Coder objCoder = objCoderModel.findById(idDelete);


        if (objCoder == null){
            JOptionPane.showMessageDialog(null,"Coder not found");
        }else {
            int confirm = JOptionPane.showConfirmDialog(null,"Are you sure want to delete the coder ?\n"+objCoder.toString());
            if (confirm == 0){
                objCoderModel.delete(idDelete);
            }
        }


    }
}
