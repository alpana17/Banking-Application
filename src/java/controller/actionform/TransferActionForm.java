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
public class TransferActionForm extends org.apache.struts.action.ActionForm {
    
    private double amt ;
    private String uid,pwd;
    int i;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

   

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
    

    
    public TransferActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
        public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        HttpSession session = request.getSession(true);
        String uName = (String)session.getAttribute("uname");
        if (getUid() == null || getUid().length() < 1)
            errors.add("uname", new ActionMessage("error.uname.required"));
        if (getAmt() == 0)
            errors.add("amt",new ActionMessage("error.amt.required"));
        if (getPwd() == null || getPwd().length() < 1)
            errors.add("pwd", new ActionMessage("error.pwd.required"));
        if (getPwd().length() > 1)
        {
            PasswordVerify pv=new PasswordVerify();
            i=pv.passwordVerify(uName,pwd);
            if(i==0)
                errors.add("p",new ActionMessage("error.wrongpassword"));
        }
         if(i==1)
         {
         AmtVerify a=new AmtVerify();
         double j=a.amount(uName);
         System.out.println("j="+j);
         if(j < amt)
             errors.add("o",new ActionMessage("error.notenough.bal"));
         }
        if (getUid().length() > 1) 
        {
            CheckUserID chck=new CheckUserID();
            int i=chck.checkUserID(uid);
            if(i==0)
        errors.add("a", new ActionMessage("error.uname.doesnotexist"));
        }
        
                     
        return errors;
    }
}
