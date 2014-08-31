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
public class GetInfo {
    double bal=0;
        String fname="",add="",lname="",con="";
    public void info(String uid)
    {
        int flag=0;
        
    try
    {
    Connection conn=Connect.createConn();
    Statement st=conn.createStatement();
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
		 fname=rs.getString(1);
                 lname=rs.getString(2);
                 add=rs.getString(3);
                 con=rs.getString(4);
		 bal=rs.getDouble(8);
                 
	
                }
   
    
}
    catch(Exception e)
    {
    System.out.println(e);
    }
    }
    
    public String fname(String uid)
    {
        info(uid);
        return fname;
    }
    public String lname(String uid)
    {
        info(uid);
        return lname;
    }
    public String con(String uid)
    {
        info(uid);
        return con;
    }
    public String add(String uid)
    {
        info(uid);
        return add;
    }
    public double bal(String uid)
    {
        info(uid);
        return bal;
    }
    }

