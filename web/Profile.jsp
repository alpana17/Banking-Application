
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page language ="java" %>
<%@ page import="model.*" %>

<%@ page import="javax.servlet.http.*" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <style type="text/css">
         <!--
.style2 {font-family: Verdana, Arial, Helvetica, sans-serif;
text-decoration:none;}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #CCCCCC;
}

-->  
</style>
    </head>
    <body>
        <% 
                        String str=(String)session.getAttribute("uname");
                           GetInfo g=new GetInfo();
                           String s2= g.fname(str);
                           String s3=g.lname(str);
                           String s4=g.add(str);
                           String s5=g.con(str);
                           double bal= g.bal(str);
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
                        <table>
                         <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="left"><span class="style2">
                                            
                                               FIRST NAME: <%=s2%>
                                            </td>
                         </tr>
                         <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="left"><span class="style2">
                                            
                                               LAST NAME: <%=s3%>
                                               </td>
                         </tr>
                                    
                        <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="left"><span class="style2">
                                            
                                               ADDRESS: <%=s4%>
                                               </td>
                       </tr>                        
                      <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="left"><span class="style2">
                                            
                                               CONTACT NO: <%=s5%>
                                             </td>
                     </tr>                          
                    <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="left"><span class="style2">
                                            
                                               User ID: <%=str%>
                                             </td>
                     </tr>
                     <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="left"><span class="style2">
                                            
                                               BALANCE: <%=bal%>
                                             </td>
                     </tr>              
                    
              </table>
    </body>
</html:html>
