/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actionform;

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
public class WithdrawActionForm extends org.apache.struts.action.ActionForm {
    
    private String pwd;
    private double amt;
    int i;

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

   
  
    public WithdrawActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
         HttpSession session = request.getSession(true);
        String uName = (String)session.getAttribute("uname");
        System.out.println("WithdrawActionForm Amt"+amt);
        if (getPwd() == null || getPwd().length() < 1)
            errors.add("uname", new ActionMessage("error.pwd.required"));
        if (getAmt() == 0)
            errors.add("amt",new ActionMessage("error.amt.required"));
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
       
        return errors;
    }
}
