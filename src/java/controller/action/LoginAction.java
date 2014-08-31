/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.action;
import model.*;
import controller.actionform.*;
import javax.servlet.http.*;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author aadi
 */
public class LoginAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "success";

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            LoginActionForm af=(LoginActionForm) form;
            String str=af.getUname();
            HttpSession session = request.getSession(true);
            session.setAttribute("uname",str);
            String q=session.getId();
            System.out.println("Login Action session ID:"+q);
            
        return mapping.findForward(SUCCESS);
       
    }
}
