
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page language ="java" %>

<%@ page import="javax.servlet.http.*" %>
<%@ page import="model.*" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Details</title>
        <style type="text/css">
         <!--
         
            .style2 {
                font-family: Verdana, Arial, Helvetica, sans-serif;
                color: #000066;
            }
            body {
                margin-left: 0px;
                margin-top: 0px;
                margin-right: 0px;
                margin-bottom: 0px;
                background-image: url();
                background-color: #CCCCCC;
            }
         -->
         </style>
    </head>
    <body>
        <% //String uid=request.getParameter("uname");
                        
                          
                           String str=(String)session.getAttribute("uname");
                           GetInfo g=new GetInfo();
                           String s2= g.fname(str);
                           double bal= g.bal(str);
                           /*   String s1,s2="";
                           double bal=0;
                            try
                            {
                            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            Connection con=DriverManager.getConnection("jdbc:odbc:bank");
                            Statement st=con.createStatement();
                            ResultSet rs=st.executeQuery("select * from UserInfo");
                            while(rs.next())
                            {
                             s1=rs.getString(5);
                            if(s1.equals(str))
                            {
                            s2=rs.getString(1);
                            bal=rs.getDouble(8);
                            }
                            }
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }*/
                        
                        
                         %>
        <table width="65%"  border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td height="125" colspan="4" align="left" valign="top"><img src="Images/abc.jpg" alt="banner" width="65%" height="125"></td>
            </tr>
            <tr align="right" valign="middle" bgcolor="#3366FF">
                <td width="533" valign="top" bgcolor="#79BCFF"><span>&nbsp;&nbsp;
                        
                        <html:link forward="account" style="text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;" > Account </html:link>
                        |
                        <%=str%>
                        |
                        <html:link forward="logout" style="text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;" > Logout </html:link>
           </table> 
                        
                            
                            <h3> <p align="center" style="text-decoration:blink">WELCOME <%=s2.toUpperCase()%>!!! </h3>
                            <h3> <p align="center" style="text-decoration:blink">Your Account Balance is <%= bal %>!!! </h3>
                            
                              <table border="1" cellpadding="2" cellspacing="10" class="tab">
                              <tr>
                                <td width="182" align="left" valign="top"><html:link action="/deposit.do">&nbsp;&nbsp; Deposit Money </html:link></td>
                              </tr>
                              <tr>
                                <td align="left" valign="top"><html:link forward="withdraw"><span style="text-decoration: none">&nbsp;&nbsp; Withdraw Money </span></html:link></td>
                              </tr>
                              <tr>
                                <td align="left" valign="top"><html:link forward="transfer"><span style="text-decoration: none">&nbsp;&nbsp; Transfer Money </span></html:link></td>
                              </tr>
                              <tr>
                                <td align="left" valign="top"><html:link forward="profile"><span style="text-decoration: none">&nbsp;&nbsp; View Profile </span></html:link></td>
                              </tr>
                                  
                  </table>             
    </body>
</html:html>
