package model;

import database.CRUD;
import database.ConfigDB;
import entity.Coder;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoderModel implements CRUD {

    @Override
    public Object insert(Object obj) {
        //1 Abrimos la conexion
        Connection objConnection = ConfigDB.openConnection();

        //2 convertir el obj a Coder
        Coder objCoder = (Coder) obj;

        try{
            //3 Escribir el SQL
            String sql = "INSER INTO coder (name,age,clan) VALUES (?,?,?);";

            //4 preparar el Statement
            PreparedStatement objPrepare = objConnection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);

            //5 Asignar el valor a los ???
            objPrepare.setString(1,objCoder.getName());
            objPrepare.setInt(2,objCoder.getAge());
            objPrepare.setString(3,objCoder.getClan());

            //6 Ejecutar el Query
            objPrepare.execute();

            //7 Obtener el resultado con los ids (llaves)

            ResultSet objResult = objPrepare.getGeneratedKeys();

            while (objResult.next()){
                objCoder.setId(objResult.getInt(1));
            }

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return null;
    }

    @Override
    public List<Object> findAll() {

        //1. Crear lista para guardar lo que nos devuelve la base de datos

        List<Object> listCoders = new ArrayList<>();

        //2. abrir la conexion

        Connection objConnection = ConfigDB.openConnection();

        try{
            //3. Escribimos el query en SQL
            String sql ="SELECT * FROM coder;";

            //4. Usar el PreparedStatement

            PreparedStatement objPrepare = objConnection.prepareStatement(sql);

            //5. Ejecutar el query y obtener el resultado (ResultSet)

            ResultSet objResult = objPrepare.executeQuery();

            //6. Mientras haya un resultado siguiente hacer:
            while (objResult.next()){

                //6.1 Crear un coder
                Coder objCoder = new Coder();

                //6.2 llenar el objeto con la informacion de la base de datos del objeto que se esta iterando
                objCoder.setName(objResult.getString("name"));
                objCoder.setAge(objResult.getInt("age"));
                objCoder.setClan(objResult.getString("clan"));
                objCoder.setId(objResult.getInt("id"));

                System.out.println(objCoder);
                //6.3 agregamos el coder a la lista
                listCoders.add(objCoder);
            }

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR >> Hay un error en la consulta "+e.getMessage());

        }

        //7. Siempre cerrar la conexion
        ConfigDB.closeConnection();
        return listCoders;
    }

    @Override
    public boolean update(Object obj) {
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        return false;
    }
}
