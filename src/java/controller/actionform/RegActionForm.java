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
public class RegActionForm extends org.apache.struts.action.ActionForm {
    
    private String fname,lname,add,userid,pwd,dop,pwd1,contact;
    private double bal;

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPwd1() {
        return pwd1;
    }

    public void setPwd1(String pwd1) {
        this.pwd1 = pwd1;
    }
    

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    
    

    public String getDop() {
        return dop;
    }

    public void setDop(String dop) {
        this.dop = dop;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

 
    /**
     *
     */
    public RegActionForm() {
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
       //String userId = getUserid();
        if (userid == null || userid.length() < 1) 
            errors.add("userid", new ActionMessage("error.uname.required"));
            if (fname == null || fname.length() < 1) 
            errors.add("fname", new ActionMessage("error.fname.required"));
             if (lname == null || lname.length() < 1) 
            errors.add("lname", new ActionMessage("error.lname.required"));    
            if (add == null || add.length() < 1) 
            errors.add("add", new ActionMessage("error.add.required"));
            if (pwd == null || pwd.length() < 1) 
            errors.add("pwd", new ActionMessage("error.pwd.required"));
            if (dop == null || dop.length() < 1) 
            errors.add("dop", new ActionMessage("error.dop.required"));
            if (bal < 1000) 
            errors.add("bal", new ActionMessage("error.minbal.required"));
            if (!(pwd).equals(pwd1))
            errors.add("pwd1", new ActionMessage("error.pwdmismatch"));
            if (contact==null || contact.length() < 1)
            errors.add("contact",new ActionMessage("error.contact.required")); 
            if(userid.length() > 1)
            {
            Register rg=new Register();
            int i=rg.reg(fname,lname,add,contact,userid,pwd,dop,bal);
            if(i==0)
            errors.add("unameVerify",new ActionMessage("error.unameinuse"));
            } 
        return errors;
     
}
}