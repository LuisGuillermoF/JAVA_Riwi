import autors.controller.AutorController;
import database.ConfigDB;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String option = "";

        do {
            option = JOptionPane.showInputDialog("""
                    1. List Autors
                    2. Insert Autors
                    3. Update Autors
                    4. Delete Autors
                    5. List Books
                    6. Insert Autors
                    7. Update Autors
                    8. Delete Autors
                    9. Exit
                    
                    Choose an option:
                    """);

            switch (option){
                case "1":
                    AutorController.getAllAutors();
                    break;
                case "2":
                    AutorController.createAutors();
                    break;
                case "4":
                    AutorController.deleteAutor();
                    break;
            }

        }while (!option.equals("9"));
    }
}