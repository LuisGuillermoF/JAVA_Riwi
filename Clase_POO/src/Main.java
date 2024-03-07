import Libreria.Libros;

import javax.swing.*;
import java.io.ObjectInput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        /*Clase básica de un Libro: Crea una clase Libro que tenga los atributos
        título, autor, año de publicación y si está o no prestado. Incluye métodos
        para modificar y obtener el estado de los atributos. Por último, implementa
        un método para prestar y devolver el libro, cambiando el estado de prestado
        acorde.*/

        ArrayList<ObjectInput> librery = new ArrayList<>();

        String option ;

        do {
            option = JOptionPane.showInputDialog("Librery\n" +
                    "1.Add new book\n" +
                    "2.Modifed a one book\n" +
                    "3.Get the new book\n" +
                    "4.Given the book");
            switch (option){
                case "1":
                    addNewBooks(librery);

            }

        }while (!option.equals("5"));
    }

    public static void addNewBooks(ArrayList<ObjectInput> newBook){
        Libros libro = new Libros();

        String title = JOptionPane.showInputDialog("Digite el nombre del libro");
        String autor = JOptionPane.showInputDialog("Digite el nombre del autor");
        String age = JOptionPane.showInputDialog("Digite el año de publicacion");

        libro.setTitle(title);
        libro.setAutor(autor);
        libro.setAgePublic(age);


        System.out.println(libro.getTitle()+libro.getAgePublic()+libro.getAutor());

    }
}