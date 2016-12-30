<%--
    Document   : Autocompleter tag
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : Lakshmi Naryanan
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
<%@attribute name="title"%>
<%@attribute name="styleClass"%>
<%@attribute name="readOnly"%>
<%@attribute name="id"%>
<%@attribute name="validate"%>
<%@attribute name="table"%>
<%@attribute name="column"%>
<%@attribute name="columns"%>
<%@attribute name="type"%>
<%@attribute name="cols" type="java.lang.Integer"%>
<%@attribute name="rows" type="java.lang.Integer"%>
<%@attribute name="container"%>
<%@attribute name="error_message"%>
<%@attribute name="disabled"%>
<%@attribute name="query"%>
<%@attribute name="URL"%>
<%@attribute name="maxlength"%>
<%@attribute name="fields"%>
<%@attribute name="paramFields"%>
<%@attribute name="params"%>
<%@attribute name="paramFunction"%>
<%@attribute name="callback"%>
<%@attribute name="template"%>
<%@attribute name="tabindex"%>
<%@attribute name="shouldMatch" type="java.lang.Boolean"%>
<%@attribute name="width" type="java.lang.Integer"%>
<%@attribute name="queryLimit" type="java.lang.Integer"%>
<%@attribute name="dispPos" type="java.lang.String"%>
<%@attribute name="scrollHeight" type="java.lang.String"%>
<c:catch var="exception">
    <c:if test="${id == null}" var="_var">
        <c:set var="id" value="${name}"/>
    </c:if>
    <c:if test="${container == null}">
        <c:set var="container" value="td"/>
    </c:if>
    <c:if test="${container != 'NULL'}">
        <${container}>
    </c:if>

    <c:if test="${empty shouldMatch}">
        <c:set var="shouldMatch" value="false"/>
    </c:if>
    <c:if test="${label != null}">
        <label title="${labeltitle}">
            ${label}
        </label>
    </c:if>

    <c:choose>
        <c:when test="${type == 'textarea'}">
            <c:choose>
                <c:when test="${form != null}">
                    <c:choose>
                        <c:when test="${value != null}">
                            <html:textarea property="${name}" alt="${query}" name="${form}" styleId="${id}" styleClass="${styleClass}" readonly="${readOnly}" value="${value}"  disabled="${disabled}"
                                           title="${title}" rows="${rows}" cols="${cols}"/>
                        </c:when>
                        <c:otherwise>
                            <html:textarea property="${name}"  alt="${query}" name="${form}" styleId="${id}" styleClass="${styleClass}" readonly="${readOnly}"  disabled="${disabled}"
                                           title="${title}"  rows="${rows}" cols="${cols}"/>
                        </c:otherwise>
                    </c:choose>
                </c:when>
                <c:otherwise>
                    <html:textarea property="${name}" styleId="${id}"  alt="${query}"  styleClass="${styleClass}"  readonly="${readOnly}"  value="${value}"  disabled="${disabled}"
                                   title="${title}"  rows="${rows}" cols="${cols}"/>
                </c:otherwise>
            </c:choose>
        </c:when>
        <c:otherwise>
            <c:choose>
                <c:when test="${form != null}">
                    <c:choose>
                        <c:when test="${value != null}">
                            <html:text property="${name}"  tabindex="${tabindex}" alt="${query}" name="${form}" styleId="${id}" styleClass="text ${styleClass}" readonly="${readOnly}" value="${value}"  disabled="${disabled}"
                                       maxlength="${maxlength}" title="${title}"/>
                        </c:when>
                        <c:otherwise>
                            <html:text property="${name}" tabindex="${tabindex}" alt="${query}" name="${form}" styleId="${id}" styleClass="text ${styleClass}" readonly="${readOnly}"  disabled="${disabled}"
                                       maxlength="${maxlength}" title="${title}"/>
                        </c:otherwise>
                    </c:choose>
                </c:when>
                <c:otherwise>
                    <html:text property="${name}" styleId="${id}"  alt="${query}" tabindex="${tabindex}" styleClass="text ${styleClass}"  readonly="${readOnly}"  value="${value}"  disabled="${disabled}"
                               maxlength="${maxlength}" title="${title}"/>
                </c:otherwise>
            </c:choose>
        </c:otherwise>
    </c:choose>

    <c:if test="${shouldMatch}">
        <input type="hidden" name="${name}Check_DeFAULT" id="${id}Check_DeFAULT" value="${value}" title="${title}" disabled="disabled"/>
    </c:if>
    <c:choose>
        <c:when test="${empty query && (empty table || empty column)}">
            <cong:prompt text="Either query or table and column required : '${name}'" type="warning"/>
        </c:when>
        <c:otherwise>
            <c:if test="${not empty table && not empty column}">
                <c:set var="requiredColumns" value="${fn:split(columns,',')}"/>
                <c:set var="requiredFields" value="${fn:split(fields,',')}"/>
                <c:if test="${not empty requiredColumns && not empty requiredFields && fn:length(requiredColumns)!=fn:length(requiredFields)}">
                    <cong:prompt text="Both columns and fields should be same numbers" type="warning"/>
                </c:if>
            </c:if>
        </c:otherwise>
    </c:choose>

    <!-- if the attribute table and columns is not null then contruct URL -->
    <c:url var="URL" value="/action/getAutocompleterResults.jsp" scope="page">
        <c:choose>
            <c:when  test="${not empty query}">
                <%--<c:param name="query" value="${query}"/>--%>
                <c:set var="param_query" value="query=${query}"/>
            </c:when>
            <c:when  test="${not empty table && not empty column}">
                <c:param name="table" value="${table}"/>
                <c:param name="column" value="${column}"/>
                <c:param name="columns" value="${columns}"/>
            </c:when>
        </c:choose>
        <c:param name="template" value="${template}"/>
        <c:param name="queryLimit" value="${queryLimit}"/>
    </c:url>


    <!-- If URL is not null -->
    <c:if test="${URL != null}">
        <script>
	    <%-- Initializing vars --%>
	    var v_${id}_id = $("#${id}");
		    var v_${id}_Chk_DeF = $("#${id}Check_DeFAULT");
	    <%-- --%>

	    $().ready(function() {
	    v_${id}_id.autocomplete("${URL}&", {
	    cellSeparator:"^",
		    width:"${width}",
		    disp_pos:"${dispPos}",
		    shouldMatch:${shouldMatch},
		    noAuto : false,
		<c:if test="${not empty scrollHeight}">
	    scroll: true,
		    scrollHeight: "${scrollHeight}",
            </c:if>
	    onItemSelect:function(li){
	    var values = li.id.split("^");
		    v_${id}_id.val(values[0]);
	    <c:if test="${shouldMatch}">
	    v_${id}_Chk_DeF.val(values[0]);
	    </c:if>
            <c:set var="index" value="1"/>
            <c:forTokens items="${fields}" delims="," var="field">
                <c:if test="${not empty field && field !='null' && field != 'NULL'}">
                    <c:choose>
			    <c:when test="${fn:containsIgnoreCase(field,':Check')}">
	    $("#${fn:replace(field,':Check','')},#${fn:replace(field,':','')}").val(values["${index}"]);
                        </c:when>
                        <c:otherwise>
	    $("#${field}").val(values["${index}"]);
                        </c:otherwise>
                    </c:choose>
                </c:if>
                <c:set var="index" value="${index+1}"/>
            </c:forTokens>
		<c:if test="${not empty callback}">
	    eval("${callback}");
            </c:if>
	    v_${id}_id.focusNextInputField();
	    },
		    callBefore:function(){
		    param = "${URL}";
	    <c:if test="${not empty paramFields}" >
		<c:forTokens items="${paramFields}" delims="," var="field" varStatus="status">
		    <c:if test="${not empty field}">
		    param += "&param${status.count}=" + $("#${field}").val();
		    </c:if>
		</c:forTokens>
	    </c:if>
            <c:forTokens items="${params}" delims="," var="paramV" varStatus="status">
		    <c:if test="${not empty paramV}">
		    param += "&param${status.count}=${paramV}"
                </c:if>
            </c:forTokens>
		    param += "&";
		<c:if test="${not empty query}">
		    param += "query=" + v_${id}_id.attr("alt") + "&";
            </c:if>
		<c:if test="${not empty paramFunction}">
		    param +=${paramFunction} + "&";
            </c:if>
		    v_${id}_id.setOptions({
		    url: param
		    });
            <%-- remove at intialization --%>
            <%--
            <c:forTokens items="${fields}" delims="," var="field">
                <c:if test="${not empty field}">
                    <c:choose>
                        <c:when test="${fn:containsIgnoreCase(field,':Check')}">
                            $("#${fn:replace(field,':Check','')}").val("");
                            $("#${fn:replace(field,':','')}").val("");
                        </c:when>
                        <c:otherwise>
                            $("#${field}").val("");
                        </c:otherwise>
                    </c:choose>
                </c:if>
            </c:forTokens>
            --%>
		    }
	    });
	    });
		<c:if test="${shouldMatch}" >
	    v_${id}_id.change(function (){
		<%--@modified  if($.trim(v_${id}_id.val())!=$.trim(v_${id}_Chk_DeF.val())){--%>
	    if (v_${id}_id.val() != v_${id}_Chk_DeF.val()){
	    v_${id}_id.val("");
		    v_${id}_Chk_DeF.val("");
		<c:forTokens items="${fields}" delims="," var="field">
		    <c:if test="${not empty field && field != 'null' && field != 'NULL'}">
			<c:choose>
			    <c:when test="${fn:containsIgnoreCase(field,':Check')}">
	    $("#${fn:replace(field,':Check','')},#${fn:replace(field,':','')}").val("");
			    </c:when>
			    <c:otherwise>
	    $("#${field}").val("");
			    </c:otherwise>
			</c:choose>
		    </c:if>
		</c:forTokens>
	    }
	    });
	    </c:if>
        </script>
    </c:if>
    <jsp:doBody/>
    <c:if test="${container != 'NULL'}">
        </${container}>
    </c:if>
</c:catch>
<cong:prompt type="exception" text="${exception}"/>
