/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actionform;

import javax.servlet.http.HttpServletRequest;
import model.*;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author aadi
 */
public class LoginActionForm extends org.apache.struts.action.ActionForm {
    
    private String uname;
    private String passwd;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
   
   
    
    
    public LoginActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    
         public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUname().length() < 1)
        errors.add("uname", new ActionMessage("error.uname.required"));

        if (getPasswd().length() < 1)
        errors.add("passwd", new ActionMessage("error.pwd.required"));
        
        if (getUname().length() > 1 && getPasswd().length() > 1)
        {
        LoginVerify vf=new LoginVerify();
        boolean i=vf.verify(uname, passwd);
        if(i==false)
        errors.add("mismatch", new ActionMessage("error.mismatch"));
        }
        return errors;
    }
}
