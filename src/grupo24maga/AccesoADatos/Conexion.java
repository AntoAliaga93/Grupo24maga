
package grupo24maga.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String BD = "grupo24maga";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection conn;
    //Metodo constructor
    private Conexion(){}
    
    public static Connection getConexion(){
        if (conn==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conn = DriverManager.getConnection(URL+BD,USUARIO,PASSWORD);
                 JOptionPane.showMessageDialog(null,"Conectado");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos");
            }
        }
        return conn;
    }
    
}
