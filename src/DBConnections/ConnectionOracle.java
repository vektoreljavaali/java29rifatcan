/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnections;

import java.sql.DriverManager;
import java.sql.*;
import java.sql.Connection;
import oracle.jdbc.connector.OracleConnectionManager;
import oracle.jdbc.OracleDriver;
import oracle.jdbc.driver.OracleConnection;
import oracle.jdbc.driver.OracleSql;
import oracle.jdbc.driver.T4CXAConnection;




/**
 *
 * @author rbarka
 */
public class ConnectionOracle 
{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
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
