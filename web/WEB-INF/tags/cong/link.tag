<%--
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : sunil
--%>
<%@taglib tagdir="/WEB-INF/tags/cong" prefix="cong" %>
<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@attribute name="href" required="true"%>
<%@attribute name="styleClass"%>
<%@attribute name="tooltip"%>
<%@attribute name="title"%>
<%@attribute name="text1"%>
<%@attribute name="confirmMessage"%>
<%@attribute name="tooltipClass"%>

<c:choose>
    <c:when test="${not empty confirmMessage}">
        <c:set  var="confirmClass" value="confirm"/>
    </c:when>
    <c:otherwise>
        <c:set  var="confirmClass" value=""/>
    </c:otherwise>
</c:choose>

<a href="${href}" class="${styleClass} ${tooltipClass} ${confirmClass}" message="${confirmMessage}" title="${title}" text1="${text1}"><jsp:doBody/></a>
