/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.98
 * Generated at: 2025-04-01 15:25:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.base.ServerConfiguration;
import static org.wso2.carbon.identity.core.util.IdentityCoreConstants.PROXY_CONTEXT_PATH;
import static org.wso2.carbon.identity.core.util.IdentityUtil.getServerURL;
import static org.wso2.carbon.utils.multitenancy.MultitenantConstants.TENANT_AWARE_URL_PREFIX;
import static org.wso2.carbon.utils.multitenancy.MultitenantConstants.SUPER_TENANT_DOMAIN_NAME;
import org.apache.commons.lang.StringUtils;
import static org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.isOrganizationManagementEnabled;
import static org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.isAdaptiveAuthenticationAvailable;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(11);
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.core.util.IdentityCoreConstants.PROXY_CONTEXT_PATH");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.core.util.IdentityUtil.getServerURL");
    _jspx_imports_classes.add("static org.wso2.carbon.utils.multitenancy.MultitenantConstants.TENANT_AWARE_URL_PREFIX");
    _jspx_imports_classes.add("static org.wso2.carbon.utils.multitenancy.MultitenantConstants.SUPER_TENANT_DOMAIN_NAME");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.isAdaptiveAuthenticationAvailable");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.isOrganizationManagementEnabled");
    _jspx_imports_classes.add("org.wso2.carbon.base.ServerConfiguration");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\n");
      out.write("~    Copyright (c) 2022, WSO2 Inc. (http://www.wso2.com). All Rights Reserved.\n");
      out.write("~\n");
      out.write("~    This software is the property of WSO2 Inc. and its suppliers, if any.\n");
      out.write("~    Dissemination of any information or reproduction of any material contained\n");
      out.write("~    herein in any form is strictly forbidden, unless permitted by WSO2 expressly.\n");
      out.write("~    You may not alter or remove any copyright or other notice from copies of this content.\"\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String is_cookiepro_enabled = System.getenv("is_cookiepro_enabled"); 
      out.write('\n');
 String initialScriptType = (Boolean.TRUE.toString()).equals(is_cookiepro_enabled) ? "text/plain" : "text/javascript"; 
      out.write('\n');
 String cookiepro_domain_script_id = System.getenv("cookiepro_domain_script_id"); 
      out.write('\n');
      out.write('\n');

    session.setAttribute("authCode",request.getParameter("code"));
    session.setAttribute("sessionState", request.getParameter("session_state"));
    if(request.getParameter("state") != null) {session.setAttribute("state", request.getParameter("state"));}

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta charset=\"utf-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n");
      out.write("        <meta name=\"referrer\" content=\"no-referrer\" />\n");
      out.write("\n");
      out.write("        <link href=\"/console/libs/themes/wso2is/theme.431fb876.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/console/libs/themes/wso2is/assets/images/branding/favicon.ico\" />\n");
      out.write("\n");
      out.write("        ");
 if ((Boolean.TRUE.toString()).equals(is_cookiepro_enabled)) { 
      out.write("\n");
      out.write("             <!-- CookiePro Cookies Consent Notice start for asgardeo.io -->\n");
      out.write("            <script src=\"https://cookie-cdn.cookiepro.com/scripttemplates/otSDKStub.js\"  type=\"text/javascript\" charset=\"UTF-8\" data-domain-script=\"");
      out.print( cookiepro_domain_script_id );
      out.write("\" ></script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                function OptanonWrapper() {\n");
      out.write("                    // Get initial OnetrustActiveGroups ids\n");
      out.write("                    if (typeof OptanonWrapperCount == \"undefined\") {\n");
      out.write("                        otGetInitialGroups();\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Delete cookies\n");
      out.write("                    otDeleteCookie(otInitialConsentedGroups);\n");
      out.write("\n");
      out.write("                    // Assign OnetrustActiveGroups to custom variable\n");
      out.write("                    function otGetInitialGroups() {\n");
      out.write("                        OptanonWrapperCount = \"\";\n");
      out.write("                        otInitialConsentedGroups =  OnetrustActiveGroups;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    function otDeleteCookie(iniOptGrpIdsListStr) {\n");
      out.write("                        try {\n");
      out.write("                            var otDomainGrps = JSON.parse(JSON.stringify(Optanon.GetDomainData().Groups));\n");
      out.write("                            // publish custom event to announce the cookie consent change\n");
      out.write("                            const cookiePrefChangeEvent = new CustomEvent(\"cookie-pref-change\", { pref: OnetrustActiveGroups });\n");
      out.write("                            window.dispatchEvent(cookiePrefChangeEvent)\n");
      out.write("                            // return consent revoked group id list\n");
      out.write("                            var otRevokedGrpIds = otGetInactiveId(iniOptGrpIdsListStr, OnetrustActiveGroups);\n");
      out.write("\n");
      out.write("                            if(otRevokedGrpIds.length != 0 && otDomainGrps.length != 0){\n");
      out.write("                                for(var i=0; i < otDomainGrps.length; i++){\n");
      out.write("                                    // Check if CustomGroupId matches\n");
      out.write("                                    if(otDomainGrps[i][\"CustomGroupId\"] != \"\" && otRevokedGrpIds.includes(otDomainGrps[i][\"CustomGroupId\"])){\n");
      out.write("                                        for(var j=0; j < otDomainGrps[i]['Cookies'].length; j++){\n");
      out.write("                                            console.info(\"Deleting cookie \",otDomainGrps[i]['Cookies'][j]['Name'])\n");
      out.write("                                            // Delete cookie\n");
      out.write("                                            eraseCookie(otDomainGrps[i][\"Cookies\"][j][\"Name\"]);\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    // Check if Hostid matches\n");
      out.write("                                    if(otDomainGrps[i][\"Hosts\"].length != 0){\n");
      out.write("                                        for(var j = 0; j < otDomainGrps[i][\"Hosts\"].length; j++){\n");
      out.write("                                            // Check if HostId presents in the deleted list and cookie array is not blank\n");
      out.write("                                            if(otRevokedGrpIds.includes(otDomainGrps[i][\"Hosts\"][j][\"HostId\"]) && otDomainGrps[i]['Hosts'][j]['Cookies'].length !=0){\n");
      out.write("                                                for(var k=0; k < otDomainGrps[i][\"Hosts\"][j][\"Cookies\"].length; k++){\n");
      out.write("                                                    // Delete cookie\n");
      out.write("                                                    eraseCookie(otDomainGrps[i][\"Hosts\"][j][\"Cookies\"][k][\"Name\"]);\n");
      out.write("                                                }\n");
      out.write("                                            }\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                            otGetInitialGroups(); //Reassign new group ids\n");
      out.write("                        } catch (err) {\n");
      out.write("                            console.error(err)\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Get inactive ids\n");
      out.write("                    function otGetInactiveId(prevGroupIdListStr, otActiveGrp) {\n");
      out.write("                        prevGroupIdList = prevGroupIdListStr.split(\",\");\n");
      out.write("                        prevGroupIdList = prevGroupIdList.filter(Boolean);\n");
      out.write("\n");
      out.write("                        // After action OnetrustActiveGroups\n");
      out.write("                        otActiveGrp = otActiveGrp.split(\",\");\n");
      out.write("                        otActiveGrp = otActiveGrp.filter(Boolean);\n");
      out.write("\n");
      out.write("                        var result = [];\n");
      out.write("                        for (var i = 0; i < prevGroupIdList.length; i++){\n");
      out.write("                            if (otActiveGrp.indexOf(prevGroupIdList[i]) <= -1){\n");
      out.write("                                result.push(prevGroupIdList[i]);\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                        return result;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Delete cookie\n");
      out.write("                    function eraseCookie(name) {\n");
      out.write("                        // Delete root path cookies\n");
      out.write("                        domainName = window.location.hostname;\n");
      out.write("                        document.cookie = name+\"=; Max-Age=-99999999; Path=/;Domain=\"+ domainName;\n");
      out.write("                        document.cookie = name+\"=; Max-Age=-99999999; Path=/;\";\n");
      out.write("\n");
      out.write("                        // Delete LSO incase LSO being used, cna be commented out.\n");
      out.write("                        localStorage.removeItem(name);\n");
      out.write("\n");
      out.write("                        // Check for the current path of the page\n");
      out.write("                        pathArray = window.location.pathname.split('/');\n");
      out.write("                        // Loop through path hierarchy and delete potential cookies at each path.\n");
      out.write("                        for (var i = 0; i < pathArray.length; i++){\n");
      out.write("                            if (pathArray[i]){\n");
      out.write("                                // Build the path string from the Path Array e.g /site/login\n");
      out.write("                                var currentPath = pathArray.slice(0,i+1).join('/');\n");
      out.write("                                document.cookie = name+\"=; Max-Age=-99999999; Path=' + currentPath + ';Domain=\"+ domainName;\n");
      out.write("                                document.cookie = name+\"=; Max-Age=-99999999; Path=' + currentPath + ';\";\n");
      out.write("                                // Maybe path has a trailing slash!\n");
      out.write("                                document.cookie = name+\"=; Max-Age=-99999999; Path=' + currentPath + '/;Domain=\"+ domainName;\n");
      out.write("                                document.cookie = name+\"=; Max-Age=-99999999; Path=' + currentPath + '/;\";\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var contextPathGlobal = \"/console/\";\n");
      out.write("            var serverOriginGlobal = \"");
      out.print(getServerURL("", true, true));
      out.write("\";\n");
      out.write("            var proxyContextPathGlobal = \"");
      out.print(ServerConfiguration.getInstance().getFirstProperty(PROXY_CONTEXT_PATH));
      out.write("\";\n");
      out.write("            var superTenantGlobal = \"");
      out.print(SUPER_TENANT_DOMAIN_NAME);
      out.write("\";\n");
      out.write("            var tenantPrefixGlobal = \"");
      out.print(TENANT_AWARE_URL_PREFIX);
      out.write("\";\n");
      out.write("            var isAdaptiveAuthenticationAvailable = JSON.parse(\"");
      out.print( isAdaptiveAuthenticationAvailable() );
      out.write("\");\n");
      out.write("            var isOrganizationManagementEnabled = \"");
      out.print( isOrganizationManagementEnabled() );
      out.write("\" === \"true\";\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var userAccessedPath = sessionStorage.getItem(\"userAccessedPath\");\n");
      out.write("            var isSilentSignInDisabled = userAccessedPath.includes(\"disable_silent_sign_in\") ||\n");
      out.write("                                            window.location.href.includes(\"disable_silent_sign_in\");\n");
      out.write("            var isInviteUserFlow = userAccessedPath.includes(\"invite_user\");\n");
      out.write("            var isApplicationsPath = userAccessedPath.includes(\"develop/applications\") ||\n");
      out.write("                                        window.location.href.includes(\"develop/applications\");\n");
      out.write("\n");
      out.write("            if(isInviteUserFlow) {\n");
      out.write("                window.location = window.location.origin;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- Start of custom stylesheets -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/console/extensions/stylesheet.css\"/>\n");
      out.write("        <!-- End of custom stylesheets -->\n");
      out.write("\n");
      out.write("        <!-- Start of custom scripts added to the head -->\n");
      out.write("        <script type=\"text/javascript\" src=\"/console/extensions/head-script.js\"></script>\n");
      out.write("        <!-- End of custom scripts added to the head -->\n");
      out.write("    <script defer src=\"/console/static/js/runtime.e01f489f.js?6003ef5f364b4666\"></script><script defer src=\"/console/static/js/vendor.691a15a3.js?6003ef5f364b4666\"></script><script defer src=\"/console/static/js/0.6f1123ea.js?6003ef5f364b4666\"></script><script defer src=\"/console/static/js/1.f18534f9.js?6003ef5f364b4666\"></script><script defer src=\"/console/static/js/certificate.2e0d06fe.js?6003ef5f364b4666\"></script><script defer src=\"/console/static/js/codemirror.ada5f8d6.js?6003ef5f364b4666\"></script><script defer src=\"/console/static/js/main.c79e7ad8.js?6003ef5f364b4666\"></script></head>\n");
      out.write("    <body>\n");
      out.write("        <noscript>\n");
      out.write("            You need to enable JavaScript to run this app.\n");
      out.write("        </noscript>\n");
      out.write("        <div id=\"root\"></div>\n");
      out.write("\n");
      out.write("        <!-- Start of custom scripts added to the body -->\n");
      out.write("        <script type=\"text/javascript\" src=\"/console/extensions/body-script.js\"></script>\n");
      out.write("        <!-- End of custom scripts added to the body -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
