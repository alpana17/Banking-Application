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
public class PasswordVerify {
    int i=0;
    public int passwordVerify(String uid,String pwd)
    {
        try
        {
            Connection con=Connect.createConn();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from UserInfo");
            while(rs.next())
            {
            String s1=rs.getString(5);
            if(s1.equals(uid))
            {
             String s2=rs.getString(6);
             if(s2.equals(pwd))
                 i=1;
            
             break;
            }
    }
        }
            catch(Exception e)
            {
                System.out.println(e);
            }
        return i;
    
    }
}
