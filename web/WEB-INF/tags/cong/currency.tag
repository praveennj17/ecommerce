<%@include file="/taglib.jsp" %>
<%@attribute name="value"%>
<%@attribute name="currency"%>
<%@attribute name="um"%>
<c:if test="${not empty currency}">
    <font style="color: #005500;font-weight: bold">${currency}</font>
</c:if>
<font><fmt:formatNumber pattern="0.00" value="${value}"/></font>
<c:if test="${not empty um}">
    &nbsp;(${um})
</c:if>
