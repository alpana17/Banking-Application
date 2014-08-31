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
public class Withdraw {
    
    public int withdraw(String uid,double amt)
    {
        int i=0;
    try
    {
    Connection con=Connect.createConn();
    Statement st=con.createStatement();
    System.out.println("Final:"+uid);
    System.out.println("Final Amt:"+amt);
    i=st.executeUpdate("update UserInfo set Balance=Balance-"+amt+" where User ID='"+uid+"'");

    
    }
    
    catch(Exception e)
    {
        System.out.println(e);
    }
    return i;
    }
    
}

