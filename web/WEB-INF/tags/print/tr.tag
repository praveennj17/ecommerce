<%@attribute name="styleClass"%>
<%@attribute name="style"%>
<%@attribute name="id"%>
<%@include file="/constant.jsp" %>
<c:set var="tdIndex" value="0" scope="session"/>
<tr class="${styleClass} gap ${c_class}" id="${id}" style="${style}">
    <jsp:doBody/>
</tr>
<c:if test="${breakNextTr}">    
    <tr class="borderT"><td colspan="10">&nbsp;
    <pd4ml:page.break/>
    </td></tr>
</c:if>

<c:if test="${breakNextTr}">
    <c:set var="c_class" value="borderB"/>
    <jsp:getProperty name="maxUtil" property="reset"/>
    <c:set var="breakNextTr" value="false" scope="session"/>    
</c:if>
