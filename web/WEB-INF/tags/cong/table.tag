<%-- 
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : sunil
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="styleClass"%>
<%@attribute name="style"%>
<%@attribute name="caption"%>
<%@attribute name="id"%>
<%@attribute name="noDefaultStyle" type="java.lang.Boolean"%>
<c:if test="${empty noDefaultStyle}">
    <c:set var="noDefaultStyle" value="true"/>
</c:if>
<table class="table-sty4" style="${style}" id="${id}">
    <%--<table class="table-sty3 input-sty ${styleClass}">--%>
    <c:if test="${caption != null}">
        <caption>${caption}</caption>
    </c:if>
    <jsp:doBody/>
</table>    
