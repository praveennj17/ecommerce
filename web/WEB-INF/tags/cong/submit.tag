<%--
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : sunil
--%>
<%@include file="/taglib.jsp" %>
<%@attribute name="label"%>
<%@attribute name="styleClass"%>
<%@attribute name="name"%>
<%@attribute name="disabled"%>
<%@attribute name="confirmMessage"%>
<%@attribute name="onclick"%>
<%@attribute name="onsubmit"%>
<c:if test="${empty name}">
    <c:set var="name" value="button"/>
</c:if>

<c:choose>
    <c:when test="${not empty confirmMessage}">
        <c:set  var="confirmClass" value="confirm"/>
    </c:when>
    <c:otherwise>
        <c:set  var="confirmClass" value=""/>
    </c:otherwise>
</c:choose>

<input type="submit" onsubmit="${onsubmit}" name="${name}" id="${name}" value="${label}" class="${styleClass} ${confirmClass}" ${disabled} onclick="${onclick}" message="${confirmMessage}"/>
