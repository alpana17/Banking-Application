
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
        <style type="text/css">
            <!--
            .style2 {font-family: Verdana, Arial, Helvetica, sans-serif}
            body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url();
	background-color: #CCCCCC;
            }
.style4 {color: #000066}
            -->
        </style>
    </head>
    <body>
        <form action="my.do" method="post">
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
          <td width="564" align="left" valign="top"><h2 align="center">&nbsp;</h2>
                                <h2 align="center"><font color="#CC0033" >Sign in to your account</font></h2>
                                <p align="center">&nbsp;</p>
                                </table>
                                    <table width="557" height="255" border="0" cellpadding="0" cellspacing="0">
                                           <tr>
                                            <td width="254" height="61" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="right"><span class="style2">&nbsp;&nbsp;User ID :                 </span></p></td>
                                            <td width="151" align="left" valign="top"><p class="style2">&nbsp;
                                                </p>
                                                
                                                <p align="left" class="style2">
                                                  <input type="text" name="uname"/>
                                                <html:errors property="uname" />
                                            </p></td>
                                            <td width="152" align="left" valign="top"><p>&nbsp;</p>
                                            </tr>
                                        <tr>
                                            <td height="58" align="left" valign="top"><p>&nbsp;</p>
                                            <p align="right" class="style2"> Password : </p></td>
                                            <td align="left" valign="top">
                                                <p class="style2">&nbsp;                    </p>
                                                <p align="left" class="style2">
                                                  <input type="password" name="passwd"/>
                                                <html:errors property="passwd" />
                                            </p>                
                                            </td>
                                           
                                        </tr>
                                         <tr>
                                            <tr>
                                            <td height="113" colSpan="3" align="left" valign="top">
                                                <p align="left"></p>
                                                
                                                
                                                
                                                
                                                <div align="left">
                                                  <div align="center">
                                                      <h3><html:errors property="mismatch" /></h3>
                                            <input type="Submit" value="Login" width="105" height="21" />
                                              
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
 
         </div></td>
      </tr>
    </table>
    </body>
</html:html>
