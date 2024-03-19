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
}
