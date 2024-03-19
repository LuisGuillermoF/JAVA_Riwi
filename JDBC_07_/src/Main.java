import controller.CoderController;
import database.ConfigDB;
import model.CoderModel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String option = "";

        do {

            option = JOptionPane.showInputDialog("""
                    1. List Coders
                    2. Insert Coder
                    3. Update Coder
                    4. Delete Coder
                    5. Get coder by name
                    6. Exit
                    
                    Choose an option:
                    """);

            switch (option){
                case "1":
                    CoderController.getAll();
                    break;
            }

        }while (!option.equals("6"));
    }
}