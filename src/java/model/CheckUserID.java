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
public class CheckUserID {
int flag=0; 
public int checkUserID(String uid)
{
            try
        {
            Connection con=Connect.createConn();
            PreparedStatement pst1=con.prepareStatement("select * from UserInfo");
	 ResultSet rs =pst1.executeQuery();
	 while(rs.next())
	  {
				
		String s1=rs.getString(5);
		if(s1.equals (uid))
		 {	
			flag=1;
			break;
		}
	  }
        }
             catch(Exception e)
                     {
                         System.out.println(e);
                     }    
            return flag;
}
}
