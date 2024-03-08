import Library.Book;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Book> library = new ArrayList<Book>() ;

        Book objLibro = new Book("100 años de soledad","Gabriel Garcia Marquez", "01-05-1967",false);

        String option;

        do {
            option = JOptionPane.showInputDialog("Librery\n" +
                    "1.Add new book\n" +
                    "2.Modifed a one book\n" +
                    "3.Get the new book\n" +
                    "4.Given the book");
            switch (option){
                case "1":
                    addNewBook(library);
                    break;
                case "2":
                    modifyBook(library);
                    break;
            }

        }while (!option.equals("5"));
    }

    public static void addNewBook(ArrayList<Book> library){
        String cadenaAux = "";
        int index = 1;
        Book newBooks = new Book();

        String title = JOptionPane.showInputDialog("Digite el nombre del libro");
        String autor = JOptionPane.showInputDialog("Digite el nombre del autor");
        String age = JOptionPane.showInputDialog("Digite el año de publicacion");

        newBooks.setTitle(title);
        newBooks.setAutor(autor);
        newBooks.setAgePublic(age);

        int id = 0;

        int increment = id+1;

        newBooks.setId(increment);

        library.add(newBooks);


        for (int i = 0; i < library.size();i++){
            cadenaAux +=library.get(i)+"\n";
        }
        JOptionPane.showMessageDialog(null,cadenaAux);

    }

    public static void modifyBook(ArrayList<Book> library){
        String cadenaAux = "";
        Book modifyBooks = new Book();

        int id = modifyBooks.getId();

        String title = modifyBooks.getTitle();
        String autor = modifyBooks.getAutor();
        String age = modifyBooks.getAgePublic();

        for (int j = 0; j < library.size();j++){
            cadenaAux +=library.get(j)+"\n";
            System.out.println(cadenaAux);
        }
        String option = JOptionPane.showInputDialog(null,"Eliga el nombre del libro que desea modificar\n"+cadenaAux);

        for (int i = 0; i < library.size();i++){

            if (option == modifyBooks.getTitle()){
                String newTitle = JOptionPane.showInputDialog("Digite el nombre nuevo del libro");
                String newAutor = JOptionPane.showInputDialog("Digite el nombre nuevo del autor");
                String newAge = JOptionPane.showInputDialog("Digite la nuevo fecha de publicacion");
                modifyBooks.setTitle(newTitle);
                modifyBooks.setAutor(newAutor);
                modifyBooks.setAgePublic(newAge);
            }else {
                JOptionPane.showMessageDialog(null,"No es valido el libro");
            }
        }


    }
}