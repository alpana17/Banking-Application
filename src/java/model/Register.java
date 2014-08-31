/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import javax.sound.midi.SysexMessage;


public class Register {
    public int reg(String s1,String s2,String s3,String s4,String s5,String s6,String s7,double bal)
    {
     int i=0; 
    try
    { 
       Connection con=Connect.createConn();
       Statement smt=con.createStatement();
       i = smt.executeUpdate("insert into UserInfo values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"',"+bal+")");
       System.out.println("aaaaa:"+i);
    }     
      
    
    catch(Exception e)
    {
        System.out.println(e);
        
    }
    System.out.println("value of i="+i);       
   return i; 
    }  

}
