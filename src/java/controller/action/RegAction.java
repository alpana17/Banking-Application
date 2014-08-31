/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.action;
import model.*;
import controller.actionform.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author aadi
 */
public class RegAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "regsuccess";
    private static final String FAIL = "regfail";
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
       
        int j;
        RegActionForm rf=(RegActionForm) form;
        String fname,lname,add,contact,userid,pwd,dop;
        double bal;
        
        userid=rf.getUserid();
        fname=rf.getFname();
        lname=rf.getLname();
        add=rf.getAdd();
        contact=rf.getContact();
        pwd=rf.getPwd();
        dop=rf.getDop();
        bal=rf.getBal();
        Register rg=new Register();
        j=rg.reg(fname,lname,add,contact,userid,pwd,dop,bal);
        System.out.println("j="+j);
        if(j==1)
        return mapping.findForward(SUCCESS);
        else
        return mapping.findForward(FAIL);
                
                
    }

}
