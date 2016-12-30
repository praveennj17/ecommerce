<%@include file="/taglib.jsp" %>
<%@attribute name="code" required="true"%>
<%@attribute name="fullWidth" type="java.lang.Boolean"%>
<%@attribute name="floatNone" type="java.lang.Boolean"%>
<c:if test="${fullWidth}">
    <c:set var="hundred" value="width:100%" scope="page"/>    
</c:if>
<c:set var="floatValue" value="float: left" scope="page"/>    
<c:if test="${floatNone}">
    <c:set var="floatValue" value="float: none" scope="page"/>    
</c:if>
<jsp:setProperty name="customUtil" property="code" value="${code}"/>
<c:choose>
    <c:when test="${user.debug}">
        <div style="border: dashed red 1px; ${floatValue}; ${hundred}" class="${styleClass}">
            <div id="${customUtil.custom.id}_tool">
                <font class="selected_${customUtil.custom.enabled} cursor" style="position: absolute" onclick="loadPage('#${customUtil.custom.id}_tool','${path}/custom.do?action=action&customId=${customUtil.custom.id}&enable=${customUtil.custom.enabled}')">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </font>
            </div>
            <jsp:doBody/>
        </div>
    </c:when>
    <c:otherwise>
        <c:if test="${customUtil.enabled}">
            <jsp:doBody/>
        </c:if>
    </c:otherwise>
</c:choose>
