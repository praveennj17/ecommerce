<%--
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : sunil
--%>
<%@attribute name="text"%>
<%@attribute name="id"%>
<%@attribute name="style"%>
<%@attribute name="styleClass"%>
<%@attribute name="title"%>
<%@attribute name="tooltip"%>
<%@attribute name="tooltipClass"%>
<%@attribute name="for"%>
<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags/cong" prefix="cong" %>

<c:choose>
    <c:when test="${empty tooltip}">
        <label id="${id}" style="${style}" class="${styleClass}" title="${title}" for="${for}">
            ${text}
        </label>
    </c:when>
    <c:otherwise>        
         <label id="${id}" style="${style}" class="${styleClass} ${tooltipClass}" title="${title}" for="${for}">
            ${text}
        </label>       
    </c:otherwise>
</c:choose>
