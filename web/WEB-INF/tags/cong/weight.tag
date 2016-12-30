<%@include file="/taglib.jsp" %>
<%@attribute name="value"%>
<%@attribute name="um"%>
<font><fmt:formatNumber pattern="0.000" value="${value}"/></font>
<c:if test="${not empty um}">
    &nbsp;(${um})
</c:if>