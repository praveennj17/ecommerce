<%@taglib tagdir="/WEB-INF/tags/cong/" prefix="cong"%>
<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@attribute name="name" required="true"%>
<%@attribute name="value"%>
<%@attribute name="label"%>
<%@attribute name="readOnly" type="java.lang.Boolean"%>
<%@attribute name="showTime" type="java.lang.Boolean"%>
<%@attribute name="isTimeMode12" type="java.lang.Boolean"%>
<%@attribute name="id"%>
<%@attribute name="validate"%>
<%@attribute name="container"%>
<%@attribute name="error_message"%>
<%@attribute name="styleClass"%>
<%@attribute name="disabled"%>
<%@attribute name="tooltip"%>
<%@attribute name="onchange"%>

<c:if test="${empty showTime}">
    <c:set var="showTime" value="false"/>
</c:if>

<c:if test="${calendar != 'calendar'}">
    <script type="text/javascript" src="${path}/js/calendar/datetimepicker_css.js"></script>
</c:if>
<c:set var="calendar" value="calendar" scope="request"/>
<c:if test="${id == null}" var="_var">
    <c:set var="id" value="${name}"/>
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
    <label>
        ${label}
    </label>
</c:if>
<c:set var="timeFormat" value="${isTimeMode12 ? '12' : '24'}"/>

<table style="width: auto;float: left">
    <tr>
        <td>
            <c:choose>
                <c:when test="${form != null}">
                    <c:choose>
                        <c:when test="${value != null}">
                            <html:text  property="${name}" name="${form}"  styleId="${id}" title="${label}"  styleClass="date noAutoComplete text float-left ${name} ${styleClass} ${readOnlyClass}" readonly="${readOnly}" value="${value}"  disabled="${disabled}" onchange="${onchange};validateDate('${id}','${showTime}');"/>
                        </c:when>
                        <c:otherwise>
                            <html:text property="${name}" name="${form}" styleId="${id}" title="${label}"  styleClass="date noAutoComplete text float-left ${name} ${styleClass} ${readOnlyClass}" readonly="${readOnly}"  disabled="${disabled}" onchange="${onchange};validateDate('${id}','${showTime}');"/>
                        </c:otherwise>
                    </c:choose>
                </c:when>
                <c:otherwise>
                    <html:text property="${name}"  styleId="${id}" title="${label}"  styleClass="date noAutoComplete text float-left ${name} ${styleClass} ${readOnlyClass}"  readonly="${readOnly}"  value="${value}"  disabled="${disabled}" onchange="${onchange};validateDate('${id}','${showTime}');"/>
                </c:otherwise>
            </c:choose>
        </td>
        <td>
            <img id="${id}Img" class="calendar" src="${path}/images/calendar/calendar.gif" onclick="NewCssCal('${id}', 'mmddyyyy', 'dropdown',${showTime},${timeFormat})" style="cursor: pointer;"  height='19' width='20'/>
        </td>        
    </tr>
</table>
<jsp:doBody/>
<c:if test="${container != 'NULL'}">
    </${container}>
</c:if>
<c:if test="${not empty tooltip}">
    <cong:tooltip id="${id}" tooltip="${tooltip}"/>
</c:if>
<script>
    function validateDate(id, showTime) {
        var date = $('#' + id).val();
        if (date.length > 5) {
            var formatedDate = new Date(date);
            if (formatedDate != null && formatedDate != 'Invalid Date') {
                var year = formatedDate.getFullYear();
                var month = (1 + formatedDate.getMonth()).toString();
                month = month.length > 1 ? month : '0' + month;
                var day = formatedDate.getDate().toString();
                var hr = formatedDate.getHours().toString();
                hr = hr.length > 1 ? hr : '0' + hr;
                var mnt = formatedDate.getMinutes().toString();
                mnt = mnt.length > 1 ? mnt : '0' + mnt;
                day = day.length > 1 ? day : '0' + day;
                if (showTime === 'true') {
                    $('#' + id).val(month + '/' + day + '/' + year + ' ' + hr + ':' + mnt);
                } else {
                    $('#' + id).val(month + '/' + day + '/' + year);
                }
            }
        } else {
            $('#' + id).val('');
        }
    }
</script>
