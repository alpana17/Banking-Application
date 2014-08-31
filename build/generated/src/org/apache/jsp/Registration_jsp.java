package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_style_forward;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_forward;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_style_forward = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_forward = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_link_style_forward.release();
    _jspx_tagPool_html_errors_property_nobody.release();
    _jspx_tagPool_html_link_forward.release();
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
      if (_jspx_meth_html_html_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
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

  private boolean _jspx_meth_html_html_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
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
        out.write("        <title>Registration</title>\n");
        out.write("        <style type=\"text/css\">\n");
        out.write("            <!--\n");
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
        out.write("            -->\n");
        out.write("            </style>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <form action=\"reg.do\" method=\"post\">\n");
        out.write("        <table width=\"65%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("            <tr>\n");
        out.write("                <td height=\"125\" colspan=\"4\" align=\"left\" valign=\"top\"><img src=\"Images/abc.jpg\" alt=\"banner\" width=\"65%\" height=\"125\"></td>\n");
        out.write("            </tr>\n");
        out.write("            <tr align=\"left\" valign=\"middle\" bgcolor=\"#3366FF\">\n");
        out.write("                <td width=\"533\" valign=\"top\" bgcolor=\"#79BCFF\"><span>&nbsp;&nbsp;\n");
        out.write("                        ");
        if (_jspx_meth_html_link_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                        | \n");
        out.write("                        ");
        if (_jspx_meth_html_link_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                        | \n");
        out.write("                        ");
        if (_jspx_meth_html_link_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </span><font color=\"#000066\">\n");
        out.write("                        \n");
        out.write("              </font></td> \n");
        out.write("                </tr>\n");
        out.write("        </table>      \n");
        out.write("                <table cellPadding=\"2\" width=\"100%\" border=\"0\">\n");
        out.write("                                    <tbody>\n");
        out.write("                                        <tr>\n");
        out.write("                                            <td colSpan=\"3\" align=\"left\" valign=\"top\"><div align=\"left\" class=\"top style2\">\n");
        out.write("                                                    <h3 align=\"center\">PERSONAL DETAILS</h3>\n");
        out.write("                                             </div></td>\n");
        out.write("                                        </tr>\n");
        out.write("                                            \n");
        out.write("                                     \n");
        out.write("                                        <tr>\n");
        out.write("                                            <td width=\"254\" height=\"61\" align=\"left\" valign=\"top\"><p>&nbsp;</p>\n");
        out.write("                                            <p align=\"left\"><span class=\"style2\">\n");
        out.write("                                            \n");
        out.write("                                               FIRST NAME: <input type=\"text\" name=\"fname\"/>\n");
        out.write("                                            </p></td>\n");
        out.write("                                             <tr>\n");
        out.write("                                            <td width=\"150\" height=\"10\" align=\"left\" valign=\"top\">\n");
        out.write("                                            <p align=\"left\"><span class=\"style2\"> \n");
        out.write("                                            \n");
        out.write("                                                 LAST NAME: <input type=\"text\" name=\"lname\"/>\n");
        out.write("                                            </p></td>\n");
        out.write("                                            <tr>\n");
        out.write("                                            <td width=\"150\" height=\"10\" align=\"left\" valign=\"top\">\n");
        out.write("                                            <p align=\"left\"><span class=\"style2\">\n");
        out.write("                                            \n");
        out.write("                                               ADDRESS: <input type=\"text\" name=\"add\"/>\n");
        out.write("                                            </p></td>\n");
        out.write("                                             <tr>\n");
        out.write("                                            <td width=\"150\" height=\"10\" align=\"left\" valign=\"top\">\n");
        out.write("                                            <p align=\"left\"><span class=\"style2\"> \n");
        out.write("                                            \n");
        out.write("                                                 CONTACT NO: <input type=\"text\" name=\"contact\"/>\n");
        out.write("                                            </p></td>\n");
        out.write("                                             <tr>\n");
        out.write("                                            <td colSpan=\"3\" align=\"left\" valign=\"top\"><div align=\"left\" class=\"top style2\">\n");
        out.write("                                                    <h3 align=\"center\">ACCOUNT DETAILS</h3>\n");
        out.write("                                            </div></td>\n");
        out.write("                                        </tr>\n");
        out.write("                                        <tr>\n");
        out.write("                                            <td width=\"254\" height=\"61\" align=\"left\" valign=\"top\"><p>&nbsp;</p>\n");
        out.write("                                            <p align=\"left\"><span class=\"style2\">\n");
        out.write("                                            \n");
        out.write("                                             \n");
        out.write("                                               User ID: <input type=\"text\" name=\"userid\"/>\n");
        out.write("                                               <h3>");
        if (_jspx_meth_html_errors_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("</h3>\n");
        out.write("                                            </p></td>\n");
        out.write("                                            <tr>\n");
        out.write("                                            <td width=\"150\" height=\"10\" align=\"left\" valign=\"top\">\n");
        out.write("                                            <p align=\"left\"><span class=\"style2\">\n");
        out.write("                                            \n");
        out.write("                                            Password: <input type=\"password\" name=\"pwd\"/>\n");
        out.write("                                            </p></td>\n");
        out.write("                                            <tr>\n");
        out.write("                                            <td width=\"150\" height=\"10\" align=\"left\" valign=\"top\">\n");
        out.write("                                            <p align=\"left\"><span class=\"style2\">\n");
        out.write("                                            \n");
        out.write("                                            Re-Enter Password: <input type=\"password\" name=\"pwd1\"/>\n");
        out.write("                                            </p></td>\n");
        out.write("                                             <tr>\n");
        out.write("                                            <td width=\"150\" height=\"10\" align=\"left\" valign=\"top\">\n");
        out.write("                                            <p align=\"left\"><span class=\"style2\"> \n");
        out.write("                                            \n");
        out.write("                                                 DATE OF OPENING: <input type=\"text\" name=\"dop\"/>\n");
        out.write("                                            </p></td>\n");
        out.write("                                            <tr>\n");
        out.write("                                            <td width=\"150\" height=\"10\" align=\"left\" valign=\"top\">\n");
        out.write("                                            <p align=\"left\"><span class=\"style2\">\n");
        out.write("                                            \n");
        out.write("                                               INITIAL AMOUNT: <input type=\"text\" name=\"bal\"/>(Rs 1000 is mandatory)\n");
        out.write("                                            </p></td>\n");
        out.write("                                             <tr>\n");
        out.write("                                            <td height=\"113\" colSpan=\"3\" align=\"left\" valign=\"top\">\n");
        out.write("                                                <p align=\"left\">&nbsp;</p>\n");
        out.write("                                                \n");
        out.write("                                                \n");
        out.write("                                                <div align=\"left\">\n");
        out.write("                                                  <div align=\"center\">\n");
        out.write("                                                     \n");
        out.write("                                             \n");
        out.write("                                            <input type=\"Submit\" value=\"Submit\" width=\"105\" height=\"21\" /></p>\n");
        out.write("                                                \n");
        out.write("                                                      </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                            </td>\n");
        out.write("                                        </tr>\n");
        out.write("                    </table>\n");
        out.write("    </form>                     \n");
        out.write("                                                  \n");
        out.write("                        <tr>\n");
        out.write("                         <td height=\"21\" colspan=\"4\" align=\"left\"><div align=\"center\">\n");
        out.write("                            ");
        if (_jspx_meth_html_link_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                |\n");
        out.write("                            ");
        if (_jspx_meth_html_link_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                         </td>\n");
        out.write("                        </tr>\n");
        out.write("                    \n");
        out.write("    </body>\n");
        int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
      return true;
    }
    _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
    return false;
  }

  private boolean _jspx_meth_html_link_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_style_forward.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_0.setPageContext(_jspx_page_context);
    _jspx_th_html_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_0.setForward("home");
    _jspx_th_html_link_0.setStyle("text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;");
    int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
    if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_0.doInitBody();
      }
      do {
        out.write(" Home ");
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
    _jspx_th_html_link_1.setForward("login");
    _jspx_th_html_link_1.setStyle("text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;");
    int _jspx_eval_html_link_1 = _jspx_th_html_link_1.doStartTag();
    if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_1.doInitBody();
      }
      do {
        out.write("Login ");
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
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_style_forward.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_2.setPageContext(_jspx_page_context);
    _jspx_th_html_link_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_2.setForward("registration");
    _jspx_th_html_link_2.setStyle("text-decoration:none; color:#000066; font-family:Arial, Helvetica, sans-serif;");
    int _jspx_eval_html_link_2 = _jspx_th_html_link_2.doStartTag();
    if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_2.doInitBody();
      }
      do {
        out.write("Register");
        int evalDoAfterBody = _jspx_th_html_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_style_forward.reuse(_jspx_th_html_link_2);
      return true;
    }
    _jspx_tagPool_html_link_style_forward.reuse(_jspx_th_html_link_2);
    return false;
  }

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_errors_0.setProperty("userid");
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
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
    _jspx_th_html_link_3.setForward("aboutus");
    int _jspx_eval_html_link_3 = _jspx_th_html_link_3.doStartTag();
    if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_3.doInitBody();
      }
      do {
        out.write(" About us");
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
    _jspx_th_html_link_4.setForward("contactus");
    int _jspx_eval_html_link_4 = _jspx_th_html_link_4.doStartTag();
    if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_4.doInitBody();
      }
      do {
        out.write(" Contact us ");
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
}
