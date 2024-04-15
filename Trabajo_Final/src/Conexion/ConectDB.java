
package Conexion;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;


public class ConectDB {
    
    private  static String Conection = "jdbc:sqlite:C:/Users/dell/Documents/TB_Final/last.s3db";
    
    public Connection  ConecatrDB() throws ClassNotFoundException{
          Connection  conex = null;
          Class.forName("org.sqlite.JDBC");
        try 
        {
            conex = (Connection) DriverManager.getConnection(Conection);
            System.out.println("Conexion Exitosa!!!!");
        
        } catch (Exception e) {
             System.out.println("Conexion Fallida !!!!"+e);
             
        }
        
        return conex;
        
        
    }
    
    
}
