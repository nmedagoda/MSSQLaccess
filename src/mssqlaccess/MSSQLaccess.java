/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssqlaccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author OEM
 */
public class MSSQLaccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String con;
        new HotelJFrame().setVisible(true);
       /* try {
           //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Hospital2;user=sa;password=nishantha7;");
           Statement stmt=con.createStatement();
           String SQl= "Select * from doctor;";
           ResultSet re=stmt.executeQuery(SQl);
           
           re.next();
           String doc_id=re.getString("doc_id");
          System.out.println(doc_id);
        }
        catch (SQLException e){
            System.out.println(e.getMessage() );
        }*/
    }
    
}
