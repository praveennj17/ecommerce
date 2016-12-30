<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="styleClass"%>
<%@attribute name="value" required="true"%>

<option value="${value}">
    <jsp:doBody/>
</option>

