/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnections;

import java.sql.DriverManager;
import java.sql.*;





/**
 *
 * @author rbarka
 */
public class ConnectionOracle 
{
    
    public static void main(String[] args) 
    {
        ConnectionOracle conn = null;
        
    try
    {
        String driverName = "oracle.jdbc.driver.OracleDriver";
	Class.forName(driverName);
	String serverName = "127.0.0.1";
	String portNumber = "1521";
	String sid = "XE";
	String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
	String username = "kod";
	String password = "bpps";
        conn = (ConnectionOracle) DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe");
        System.out.println("DB Bağlantısı Başarılı.");
    }
    catch(SQLException e) {
        System.out.println("SQL hatasi: " + e.getLocalizedMessage());
    }
    catch(ClassNotFoundException e)
    {
        System.out.println("DB Bağlantısı Başarısız.");
    }
    }
    
   
}
