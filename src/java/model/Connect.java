/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author aadi
 */
public class Connect {
    public static Connection createConn()
    {
        Connection con=null;
        try
        {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:bank");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
    
}
