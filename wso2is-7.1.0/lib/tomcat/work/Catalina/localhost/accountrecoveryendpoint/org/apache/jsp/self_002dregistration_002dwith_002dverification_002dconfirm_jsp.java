/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.98
 * Generated at: 2025-04-01 15:25:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.lang.StringUtils;
import org.owasp.encoder.Encode;
import org.wso2.carbon.base.MultitenantConstants;
import org.wso2.carbon.core.SameSiteCookie;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants;
import org.wso2.carbon.identity.base.IdentityRuntimeException;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil;
import org.wso2.carbon.identity.mgt.endpoint.util.client.PreferenceRetrievalClient;
import org.wso2.carbon.identity.mgt.endpoint.util.client.api.SelfRegisterApi;
import org.wso2.carbon.identity.mgt.endpoint.util.client.ApplicationDataRetrievalClient;
import org.wso2.carbon.identity.mgt.endpoint.util.client.ApplicationDataRetrievalClientException;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.CodeValidationRequest;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.Property;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.HttpMethod;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.User;
import org.wso2.carbon.identity.recovery.util.Utils;
import org.wso2.carbon.identity.core.util.IdentityUtil;
import javax.servlet.http.Cookie;
import java.util.Base64;
import org.wso2.carbon.identity.mgt.endpoint.util.client.PreferenceRetrievalClientException;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import java.util.*;
import org.json.JSONObject;
import java.util.Calendar;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;
import org.apache.commons.lang.StringUtils;

public final class self_002dregistration_002dwith_002dverification_002dconfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


    /**
     * Get the localized string for the given key.
     * Interacts with both the `resourceBundle` & the custom text from the Branding API.
     *
     * @param resourceBundle Resource bundle.
     * @param customText Custom text.
     * @param key Key of the localized string.
     * @return Localized string.
     */
    public String i18n(ResourceBundle resourceBundle, JSONObject customText, String key) {
        return i18n(resourceBundle, customText, key, null, true);
    }

    /**
     * Get the localized string for the given key.
     * Interacts with both the `resourceBundle` & the custom text from the Branding API.
     * Overloaded method with default value.
     *
     * @param resourceBundle Resource bundle.
     * @param customText Custom text.
     * @param key Key of the localized string.
     * @param defaultValue Default value.
     * @return Localized string.
     */
    public String i18n(ResourceBundle resourceBundle, JSONObject customText, String key, String defaultValue) {
        return i18n(resourceBundle, customText, key, defaultValue, true);
    }

    /**
     * Get the localized string for the given key.
     * Interacts with both the `resourceBundle` & the custom text from the Branding API.
     * Overloaded method with default value with the ability to not fallback to resource bundle and return "" as default.
     *
     * @param resourceBundle Resource bundle.
     * @param customText Custom text.
     * @param key Key of the localized string.
     * @param defaultValue Default value.
     * @param shouldFallbackToResourceBundle Should fallback to resource bundle.
     * @return Localized string.
     */
    public String i18n(ResourceBundle resourceBundle, JSONObject customText, String key, String defaultValue, boolean shouldFallbackToResourceBundle) {
        String localizedString = null;
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        try {
            if (customText != null && customText.has(key)) {
                localizedString = Encode.forHtmlContent(customText.getString(key));
            } else {
                if (StringUtils.isNotBlank(defaultValue)) {
                    localizedString = Encode.forHtmlContent(defaultValue);
                } else if (shouldFallbackToResourceBundle) {
                    localizedString = IdentityManagementEndpointUtil.i18n(resourceBundle, key);
                } else {
                    localizedString = "";
                }
            }
        } catch (Exception e) {
            // Return the key itself as a fallback
            localizedString = Encode.forHtmlContent(key);
        }

        // Replace newline characters with actual line breaks
        localizedString = localizedString.replace("\\n", "\n");

        return localizedString.replace("{{currentYear}}", String.valueOf(currentYear));
    }

    /**
     * Replaces i18n path placeholders in a given link with locale and country codes.
     *
     * @param locale The locale from which to derive values for placeholders.
     * @param link The link containing i18n placeholders (e.g., {{lang}}, {{country}}, {{locale}}).
     * @return The link with placeholders replaced by actual values based on the given locale.
     */
    public String i18nLink(Locale locale, String link) {
        String transformedLink = link;

        try {
            String langCode = locale.getLanguage();
            String countryCode = locale.getCountry();
            String localeCode = locale.toLanguageTag();

            String LANGUAGE_PLACEHOLDER = "{{lang}}";
            String COUNTRY_PLACEHOLDER = "{{country}}";
            String LOCALE_PLACEHOLDER = "{{locale}}";

            if (transformedLink.contains(LANGUAGE_PLACEHOLDER) || transformedLink.contains(COUNTRY_PLACEHOLDER) || transformedLink.contains(LOCALE_PLACEHOLDER)) {
                transformedLink = transformedLink
                    .replace("{{lang}}", langCode)
                    .replace("{{country}}", countryCode)
                    .replace("{{locale}}", localeCode);
            } else {
                if (transformedLink.contains("?")) {
                    return transformedLink.concat("&ui_locales=" + localeCode);
                } else {
                    return transformedLink.concat("?ui_locales=" + localeCode);
                }
            }

            return StringEscapeUtils.escapeHtml4(transformedLink);
        } catch (Exception e) {
            // Return the link itself as a fallback.
            return StringEscapeUtils.escapeHtml4(transformedLink);
        }
    }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/tenant-resolve.jsp", Long.valueOf(1740062656000L));
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1740062656000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(39);
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.PreferenceRetrievalClientException");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.User");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil");
    _jspx_imports_classes.add("javax.ws.rs.HttpMethod");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.ApplicationDataRetrievalClient");
    _jspx_imports_classes.add("org.owasp.encoder.Encode");
    _jspx_imports_classes.add("org.json.JSONObject");
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("org.wso2.carbon.base.MultitenantConstants");
    _jspx_imports_classes.add("javax.servlet.http.Cookie");
    _jspx_imports_classes.add("org.wso2.carbon.identity.core.util.IdentityTenantUtil");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.PreferenceRetrievalClient");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.api.SelfRegisterApi");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("org.apache.commons.text.StringEscapeUtils");
    _jspx_imports_classes.add("org.wso2.carbon.core.SameSiteCookie");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
    _jspx_imports_classes.add("org.wso2.carbon.identity.base.IdentityRuntimeException");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Base64");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.Property");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.ApplicationDataRetrievalClientException");
    _jspx_imports_classes.add("org.wso2.carbon.identity.recovery.util.Utils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.core.util.IdentityUtil");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.CodeValidationRequest");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
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
      out.write("\n");
      out.write("\n");

    String lang = "en_US"; // Default lang is en_US
    String COOKIE_NAME = "ui_lang";
    Locale browserLocale = request.getLocale();
    Locale userLocale = browserLocale;
    String uiLocaleFromURL = request.getParameter("ui_locales");
    String localeFromCookie = null;
    String BUNDLE = "org.wso2.carbon.identity.mgt.recovery.endpoint.i18n.Resources";

    // List of screen names for retrieving text branding customizations.
    List<String> screenNames = new ArrayList<>();
    screenNames.add("common");

    // Map to store default supported language codes.
    // TODO: Use this map to generate the `language-switcher.jsp`.
    Map<String, String> supportedLanguages = new HashMap<>();
    supportedLanguages.put("en", "US");
    supportedLanguages.put("fr", "FR");
    supportedLanguages.put("es", "ES");
    supportedLanguages.put("pt", "PT");
    supportedLanguages.put("de", "DE");
    supportedLanguages.put("zh", "CN");
    supportedLanguages.put("ja", "JP");

    List<String> languageSupportedCountries = new ArrayList<>();
    languageSupportedCountries.add("US");
    languageSupportedCountries.add("FR");
    languageSupportedCountries.add("ES");
    languageSupportedCountries.add("PT");
    languageSupportedCountries.add("DE");
    languageSupportedCountries.add("CN");
    languageSupportedCountries.add("JP");
    languageSupportedCountries.add("BR");

    // Check cookie for the user selected language first
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(COOKIE_NAME)) {
                localeFromCookie = cookie.getValue();
            }
        }
    }

    // Set lang from the priority order
    if (localeFromCookie != null) {
        lang = localeFromCookie;

        try {
            String langStr = "en";
            String langLocale = "US";

            if (lang.contains("_")) {
                langStr = lang.split("_")[0];
                langLocale = lang.split("_")[1];
            } else if (lang.contains("-")) {
                langStr = lang.split("-")[0];
                langLocale = lang.split("-")[1];
            }

            userLocale = new Locale(langStr, langLocale);
        } catch (Exception e) {
            // In case the language is defined but not in the correct format
            userLocale = browserLocale;
        }
    } else if (uiLocaleFromURL != null) {
        for (String localeStr : uiLocaleFromURL.split(" ")) {
            String langStr = "en";
            String langLocale = "US";

            if (localeStr.contains("_")) {
                langStr = localeStr.split("_")[0];
                langLocale = localeStr.split("_")[1];
            } else if (localeStr.contains("-")) {
                langStr = localeStr.split("-")[0];
                langLocale = localeStr.split("-")[1];
            }

            Locale tempLocale = new Locale(langStr, langLocale);

            // Trying to find out whether we have resource bundle for the given locale
            try {
                ResourceBundle foundBundle = ResourceBundle.getBundle(BUNDLE, tempLocale);

                // If so, setting the userLocale to that locale. If not, set the browser locale as user locale
                // Currently, we only care about the language - we do not compare about country locales since our
                // supported locale set is limited.
                if (tempLocale.getLanguage().equals(foundBundle.getLocale().getLanguage())) {
                    userLocale = tempLocale;
                    break;
                } else if (tempLocale.getLanguage().equals("en") && foundBundle.getLocale().getLanguage().equals("")) {
                    // When the given locale is en - which is our fallback one, we have to handle it separately because
                    // returns and empty string as locale language
                    userLocale = tempLocale;
                    break;
                } else {
                    userLocale = browserLocale;
                }
            } catch (Exception e) {
                userLocale = browserLocale;
            }
        }
    } else {
        // `browserLocale` is coming as `en` instead of `en_US` for the first render before switching the language from the dropdown.
        String countryCode = browserLocale.getCountry();
        String fallbackCountryCode = supportedLanguages.get(browserLocale.getLanguage());

        if (StringUtils.isNotBlank(countryCode) && languageSupportedCountries.contains(countryCode)) {
            userLocale = new Locale(browserLocale.getLanguage(), countryCode);
        } else if (StringUtils.isNotBlank(fallbackCountryCode)){
            userLocale = new Locale(browserLocale.getLanguage(), fallbackCountryCode);
        } else {
            userLocale = new Locale("en","US");
        }
    }

    ResourceBundle recoveryResourceBundle = ResourceBundle.getBundle(BUNDLE, userLocale, new
        EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String tenantDomain;
    String tenantForTheming;
    String userTenant;
    String userTenantDomain;
    String spAppName = request.getParameter("sp");
    String spAppId = request.getParameter("spId");

    if (IdentityTenantUtil.isTenantQualifiedUrlsEnabled()) {
        tenantDomain = IdentityTenantUtil.resolveTenantDomain();
        String tenantDomainFromURL = request.getParameter("t");
        if (IdentityManagementEndpointConstants.SUPER_TENANT.equals(tenantDomain) &&
                !StringUtils.isBlank(tenantDomainFromURL)) {
            tenantDomain = tenantDomainFromURL;
        }
        tenantForTheming = tenantDomain;
        userTenant = tenantDomain;
        String tenantDomainOfUser = request.getParameter("ut");
        userTenantDomain = tenantDomainOfUser;

        if (StringUtils.equals(tenantDomain, IdentityManagementEndpointConstants.SUPER_TENANT)
            && StringUtils.equals(spAppName, "Console")) {
            tenantForTheming = IdentityManagementEndpointConstants.SUPER_TENANT;
        } else {
            if (StringUtils.isBlank(userTenantDomain)) {
                userTenantDomain = tenantDomainFromURL;
            }
            if (StringUtils.isBlank(userTenantDomain)) {
                userTenantDomain = tenantDomain;
            }
            if (StringUtils.isNotBlank(tenantDomainOfUser)) {
                tenantForTheming = tenantDomainOfUser;
            }
            if (StringUtils.equals(spAppName, "My Account")
                && StringUtils.equals(tenantDomain, IdentityManagementEndpointConstants.SUPER_TENANT)) {
                tenantForTheming = userTenantDomain;
                userTenant = userTenantDomain;
            }
        }
    } else {
        tenantDomain = request.getParameter("tenantDomain");
        String tenantDomainFromURL = request.getParameter("t");
        String tenantDomainOfUser = request.getParameter("ut");

        if (StringUtils.isBlank(tenantDomain)) {
            tenantDomain = request.getParameter(IdentityManagementEndpointConstants.TENANT_DOMAIN);
        }

        if (!StringUtils.isBlank(tenantDomainFromURL)) {
            tenantDomain = tenantDomainFromURL;
        }

        tenantForTheming = tenantDomain;
        userTenant = tenantDomain;
        userTenantDomain = tenantDomainOfUser;

        if (StringUtils.equals(tenantDomain, IdentityManagementEndpointConstants.SUPER_TENANT)
            && StringUtils.equals(spAppName, "Console")) {
            tenantForTheming = IdentityManagementEndpointConstants.SUPER_TENANT;
        } else {
            if (StringUtils.isBlank(userTenantDomain)) {
                userTenantDomain = tenantDomainFromURL;
            }
            if (StringUtils.isBlank(userTenantDomain)) {
                userTenantDomain = tenantDomain;
            }
            if (StringUtils.isNotBlank(tenantDomainOfUser)) {
                tenantForTheming = tenantDomainOfUser;
            }
            if (StringUtils.equals(spAppName, "My Account")
                && StringUtils.equals(tenantDomain, IdentityManagementEndpointConstants.SUPER_TENANT)) {
                tenantForTheming = userTenantDomain;
                userTenant = userTenantDomain;
            }
        }
    }

    // If `tenantDomain` is null, fallback to super tenant.
    if (StringUtils.isBlank(tenantDomain)) {
        tenantDomain = IdentityManagementEndpointConstants.SUPER_TENANT;
    }
    // If `tenantForTheming` is null, fallback to super tenant.
    if (StringUtils.isBlank(tenantForTheming)) {
        tenantForTheming = IdentityManagementEndpointConstants.SUPER_TENANT;
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');

    boolean error = IdentityManagementEndpointUtil.getBooleanValue(request.getAttribute("error"));
    String errorMsg = IdentityManagementEndpointUtil.getStringValue(request.getAttribute("errorMsg"));
    String AUTO_LOGIN_COOKIE_NAME = "ALOR";
    String AUTO_LOGIN_COOKIE_DOMAIN = "AutoLoginCookieDomain";
    String AUTO_LOGIN_FLOW_TYPE = "SELF_SIGNUP";
    String username = null;
    String applicationAccessUrl = "";

    String confirmationKey = request.getParameter("confirmation");
    String callback = request.getParameter("callback");
    String httpMethod = request.getMethod();
    String sp = Encode.forJava(request.getParameter("sp"));
    PreferenceRetrievalClient preferenceRetrievalClient = new PreferenceRetrievalClient();
    Boolean isAutoLoginEnable = preferenceRetrievalClient.checkAutoLoginAfterSelfRegistrationEnabled(tenantDomain);

    // Some mail providers initially sends a HEAD request to
    // check the validity of the link before redirecting users.
    if (StringUtils.equals(httpMethod, HttpMethod.HEAD)) {
        response.setStatus(response.SC_OK);
        return;
    }

    if (error) {
        request.setAttribute("error", true);
        request.setAttribute("errorMsg", errorMsg);
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

    try {
        if (StringUtils.isNotBlank(sp)) {
            ApplicationDataRetrievalClient applicationDataRetrievalClient = new ApplicationDataRetrievalClient();
            applicationAccessUrl = applicationDataRetrievalClient.getApplicationAccessURL(tenantDomain, sp);
        }
    } catch (ApplicationDataRetrievalClientException e) {
        // Ignored.
    }

    Boolean isValidCallBackURL = false;
    try {
        if (StringUtils.isNotBlank(applicationAccessUrl)) {
            // Disregard callbackURL regex validation when accessURL is configured in the application.
            isValidCallBackURL = true;
        } else if (StringUtils.isNotBlank(callback)) {
            isValidCallBackURL = preferenceRetrievalClient.checkIfSelfRegCallbackURLValid(tenantDomain, callback);
        }
    } catch (PreferenceRetrievalClientException e) {
        request.setAttribute("error", true);
        request.setAttribute("errorMsg", IdentityManagementEndpointUtil
            .i18n(recoveryResourceBundle, "something.went.wrong.contact.admin"));
        IdentityManagementEndpointUtil.addErrorInformation(request, e);
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

    try {
        if (StringUtils.isNotBlank(callback) && !isValidCallBackURL) {
            request.setAttribute("error", true);
            request.setAttribute("errorMsg", IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                "Callback.url.format.invalid"));
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
    } catch (IdentityRuntimeException e) {
        request.setAttribute("error", true);
        request.setAttribute("errorMsg", e.getMessage());
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

    if (StringUtils.isBlank(callback)) {
        callback = IdentityManagementEndpointUtil.getUserPortalUrl(
                application.getInitParameter(IdentityManagementEndpointConstants.ConfigConstants.USER_PORTAL_URL), tenantDomain);
    }


    if (StringUtils.isBlank(confirmationKey)) {
        confirmationKey = IdentityManagementEndpointUtil.getStringValue(request.getAttribute("confirmationKey"));
    }
    String message = "" ;

    try {
        SelfRegisterApi selfRegisterApi = new SelfRegisterApi();
        CodeValidationRequest validationRequest = new CodeValidationRequest();
        List<Property> properties = new ArrayList<>();
        Property tenantDomainProperty = new Property();
        tenantDomainProperty.setKey(MultitenantConstants.TENANT_DOMAIN);
        tenantDomainProperty.setValue(tenantDomain);
        properties.add(tenantDomainProperty);

        validationRequest.setCode(confirmationKey);
        validationRequest.setProperties(properties);

        User user = selfRegisterApi.validateCodeUserPostCall(validationRequest);
        username = user.getUsername();
        String userStoreDomain = user.getRealm();
        tenantDomain = user.getTenantDomain();
        if (isAutoLoginEnable) {
            username = userStoreDomain + "/" + username + "@" + tenantDomain;

            String cookieDomain = application.getInitParameter(AUTO_LOGIN_COOKIE_DOMAIN);
            JSONObject contentValueInJson = new JSONObject();
            contentValueInJson.put("username", username);
            contentValueInJson.put("createdTime", System.currentTimeMillis());
            contentValueInJson.put("flowType", AUTO_LOGIN_FLOW_TYPE);
            if (StringUtils.isNotBlank(cookieDomain)) {
                contentValueInJson.put("domain", cookieDomain);
            }
            String content = contentValueInJson.toString();

            JSONObject cookieValueInJson = new JSONObject();
            cookieValueInJson.put("content", content);
            String signature = Base64.getEncoder().encodeToString(IdentityUtil.signWithTenantKey(content, user.getTenantDomain()));
            cookieValueInJson.put("signature", signature);
            String cookieValue = Base64.getEncoder().encodeToString(cookieValueInJson.toString().getBytes());

            IdentityManagementEndpointUtil.setCookie(request, response, AUTO_LOGIN_COOKIE_NAME, cookieValue,
                300, SameSiteCookie.NONE, "/", cookieDomain);
            request.setAttribute("isAutoLoginEnabled", true);
        }

        request.setAttribute("callback", callback);
        request.setAttribute("confirm", "true");
        request.setAttribute("username", username);
        request.getRequestDispatcher("self-registration-complete.jsp").forward(request,response);
    } catch (Exception e) {
        IdentityManagementEndpointUtil.addErrorInformation(request, e);
        if (!StringUtils.isBlank(username)) {
            request.setAttribute("username", username);
        }
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en-US\">\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("</body>\n");
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
