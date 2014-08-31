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
public class AmtVerify {
    public double amount(String uid)
    {
    double bal=0;
    int flag=0;
    try
    {
    Connection con=Connect.createConn();
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from UserInfo");
     while(rs.next())
	  {
				
		String s1=rs.getString(5);
		if(s1.equals (uid))
		 {	
			flag=1;
			break;
		}
	  }

		if(flag==1)
		{
		 
		 bal=rs.getDouble(8);
	
                }
   
    
}
    catch(Exception e)
    {
    System.out.println(e);
    }
    return bal;
    }
    
}
