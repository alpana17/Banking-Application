/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actionform;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author aadi
 */
public class DepActionForm extends org.apache.struts.action.ActionForm {
    
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        HttpSession session = request.getSession(true);
        String uName = (String)session.getAttribute("uname");
        //session.setAttribute("uname",uName);
        System.out.println("UName: DepAcionFOrm:"+uName);
       
        return errors;
    }
}
