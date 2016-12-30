<%--
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : sunil
--%>
<%@taglib tagdir="/WEB-INF/tags/cong" prefix="cong" %>
<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%@taglib uri="/WEB-INF/tld/fn.tld" prefix="fn"%>
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@attribute name="name" required="true"%>
<%@attribute name="value"%>
<%@attribute name="label"%>
<%@attribute name="labeltitle"%>
<%@attribute name="styleClass"%>
<%@attribute name="readOnly" type="java.lang.Boolean"%>
<%@attribute name="disabled"%>
<%@attribute name="maxlength"%>
<%@attribute name="id"%>
<%@attribute name="validate"%>
<%@attribute name="table"%>
<%@attribute name="column"%>
<%@attribute name="container"%>
<%@attribute name="tooltip"%>
<%@attribute name="error_message"%>
<%@attribute name="URL"%>
<%@attribute name="rows"%>
<%@attribute name="cols"%>

<c:if test="${id == null}" var="_var">
    <c:set var="id" value="${name}"/>
</c:if>
<c:if test="${cols == null}">
    <c:set var="styleClass" value="${styleClass} text"/>
</c:if>
<c:if test="${container == null}">
    <c:set var="container" value="td"/>
</c:if>
<c:if test="${container != 'NULL'}">
    <${container}>
</c:if>

<c:if test="${readOnly}">
    <c:set var="readOnlyClass" value="readOnly"/>
</c:if>

<c:if test="${label != null}">
    <label title="${labeltitle}">
        ${label}
    </label>
</c:if>

<c:choose>
    <c:when test="${form != null}">
        <c:choose>
            <c:when test="${value != null}">
                <html:textarea property="${name}" alt="${maxlength}" name="${form}" styleId="${id}" styleClass="${styleClass} ${readOnlyClass}" readonly="${readOnly}" value="${value}" rows="${rows}" cols="${cols}" disabled="${disabled}"/>
            </c:when>
            <c:otherwise>
                <html:textarea property="${name}" name="${form}" styleId="${id}" styleClass="${styleClass} ${readOnlyClass}" readonly="${readOnly}" rows="${rows}" cols="${cols}" disabled="${disabled}"/>
            </c:otherwise>
        </c:choose>
    </c:when>
    <c:otherwise>
        <html:textarea property="${name}" styleId="${id}" styleClass="${styleClass} ${readOnlyClass}"  readonly="${readOnly}"  value="${value}" rows="${rows}" cols="${cols}" disabled="${disabled}"/>
    </c:otherwise>
</c:choose>


<!-- if the attribute table and column is not null then contruct URL -->
<c:if test="${table != null && column != null}">
    <c:url var="URL" value="/action/getRecordFor.jsp" scope="page">
        <c:param name="table" value="${table}"/>
        <c:param name="column" value="${column}"/>
    </c:url>
</c:if>
<!-- MAXLENGTH FOR TEXTAREA NOTE@IMPT: ID OR NAME MUST WITHOUT DOT(.)  -->
<c:if test="${not empty maxlength}">
    <c:set var="maxlength" value="${maxlength}"/>
    <c:set var="maxlengthId" value="${id}"/>
    <script>
        $(document).ready(function () {
            $('#${maxlengthId}').bind('change keypress focus blur', function () {
                $(this).maxLength('${maxlength}');
            });
        });
    </script>
</c:if>

<!-- If URL is not null -->
<c:if test="${URL != null}">
    <script>
        $("#${id}").autocomplete("${URL}&");
    </script>
</c:if>
<jsp:doBody/>
<c:if test="${container != 'NULL'}">
    </${container}>
</c:if>
