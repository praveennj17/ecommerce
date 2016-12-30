<%@include file="/constant.jsp" %>
<%@attribute name="width"%>
<%@attribute name="align"%>
<%@attribute name="colspan"%>
<%@attribute name="rowspan"%>
<%@attribute name="height"%>
<%@attribute name="styleClass"%>
<%@attribute name="style"%>
<%@attribute name="maxLength"%>
<td width="${width}" align="${align}" style="${style}" colspan="${colspan}" class="${styleClass}" rowspan="${rowspan}" valign="top" height="${height}">
    <jsp:doBody/>
    <jsp:setProperty name="maxUtil" property="index" value="${tdIndex}"/>
    <jsp:setProperty name="maxUtil" property="maxLength" value="${maxLength}"/>
</td>
<c:set var="tdIndex" value="${tdIndex+1}" scope="session"/>