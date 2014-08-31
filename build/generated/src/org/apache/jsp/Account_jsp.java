package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import model.*;

public final class Account_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_forward;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_style_forward;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_forward = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_style_forward = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_link_forward.release();
    _jspx_tagPool_html_link_action.release();
    _jspx_tagPool_html_link_style_forward.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <head>\n");
          out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
          out.write("        <title>Account Details</title>\n");
          out.write("        <style type=\"text/css\">\n");
          out.write("         <!--\n");
          out.write("         \n");
          out.write("            .style2 {\n");
          out.write("                font-family: Verdana, Arial, Helvetica, sans-serif;\n");
          out.write("                color: #000066;\n");
          out.write("            }\n");
          out.write("            body {\n");
          out.write("                margin-left: 0px;\n");
          out.write("                margin-top: 0px;\n");
          out.write("                margin-right: 0px;\n");
          out.write("                margin-bottom: 0px;\n");
          out.write("                background-image: url();\n");
          out.write("                background-color: #CCCCCC;\n");
          out.write("            }\n");
          out.write("         -->\n");
          out.write("         </style>\n");
          out.write("    </head>\n");
          out.write("    <body>\n");
          out.write("        ");
 //String uid=request.getParameter("uname");
                        
                          
                           String str=(String)session.getAttribute("uname");
                           GetInfo g=new GetInfo();
                           String s2= g.fname(str);
                           double bal= g.bal(str);
                           /*   String s1,s2="";
                           double bal=0;
                            try
                            {
                            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            Connection con=DriverManager.getConnection("jdbc:odbc:bank");
                            Statement st=con.createStatement();
                            ResultSet rs=st.executeQuery("select * from UserInfo");
                            while(rs.next())
                            {
                             s1=rs.getString(5);
                            if(s1.equals(str))
                            {
                            s2=rs.getString(1);
                            bal=rs.getDouble(8);
                            }
                            }
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                            }*/
                        
                        
                         
          out.write("\n");
          out.write("        <table width=\"65%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
          out.write("            <tr>\n");
          out.write("                <td height=\"125\" colspan=\"4\" align=\"left\" valign=\"top\"><img src=\"Images/abc.jpg\" alt=\"banner\" width=\"65%\" height=\"125\"></td>\n");
          out.write("            </tr>\n");
          out.write("            <tr align=\"right\" valign=\"middle\" bgcolor=\"#3366FF\">\n");
          out.write("                <td width=\"533\" valign=\"top\" bgcolor=\"#79BCFF\"><span>&nbsp;&nbsp;\n");
          out.write("                        \n");
          out.write("                        ");
          if (_jspx_meth_html_link_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        |\n");
          out.write("                        ");
          out.print(str);
          out.write("\n");
          out.write("                        |\n");
          out.write("                        ");
          if (_jspx_meth_html_link_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("           </table> \n");
          out.write("                        \n");
          out.write("                            \n");
          out.write("                            <h3> <p align=\"center\" style=\"text-decoration:blink\">WELCOME ");
          out.print(s2.toUpperCase());
          out.write("!!! </h3>\n");
          out.write("                            <h3> <p align=\"center\" style=\"text-decoration:blink\">Your Account Balance is ");
          out.print( bal );
          out.write("!!! </h3>\n");
          out.write("                            \n");
          out.write("                              <table border=\"1\" cellpadding=\"2\" cellspacing=\"10\" class=\"tab\">\n");
          out.write("                              <tr>\n");
          out.write("                                <td width=\"182\" align=\"left\" valign=\"top\">");
          if (_jspx_meth_html_link_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                              </tr>\n");
          out.write("                              <tr>\n");
          out.write("                                <td align=\"left\" valign=\"top\">");
          if (_jspx_meth_html_link_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                              </tr>\n");
          out.write("                              <tr>\n");
          out.write("                                <td align=\"left\" valign=\"top\">");
          if (_jspx_meth_html_link_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                              </tr>\n");
          out.write("                              <tr>\n");
          out.write("                                <td align=\"left\" valign=\"top\">");
          if (_jspx_meth_html_link_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                              </tr>\n");
          out.write("                                  \n");
          out.write("                  </table>             \n");
          out.write("    </body>\n");
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
        return;
      }
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_link_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_style_forward.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_0.setPageContext(_jspx_page_context);
    _jspx_th_html_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_0.setForward("account");
    _jspx_th_html_link_0.setStyle("text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;");
    int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
    if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_0.doInitBody();
      }
      do {
        out.write(" Account ");
        int evalDoAfterBody = _jspx_th_html_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_style_forward.reuse(_jspx_th_html_link_0);
      return true;
    }
    _jspx_tagPool_html_link_style_forward.reuse(_jspx_th_html_link_0);
    return false;
  }

  private boolean _jspx_meth_html_link_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_style_forward.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_1.setPageContext(_jspx_page_context);
    _jspx_th_html_link_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_1.setForward("logout");
    _jspx_th_html_link_1.setStyle("text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;");
    int _jspx_eval_html_link_1 = _jspx_th_html_link_1.doStartTag();
    if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_1.doInitBody();
      }
      do {
        out.write(" Logout ");
        int evalDoAfterBody = _jspx_th_html_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_style_forward.reuse(_jspx_th_html_link_1);
      return true;
    }
    _jspx_tagPool_html_link_style_forward.reuse(_jspx_th_html_link_1);
    return false;
  }

  private boolean _jspx_meth_html_link_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_2.setPageContext(_jspx_page_context);
    _jspx_th_html_link_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_2.setAction("/deposit.do");
    int _jspx_eval_html_link_2 = _jspx_th_html_link_2.doStartTag();
    if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_2.doInitBody();
      }
      do {
        out.write("&nbsp;&nbsp; Deposit Money ");
        int evalDoAfterBody = _jspx_th_html_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_action.reuse(_jspx_th_html_link_2);
      return true;
    }
    _jspx_tagPool_html_link_action.reuse(_jspx_th_html_link_2);
    return false;
  }

  private boolean _jspx_meth_html_link_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_forward.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_3.setPageContext(_jspx_page_context);
    _jspx_th_html_link_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_3.setForward("withdraw");
    int _jspx_eval_html_link_3 = _jspx_th_html_link_3.doStartTag();
    if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_3.doInitBody();
      }
      do {
        out.write("<span style=\"text-decoration: none\">&nbsp;&nbsp; Withdraw Money </span>");
        int evalDoAfterBody = _jspx_th_html_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_forward.reuse(_jspx_th_html_link_3);
      return true;
    }
    _jspx_tagPool_html_link_forward.reuse(_jspx_th_html_link_3);
    return false;
  }

  private boolean _jspx_meth_html_link_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_forward.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_4.setPageContext(_jspx_page_context);
    _jspx_th_html_link_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_4.setForward("transfer");
    int _jspx_eval_html_link_4 = _jspx_th_html_link_4.doStartTag();
    if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_4.doInitBody();
      }
      do {
        out.write("<span style=\"text-decoration: none\">&nbsp;&nbsp; Transfer Money </span>");
        int evalDoAfterBody = _jspx_th_html_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_forward.reuse(_jspx_th_html_link_4);
      return true;
    }
    _jspx_tagPool_html_link_forward.reuse(_jspx_th_html_link_4);
    return false;
  }

  private boolean _jspx_meth_html_link_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_5 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_forward.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_5.setPageContext(_jspx_page_context);
    _jspx_th_html_link_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_5.setForward("profile");
    int _jspx_eval_html_link_5 = _jspx_th_html_link_5.doStartTag();
    if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_5.doInitBody();
      }
      do {
        out.write("<span style=\"text-decoration: none\">&nbsp;&nbsp; View Profile </span>");
        int evalDoAfterBody = _jspx_th_html_link_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_forward.reuse(_jspx_th_html_link_5);
      return true;
    }
    _jspx_tagPool_html_link_forward.reuse(_jspx_th_html_link_5);
    return false;
  }
}
