package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Esta clase se encargara de establecer y cerrar la conexion con la base de datos
public class ConfigDB {
    //Este atrivuto tendra el estado de la conexion
    static Connection objConnection = null;

    //Metodo para conectar la base de datos

    public static Connection openConnection(){
        try {

            //llamamos al driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url ="jdbc:mysql://localhost:3306/_01_jdbc_lovelace";

            String user = "root";

            String password = "";

            //establecer la conexion
            objConnection = (Connection) DriverManager.getConnection(url,user,password);
            System.out.println("Se conecto perfectamente");

            //Creamos las variables de conexion
        }catch (ClassNotFoundException error){
            System.out.println("ERROR >> Driver no Instalado"+error.getMessage());
        }catch (SQLException error){
            System.out.println("ERROR >> error al conectar con la base de datos"+error.getMessage());
        }
        return objConnection;
    }

    //Metodo para finalizar la conexion
    public static void closeConnection(){
        try{
            //Si hay una conexion activa entonces la cierra
            if (objConnection != null) objConnection.close();
            System.out.println("Se finalizo la conexion con exito");
        }catch (SQLException error){
            System.out.println("ERROR >> error al desconectar la base de datos"+error.getMessage());
        }
    }

}
