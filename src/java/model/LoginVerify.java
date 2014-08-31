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
public class LoginVerify {
    public boolean verify(String uname,String passwd)
    {
        int flag=0;
        boolean i=false;
        try
        {
            Connection con=Connect.createConn();
          PreparedStatement pst1=con.prepareStatement("select * from UserInfo");
	 ResultSet rs =pst1.executeQuery();
         
	/*Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from UserInfo where User ID='"+uname+"' and Password='"+passwd+"'");
         
         if(rs.next())
         {
         i=true;
         }*/
         
            
            while(rs.next())
	  {
				
		String s1=rs.getString(5);
		if(s1.equals (uname))
		 {	
			flag=1;
			break;
		}
	  }

		if(flag==1)
		{
		 
		 String s2=rs.getString(6);
	if(s2.equals (passwd))
	{
	 i=true;
          
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