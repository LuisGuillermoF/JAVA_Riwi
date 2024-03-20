package autors.model;

import autors.entity.Autor;
import database.ConfigDB;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutorModel {

    public Object insert(Object obj){

        Connection objConnection = ConfigDB.openConection();

        Autor objAutor = (Autor) obj;

        try{

            String sql = "INSERT INTO autors (name,nationality) VALUES (?,?) ;";

            PreparedStatement objPrepare = objConnection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            objPrepare.setString(1,objAutor.getName());
            objPrepare.setString(2,objAutor.getNationality());

            objPrepare.execute();

            ResultSet objResult  = objPrepare.getGeneratedKeys();

            while (objResult.next()){
                objAutor.setId(objResult.getInt(1));
            }

        }catch (SQLException e){

        }
        ConfigDB.closeConnection();
        return objAutor;
    }

    public List<Object> findAll(){

        List<Object> listAutors = new ArrayList<>();

        Connection objConnection = ConfigDB.openConection();


        try{

            String sql = "SELECT * FROM autors;";

            PreparedStatement objPrepare = objConnection.prepareStatement(sql);

            ResultSet objResult = objPrepare.executeQuery();

            while (objResult.next()){

                Autor objAutor = new Autor();

                objAutor.setId(objResult.getInt("id"));
                objAutor.setName(objResult.getString("name"));
                objAutor.setNationality(objResult.getString("nationality"));

                listAutors.add(objAutor);
            }

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        ConfigDB.closeConnection();
        return listAutors;
    }



}
