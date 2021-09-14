
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    public static final String url="jdbc:ucanaccess://src/coorddb.accdb";
            //src\\reportes\\seguimiento\\coorddb.accdb";
    public static final String usuario="root";
    public static final String clave="1976";
    public static final String driver="com.mysql.jdbc.Driver";
    
    private Connection conn=null;
    
    
    public Connection getConexion(){
        
        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn=DriverManager.getConnection(this.url);
            //JOptionPane.showMessageDialog(null,"Conectado!!!");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null,"NOOO Conectado!!!");
        }
        return conn;
    }
}
