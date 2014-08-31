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
public class Transfer {

    public int transfer(String uname,String uid,double amt)
    {
        int i=0;
     try
    {
    Connection con=Connect.createConn();
    Statement st=con.createStatement();
    System.out.println("Transfer:"+uid);
    System.out.println("Transfer Amt:"+amt);
    i=st.executeUpdate("update UserInfo set Balance=Balance+"+amt+" where User ID='"+uid+"'");
    int j=st.executeUpdate("update UserInfo set Balance=Balance-"+amt+" where User ID='"+uname+"'");
    
    }
    
    catch(Exception e)
    {
        System.out.println(e);
    }
    return i;
    }
    
}

    
    
            

