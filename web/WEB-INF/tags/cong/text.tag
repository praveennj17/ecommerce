<%--
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : sunil
--%>
<%@taglib tagdir="/WEB-INF/tags/cong" prefix="cong" %>
<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@attribute name="name" required="true"%>
<%@attribute name="value"%>
<%@attribute name="label"%>
<%@attribute name="labeltitle"%>
<%@attribute name="styleClass"%>
<%@attribute name="readOnly" type="java.lang.Boolean"%>
<%@attribute name="id"%>
<%@attribute name="validate"%>
<%@attribute name="table"%>
<%@attribute name="column"%>
<%@attribute name="tooltip"%>
<%@attribute name="title"%>
<%@attribute name="container"%>
<%@attribute name="error_message"%>
<%@attribute name="disabled"%>
<%@attribute name="query"%>
<%@attribute name="URL"%>
<%@attribute name="maxlength"%>
<%@attribute name="onclick"%>
<%@attribute name="onkeyup"%>
<%@attribute name="onchange"%>
<%@attribute name="callback"%>
<%@attribute name="tabindex"%>
<%@attribute name="customAttr"%>

<c:catch var="exception">
    <c:if test="${id == null}" var="_var">
        <c:set var="id" value="${name}"/>
    </c:if>
    <c:if test="${container == null}">
        <c:set var="container" value="td"/>
    </c:if>
    <c:if test="${readOnly}">
        <c:set var="readOnlyClass" value="readOnly"/>
    </c:if>
    <c:if test="${container != 'NULL'}">
        <${container}>
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
                    <html:text  title="${title}" property="${name}" name="${form}" styleId="${id}" tabindex="${tabindex}" styleClass="text ${styleClass} ${readOnlyClass}" readonly="${readOnly}" value="${value}"  disabled="${disabled}"
                               maxlength="${maxlength}"
                               onkeyup="${onkeyup}"
                               onclick="${onclick}"
                               onchange="${onchange}"
                               />
                </c:when>
                <c:otherwise>
                    <html:text title="${title}" property="${name}" name="${form}" styleId="${id}" tabindex="${tabindex}" styleClass="text ${styleClass} ${readOnlyClass}" readonly="${readOnly}"  disabled="${disabled}"
                               maxlength="${maxlength}"
                               onkeyup="${onkeyup}"
                               onclick="${onclick}"
                               onchange="${onchange}"
                               />
                </c:otherwise>
            </c:choose>
        </c:when>
        <c:otherwise>
            <html:text title="${title}" property="${name}" styleId="${id}" styleClass="text ${styleClass} ${readOnlyClass}" tabindex="${tabindex}"  readonly="${readOnly}"  value="${value}"  disabled="${disabled}"
                       maxlength="${maxlength}"
                       onkeyup="${onkeyup}"
                       onclick="${onclick}"
                       onchange="${onchange}"
                       />
        </c:otherwise>
    </c:choose>


    <!-- if the attribute table and columns is not null then contruct URL -->
    <c:if test="${not empty table && not empty column}">
        <c:url var="URL" value="/action/getAutocompleterResults.jsp" scope="page">
            <c:choose>
                <c:when  test="${not empty query}">
                    <c:param name="query" value="${query}"/>
                </c:when>
                <c:when  test="${not empty table && not empty column}">
                    <c:param name="table" value="${table}"/>
                    <c:param name="column" value="${column}"/>
                    <c:param name="columns" value="${columns}"/>
                </c:when>
            </c:choose>
            <c:param name="template" value="${template}"/>
        </c:url>
    </c:if>


    <!-- If URL is not null -->
    <c:if test="${not empty URL}">
            <script>
            $(document).ready(function(){
                $("#${id}").autocomplete("${URL}&",{
                    onItemSelect:function(li){
                        var values = li.id.split("|");
                        $("#${id}").val(values[0]);
                <c:if test="${not empty callback}">
                            eval("${callback}");
                </c:if>
                        }
                    });                
            })
        </script>
    </c:if>
    <jsp:doBody/>
    <c:if test="${container != 'NULL'}">
        </${container}>
    </c:if>
</c:catch>
<cong:prompt type="exception" text="${exception}"/>
