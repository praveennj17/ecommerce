<%-- 
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : sunil
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@include file="/constant.jsp" %>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="styleClass"%>
<%@attribute name="style"%>
<%@attribute name="caption"%>
<jsp:getProperty name="maxUtil" property="reset"/>
<table class="table-sty3 input-sty ${styleClass}" style="${style}">
    <c:if test="${caption != null}">
        <caption>${caption}</caption>
    </c:if>
    <jsp:doBody/>
</table>    