package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;
import javax.servlet.http.*;

public final class Transfer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_style_forward;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_style_forward = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_errors_property_nobody.release();
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
          out.write("        <title>Transfer Money</title>\n");
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
 
                        String str=(String)session.getAttribute("uname");
                           GetInfo g=new GetInfo();
                           String s2= g.fname(str);
                           double bal= g.bal(str);
                        
          out.write("\n");
          out.write("        <table width=\"65%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
          out.write("            <tr>\n");
          out.write("                <td height=\"125\" colspan=\"4\" align=\"left\" valign=\"top\"><img src=\"Images/abc.jpg\" alt=\"banner\" width=\"65%\" height=\"125\"></td>\n");
          out.write("            </tr>\n");
          out.write("            <tr align=\"right\" valign=\"middle\" bgcolor=\"#3366FF\">\n");
          out.write("                <td width=\"533\" valign=\"top\" bgcolor=\"#79BCFF\"><span>&nbsp;&nbsp;\n");
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
          out.write("                        \n");
          out.write("        </table>\n");
          out.write("                        <h3> <p align=\"center\" style=\"text-decoration:blink\">WELCOME ");
          out.print(s2.toUpperCase());
          out.write("!!! </h3>\n");
          out.write("                            <h3> <p align=\"center\" style=\"text-decoration:blink\">Your Account Balance is ");
          out.print( bal );
          out.write("!!! </h3>\n");
          out.write("        <table>\n");
          out.write("        <td width=\"564\" align=\"left\" valign=\"top\"><h2 align=\"center\">&nbsp;</h2>\n");
          out.write("                                <h2 align=\"center\"><font color=\"#CC0033\" >Transfer Money</font></h2>\n");
          out.write("                                <p align=\"center\">&nbsp;</p>   \n");
          out.write("        </table> \n");
          out.write("                        \n");
          out.write("                        <form action=\"trans.do\" method=\"post\">\n");
          out.write("                        <table width=\"557\" height=\"255\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
          out.write("                                           <tr>\n");
          out.write("                                            <td width=\"254\" height=\"61\" align=\"left\" valign=\"top\"><p>&nbsp;</p>\n");
          out.write("                                            <p align=\"right\"><span class=\"style2\">&nbsp;&nbsp;Enter the User ID of the Person You Want to Transfer Money To                 </span></p></td>\n");
          out.write("                                            <td width=\"151\" align=\"left\" valign=\"top\"><p class=\"style2\">&nbsp;\n");
          out.write("                                                </p>\n");
          out.write("                                                \n");
          out.write("                                                <p align=\"left\" class=\"style2\">\n");
          out.write("                                                  <input type=\"text\" name=\"uid\"/>\n");
          out.write("                                                  ");
          if (_jspx_meth_html_errors_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                  ");
          if (_jspx_meth_html_errors_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                  \n");
          out.write("                                              \n");
          out.write("                                            </p>\n");
          out.write("                                            </td>\n");
          out.write("                                            <td width=\"152\" align=\"left\" valign=\"top\"><p>&nbsp;</p>\n");
          out.write("                                            </tr>\n");
          out.write("                                            <td width=\"152\" align=\"left\" valign=\"top\"><p>&nbsp;</p>\n");
          out.write("                                            </tr>\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td height=\"58\" align=\"left\" valign=\"top\"><p>&nbsp;</p>\n");
          out.write("                                            <p align=\"right\" class=\"style2\"> Enter the amount You want to Transfer  </p></td>\n");
          out.write("                                            <td align=\"left\" valign=\"top\">\n");
          out.write("                                                <p class=\"style2\">&nbsp;                    </p>\n");
          out.write("                                                <p align=\"left\" class=\"style2\">\n");
          out.write("                                                  <input type=\"text\" name=\"amt\"/>\n");
          out.write("                                                  ");
          if (_jspx_meth_html_errors_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                  ");
          if (_jspx_meth_html_errors_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                            </p>                \n");
          out.write("                                            </td>\n");
          out.write("                                           \n");
          out.write("                                        </tr>\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td height=\"58\" align=\"left\" valign=\"top\"><p>&nbsp;</p>\n");
          out.write("                                            <p align=\"right\" class=\"style2\"> Enter Your Password  </p></td>\n");
          out.write("                                            <td align=\"left\" valign=\"top\">\n");
          out.write("                                                <p class=\"style2\">&nbsp;                    </p>\n");
          out.write("                                                <p align=\"left\" class=\"style2\">\n");
          out.write("                                                  <input type=\"password\" name=\"pwd\"/>\n");
          out.write("                                                  ");
          if (_jspx_meth_html_errors_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                  ");
          if (_jspx_meth_html_errors_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                \n");
          out.write("                                            </p>                \n");
          out.write("                                            </td>\n");
          out.write("                                           \n");
          out.write("                                        </tr>\n");
          out.write("                                            <tr>\n");
          out.write("                                            <tr>\n");
          out.write("                                            <td height=\"113\" colSpan=\"3\" align=\"left\" valign=\"top\">\n");
          out.write("                                                <p align=\"left\"></p>\n");
          out.write("                                                \n");
          out.write("                                                \n");
          out.write("                                                \n");
          out.write("                                                \n");
          out.write("                                                <div align=\"left\">\n");
          out.write("                                                  <div align=\"center\">\n");
          out.write("                                                      \n");
          out.write("                                            <input type=\"Submit\" value=\"Transfer\" width=\"105\" height=\"21\" />\n");
          out.write("                                              \n");
          out.write("                                            </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                  </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                         </table>\n");
          out.write("                                            </form>\n");
          out.write("                                      \n");
          out.write("           \n");
          out.write("       \n");
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

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_errors_0.setProperty("uname");
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_html_errors_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_1 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_1.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_errors_1.setProperty("a");
    int _jspx_eval_html_errors_1 = _jspx_th_html_errors_1.doStartTag();
    if (_jspx_th_html_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_1);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_1);
    return false;
  }

  private boolean _jspx_meth_html_errors_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_2 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_2.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_errors_2.setProperty("amt");
    int _jspx_eval_html_errors_2 = _jspx_th_html_errors_2.doStartTag();
    if (_jspx_th_html_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_2);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_2);
    return false;
  }

  private boolean _jspx_meth_html_errors_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_3 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_3.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_errors_3.setProperty("o");
    int _jspx_eval_html_errors_3 = _jspx_th_html_errors_3.doStartTag();
    if (_jspx_th_html_errors_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_3);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_3);
    return false;
  }

  private boolean _jspx_meth_html_errors_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_4 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_4.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_errors_4.setProperty("pwd");
    int _jspx_eval_html_errors_4 = _jspx_th_html_errors_4.doStartTag();
    if (_jspx_th_html_errors_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_4);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_4);
    return false;
  }

  private boolean _jspx_meth_html_errors_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_5 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_5.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_errors_5.setProperty("p");
    int _jspx_eval_html_errors_5 = _jspx_th_html_errors_5.doStartTag();
    if (_jspx_th_html_errors_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_5);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_5);
    return false;
  }
}
