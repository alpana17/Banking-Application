<%-- 
    Document   : DepSuccess
    Created on : 18 Jul, 2012, 4:05:59 PM
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
        <title>Transaction Successful</title>
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
        <% String str=(String)session.getAttribute("uname");
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
                        <table cellPadding="2" width="100%" border="0">
                                    <tbody>
                                        <tr>
                                            <td colSpan="3" align="left" valign="top"><div align="left" class="top style2">
                                                    <h3 align="center">Transaction Successful</h3>
                                             </div></td>
                                        </tr>
                                        </table>
                                          <table cellPadding="2" width="100%" border="0">
                                    <tbody>
                                        <tr>
                                            <td colSpan="3" align="left" valign="top"><div align="left" class="top style2">
                                                    <h3 align="center"><html:link page="/account.do">Go to Account</html:link></h3>
                                             </div></td>
                                        </tr>
                                        </table>

    </body>
</html:html>
