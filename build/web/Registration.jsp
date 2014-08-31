<%-- 
    Document   : Registration
    Created on : 9 Jul, 2012, 1:05:11 PM
    Author     : aadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
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
        <form action="reg.do" method="post">
        <table width="65%"  border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td height="125" colspan="4" align="left" valign="top"><img src="Images/abc.jpg" alt="banner" width="65%" height="125"></td>
            </tr>
            <tr align="left" valign="middle" bgcolor="#3366FF">
                <td width="533" valign="top" bgcolor="#79BCFF"><span>&nbsp;&nbsp;
                        <html:link forward="home" style="text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;" > Home </html:link> 
                        | 
                        <html:link forward="login" style="text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;" >Login </html:link> 
                        | 
                        <html:link forward="registration"  style="text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;"  >Register</html:link>
                    </span><font color="#000066">
                        
              </font></td> 
                </tr>
        </table>      
                <table cellPadding="2" width="100%" border="0">
                                    <tbody>
                                        <tr>
                                            <td colSpan="3" align="left" valign="top"><div align="left" class="top style2">
                                                    <h3 align="center">PERSONAL DETAILS</h3>
                                             </div></td>
                                        </tr>
                                            
                                     
                                        <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="left"><span class="style2">
                                            
                                               FIRST NAME: <input type="text" name="fname"/>
                                               <h3><html:errors property="fname" /></h3>
                                            </p></td>
                                             <tr>
                                            <td width="150" height="10" align="left" valign="top">
                                            <p align="left"><span class="style2"> 
                                            
                                                 LAST NAME: <input type="text" name="lname"/>
                                                 <h3><html:errors property="lname" /></h3>
                                            </p></td>
                                            <tr>
                                            <td width="150" height="10" align="left" valign="top">
                                            <p align="left"><span class="style2">
                                            
                                               ADDRESS: <input type="text" name="add"/>
                                               <h3><html:errors property="add" /></h3>
                                            </p></td>
                                             <tr>
                                            <td width="150" height="10" align="left" valign="top">
                                            <p align="left"><span class="style2"> 
                                            
                                                 CONTACT NO: <input type="text" name="contact"/>
                                                 <h3><html:errors property="contact" /></h3>
                                               </p></td>
                                             <tr>
                                            <td colSpan="3" align="left" valign="top"><div align="left" class="top style2">
                                                    <h3 align="center">ACCOUNT DETAILS</h3>
                                            </div></td>
                                        </tr>
                                        <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="left"><span class="style2">
                                            
                                             
                                               User ID: <input type="text" name="userid"/>
                                               <h3><html:errors property="userid" /></h3>
                                               <h3><html:errors property="unameVerify" /></h3>
                                            </p></td>
                                            <tr>
                                            <td width="150" height="10" align="left" valign="top">
                                            <p align="left"><span class="style2">
                                            
                                            Password: <input type="password" name="pwd"/>
                                            <h3><html:errors property="pwd" /></h3>
                                            <h3><html:errors property="pwd1" /></h3>
                                            </p></td>
                                            <tr>
                                            <td width="150" height="10" align="left" valign="top">
                                            <p align="left"><span class="style2">
                                            
                                            Re-Enter Password: <input type="password" name="pwd1"/>
                                            <h3><html:errors property="pwd1" /></h3>
                                            </p></td>
                                             <tr>
                                            <td width="150" height="10" align="left" valign="top">
                                            <p align="left"><span class="style2"> 
                                            
                                                 DATE OF OPENING: <input type="text" name="dop"/>(DD-MM-YYYY Format)
                                                 <h3><html:errors property="dop" /></h3>
                                            </p></td>
                                            <tr>
                                            <td width="150" height="10" align="left" valign="top">
                                            <p align="left"><span class="style2">
                                            
                                               INITIAL AMOUNT(Rs): <input type="text" name="bal"/>(Rs 1000 is mandatory)
                                               <h3><html:errors property="bal" /></h3>
                                            </p></td>
                                             <tr>
                                            <td height="113" colSpan="3" align="left" valign="top">
                                                <p align="left">&nbsp;</p>
                                                
                                                
                                                <div align="left">
                                                  <div align="center">
                                                     
                                             
                                            <input type="Submit" value="Submit" width="105" height="21" /></p>
                                                
                                                      </div>
                                                    </div>
                                            </td>
                                        </tr>
                    </table>
    </form>                     
                                                  
                        <tr>
                         <td height="21" colspan="4" align="left"><div align="center">
                            <html:link forward="aboutus"> About us</html:link>
                                |
                            <html:link forward="contactus"> Contact us </html:link>

                            </div>
                         </td>
                        </tr>
                    
    </body>
</html:html>
    
