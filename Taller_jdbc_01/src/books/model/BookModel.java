package books.model;

import books.entity.Book;
import database.ConfigDB;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookModel {

    public static Object findAll(Object obj){

        Connection objConnection = ConfigDB.openConection();

        List<Book> listBooks = new ArrayList<>();

        try{

            String sql = "SELECT * FROM books;";

            PreparedStatement objprepare = objConnection.prepareStatement(sql);

            ResultSet objResult = objprepare.executeQuery();

            while (objResult.next()){
                Book objBook = new Book();

                objBook.setTitle(objResult.getString("title"));
                objBook.setPrice(objResult.getDouble("price"));
                objBook.setId(objResult.getInt("id"));
                objBook.setYear_published(objResult.getString("year_published"));
                objBook.setIdAutor(objResult.getInt("fk_idAutor"));

                listBooks.add(objBook);


            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return null;
    }

    public static Object insert(Object obj){
        return null;
    }

}
