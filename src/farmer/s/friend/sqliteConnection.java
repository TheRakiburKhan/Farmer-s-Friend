/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer.s.friend;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author raham
 */
public class sqliteConnection {
    Connection connect = null;
    
    public static Connection connectDB (){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connect = DriverManager.getConnection("jdb:sqlite:D:\\Programming Practice\\Java\\NetBeans\\Farmer's Friend\\Farmer's Friend\\Farmer's Friend.sqlite");
            JOptionPane.showMessageDialog(null, "Database Connected");
            return connect;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Database Connection Failed !!!");
            return null;
        }
    }
}
