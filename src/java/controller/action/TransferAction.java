/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.action;

import model.*;
import controller.actionform.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author aadi
 */
public class TransferAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession session= request.getSession(true);
        String uName = (String)session.getAttribute("uname");
        TransferActionForm tr=(TransferActionForm) form;
        String uid=tr.getUid();
        Double amt=tr.getAmt();
        Transfer t=new Transfer();
        int i=t.transfer(uName,uid,amt);
        
        if(i==1)
        return mapping.findForward(SUCCESS);
        else
        return mapping.findForward(FAIL);
    }
}
