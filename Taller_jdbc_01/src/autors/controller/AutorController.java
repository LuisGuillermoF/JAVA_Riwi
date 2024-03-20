package autors.controller;

import autors.entity.Autor;
import autors.model.AutorModel;

import javax.swing.*;

public class AutorController {

    public static void getAllAutors(){

        AutorModel objAutorModel = new AutorModel();

         String listAutors = "AUTORS LIST\n";

         for (Object Autor:  objAutorModel.findAll()){

             Autor objAutor = (Autor) Autor;
             listAutors += objAutor.toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,listAutors);
    }

    public static void createAutors(){

        AutorModel objAutorModel = new AutorModel();

        String name = JOptionPane.showInputDialog("Insert name");
        String nationality = JOptionPane.showInputDialog("Insert nation");

        Autor objAutor = new Autor();

        objAutor.setName(name);
        objAutor.setNationality(nationality);

        objAutor = (Autor) objAutorModel.insert(objAutor);

        JOptionPane.showMessageDialog(null,objAutor.toString());

    }
}
