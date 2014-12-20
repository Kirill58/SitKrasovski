/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Кирилл
 */
import java.sql.*;
import javax.swing.*;


public class ConnectDatabase {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;
public static Connection ConnectDB(){
    try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        //Connection conn = DriverManager.getConnection("jdbc:ucanaccess:Driver={Microsoft Access Driver (*.mdb)}; DBQ=Database1.mdb");
        Connection conn=DriverManager.getConnection("jdbc:ucanaccess://D:/BD/Auto.mdb");
        //JOptionPane.showMessageDialog(null, "Connection Established");
        return conn;

    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}
}

