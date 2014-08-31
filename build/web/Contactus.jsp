
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
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
                <table cellPadding="2" width="100%" border="0">
                                    <tbody>
                                        <tr>
                                            <td colSpan="3" align="left" valign="top"><div align="left" class="top style2">
                                                    <h3 align="center">ABC BANK</h3>
                                             </div></td>
                                        </tr>
                                        </table>
                                        <table cellPadding="2" width="100%" border="0">
                                    <tbody>
                                        <tr>
                                            <td colSpan="3" align="left" valign="top"><div align="left" class="top style2">
                                                    <h3 align="center">20 D, CONNAUGHT PLACE, NEW DELHI-110001</h3>
                                             </div></td>
                                        </tr>
                                        <table cellPadding="2" width="100%" border="0">
                                    <tbody>
                                        <tr>
                                            <td colSpan="3" align="left" valign="top"><div align="left" class="top style2">
                                                    <h3 align="center">CONTACT NO.-(011) 23416880</h3>
                                             </div></td>
                                        </tr>
                                         <tr>
        <td height="21" colspan="4" align="left"><div align="center">
          <html:link forward="aboutus"> About us</html:link>
          |
  <html:link forward="contactus"> Contact us </html:link>

         </div></td>
      </tr>
    </body>
</html:html>
