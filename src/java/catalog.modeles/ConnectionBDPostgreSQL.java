package catalog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConnectionBDPostgreSQL {
 //URL de connection
    private static String url = "jdbc:postgresql://localhost:5432/catalogue";
    
    private static String user = "nopw";
    private static String password = "test";
    
    //Objet Connection
    private static Connection connect;
    
    
    //méthode d'accès à l'instance unique du singleton @return connect l'instance de la connection
    
    public static Connection getInstance() {
        if (connect == null) {
            try {
               try {
                   Class.forName("org.postgresql.Driver");
               
               } catch (ClassNotFoundException ex) {
             Logger.getLogger(ConnectionBDPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
         }
            connect = DriverManager.getConnection(url,user, password);}
            catch(SQLException e) {
                    e.printStackTrace ();
                    System.out.println("connexion erreur");
                    }
    }
    return connect;
}
    }