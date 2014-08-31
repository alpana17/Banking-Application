<%-- 
    Document   : Transfer
    Created on : 18 Jul, 2012, 2:43:54 PM
    Author     : aadi
--%>

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
        <title>Transfer Money</title>
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
        <% 
                        String str=(String)session.getAttribute("uname");
                           GetInfo g=new GetInfo();
                           String s2= g.fname(str);
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
                            <h3> <p align="center" style="text-decoration:blink">Your Account Balance is <%= bal %>!!! </h3>
        <table>
        <td width="564" align="left" valign="top"><h2 align="center">&nbsp;</h2>
                                <h2 align="center"><font color="#CC0033" >Transfer Money</font></h2>
                                <p align="center">&nbsp;</p>   
        </table> 
                        
                        <form action="trans.do" method="post">
                        <table width="557" height="255" border="0" cellpadding="0" cellspacing="0">
                                           <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="right"><span class="style2">&nbsp;&nbsp;Enter the User ID of the Person You Want to Transfer Money To                 </span></p></td>
                                            <td width="151" align="left" valign="top"><p class="style2">&nbsp;
                                                </p>
                                                
                                                <p align="left" class="style2">
                                                  <input type="text" name="uid"/>
                                                  <html:errors property="uname" />
                                                  <html:errors property="a" />
                                                  
                                              
                                            </p>
                                            </td>
                                            <td width="152" align="left" valign="top"><p>&nbsp;</p>
                                            </tr>
                                            <td width="152" align="left" valign="top"><p>&nbsp;</p>
                                            </tr>
                                        <tr>
                                            <td height="58" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="right" class="style2"> Enter the amount You want to Transfer  </p></td>
                                            <td align="left" valign="top">
                                                <p class="style2">&nbsp;                    </p>
                                                <p align="left" class="style2">
                                                  <input type="text" name="amt"/>
                                                  <html:errors property="amt" />
                                                  <html:errors property="o" />
                                            </p>                
                                            </td>
                                           
                                        </tr>
                                        <tr>
                                            <td height="58" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="right" class="style2"> Enter Your Password  </p></td>
                                            <td align="left" valign="top">
                                                <p class="style2">&nbsp;                    </p>
                                                <p align="left" class="style2">
                                                  <input type="password" name="pwd"/>
                                                  <html:errors property="pwd" />
                                                  <html:errors property="p" />
                                                
                                            </p>                
                                            </td>
                                           
                                        </tr>
                                            <tr>
                                            <tr>
                                            <td height="113" colSpan="3" align="left" valign="top">
                                                <p align="left"></p>
                                                
                                                
                                                
                                                
                                                <div align="left">
                                                  <div align="center">
                                                      
                                            <input type="Submit" value="Transfer" width="105" height="21" />
                                              
                                            </div>
                                                    </div>
                                                  </td>
                                        </tr>
                                         </table>
                                            </form>
                                      
           
       
    </body>
</html:html>

