<%@include file="/constant.jsp" %>
<%@attribute name="value" type="java.util.Date"%>
<%@attribute name="useLocale" type="java.lang.Boolean"%>
<%@attribute name="dateString"%>
<%@attribute name="dateFormat"%>
<%@attribute name="format"%>

<c:choose>
    <c:when test="${not empty value}">
        <jsp:setProperty name="dateUtil" property="date" value="${value}"/>
    </c:when>
    <c:when test="${not empty dateString}">
        <jsp:setProperty name="dateUtil" property="dateString" value="${dateString}"/> 
        <jsp:setProperty name="dateUtil" property="format" value="${dateFormat}"/>
        <c:set var="value" value="${dateUtil.parseToDate}"/>
    </c:when>
</c:choose>

<c:choose>
    <c:when test="${useLocale}">
        <jsp:setProperty name="dateUtil" property="format" value="${format}"/>
        <c:set var="formattedDate" value="${dateUtil.formattedDate}"/>
    </c:when>
    <c:when test="${not empty value}">
        <c:choose>
            <c:when test="${not empty format}">
                <fmt:formatDate var="formattedDate"  value="${value}" pattern="${format}"  />
            </c:when>
            <c:otherwise>
                <fmt:formatDate var="formattedDate"  value="${value}" pattern="MM/dd/yyyy"  />
            </c:otherwise>
        </c:choose>
    </c:when>
</c:choose>
${formattedDate}