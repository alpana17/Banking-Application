
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC BANK</title>
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

.style3 {font-family: Verdana, Arial, Helvetica, sans-serif; text-decoration: none; color: #003366; }

-->  
</style>

     
    </head>
    <body>
        <table width="65%"  border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td height="125" colspan="4" align="left" valign="top"><img src="Images/abc.jpg" alt="banner" width="65%" height="125"></td>
            </tr>
            
            <td width="533" valign="top" bgcolor="#79BCFF"><span>&nbsp;&nbsp;
                        <html:link forward="home" style="text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;" > Home </html:link> 
                        | 
                        <html:link forward="login" style="text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;" >Login </html:link> 
                        | 
                        <html:link forward="registration"  style="text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;"  >Register</html:link>
                    </span><font color="#000066">
                        
              </font></td> 
                </tr>
        
        <p><span id="qq"></span></p></td>
              <td width="564" align="left" valign="top"><p>&nbsp;</p>
                <p class="style3"><span><strong><em>ABC BANK</em></strong> provides banking services to large corporations, medium-sized businesses, small business enterprises as well as individuals.The Bank offers a wide range of banking products and financial services to corporate and retail customers through a variety of delivery channels and through its specialised subsidiaries in the areas of investment banking, life and non-life insurance, venture capital and asset management.</span></p>
             <tr align="left" valign="middle" bgcolor="#3366FF">
                
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
