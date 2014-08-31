/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actionform;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.*;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author aadi
 */
public class DepositActionForm extends org.apache.struts.action.ActionForm {
    
    private double amt ;
    private String pwd;
    

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    

    
    public DepositActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

        public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
       
        HttpSession session = request.getSession(true);
        String uName = (String)session.getAttribute("uname");
        //session.setAttribute("uname",uName);
        System.out.println("UName: DepositeAcionFOrm:"+uName);
        if (getPwd() == null || getPwd().length() < 1)
            errors.add("pwd", new ActionMessage("error.pwd.required"));
        if (getAmt() == 0)
            errors.add("amt",new ActionMessage("error.amt.required"));
        if (getPwd().length() > 1)
        {
            PasswordVerify pv=new PasswordVerify();
            int i=pv.passwordVerify(uName,pwd);
            if(i==0)
                errors.add("p",new ActionMessage("error.wrongpassword"));
        }
        
                     
        return errors;
    }
}
