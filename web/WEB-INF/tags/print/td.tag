<%@include file="/constant.jsp" %>
<%@attribute name="width"%>
<%@attribute name="align"%>
<%@attribute name="colspan"%>
<%@attribute name="rowspan"%>
<%@attribute name="styleClass"%>
<%@attribute name="style"%>
<td width="${width}" align="${align}" style="${style}" colspan="${colspan}" class="${styleClass}" rowspan="${rowspan}" valign="top">
    <jsp:doBody var="xDoBody"/>    
    ${xDoBody}
    <jsp:setProperty name="maxUtil" property="index" value="${tdIndex}"/>
    <jsp:setProperty name="maxUtil" property="value" value="${xDoBody}"/>    
    <c:if test="${not breakNextTr}">
        <c:set var="breakNextTr" value="${maxUtil.overFlow}" scope="session"/>
    </c:if>    
</td>
<c:set var="tdIndex" value="${tdIndex+1}" scope="session"/>
