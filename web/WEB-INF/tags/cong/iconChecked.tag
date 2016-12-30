<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%@attribute name="checked" required="true"%>
<c:choose>
    <c:when test="${checked != null && (checked =='true' ||  checked)}">
        <font class="icon app">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>
    </c:when>
    <c:otherwise>
        <font class="icon unapp">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>
    </c:otherwise>
</c:choose>   