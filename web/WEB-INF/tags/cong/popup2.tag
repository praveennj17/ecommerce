<%--
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : Lakshmi Narayanan
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib tagdir="/WEB-INF/tags/cong" prefix="cong" %>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@attribute name="title" required="true"%>
<%@attribute name="tooltip"%>
<%@attribute name="url" required="true"%>
<%@attribute name="height"%>
<%@attribute name="width"%>
<%@attribute name="imgHeight"%>
<%@attribute name="imgWidth"%>
<%@attribute name="name"%>
<%@attribute name="label"%>
<%@attribute name="value"%>
<%@attribute name="type"%>
<%@attribute name="src"%>
<%@attribute name="styleId"%>
<%@attribute name="styleClass"%>
<%@attribute name="callBefore"%>
<%@attribute name="callBack"%>
<%@attribute name="callFrom"%>

<c:set var="randomNumber" value="${styleUtil.randomNumber}"/>
<c:set var="_class" value="${randomNumber}"/>
<c:set var="elementToPopup" value="element-to-popup-${randomNumber}"/>

<c:set var="styleClass" value="${styleClass} ${_class}"/>

<c:if test="${not empty callFrom}">
    <c:set var="callFrom" value="${callFrom}."/>
</c:if>

<c:if test="${empty label}">
    <c:set var="label" value="${title}"/>
</c:if>
<c:if test="${empty width}">
    <c:set var="width" value="720"/>
</c:if>
<c:if test="${empty height}">
    <c:set var="height" value="400"/>
</c:if>
<c:choose>
    <c:when test="${fn:contains(url,'?')}">
        <c:set var="url" value="${url}&TB_iframe&height=${height}&width=${width}"/>
    </c:when>
    <c:otherwise>
        <c:set var="url" value="${url}?TB_iframe&height=${height}&width=${width}"/>
    </c:otherwise>
</c:choose>
<c:choose>
    <c:when test="${type=='link'}">
        <a href="#"  class="${styleClass} popupLink" title="${tooltip}"  onclick="main_${randomNumber}()"  onclick="main_${randomNumber}()">${label}</a>
    </c:when>
    <c:when test="${type=='img'}">
        <c:if test="${empty src}">
            <cong:prompt type="warning" text="attribute src is required for popup of type img"/>
        </c:if>
        <img style="cursor:pointer"  title="${tooltip}" src="${src}" height="${imgHeight}" width="${imgWidth}" class="${styleClass}" alt="${label}" id="${styleId}"  onclick="main_${randomNumber}()"/>
    </c:when>
    <c:when test="${type=='radio'}">
        <cong:radio  name="${name}" value="${value}" styleClass="${styleClass}"  id="${styleId}"  container="NULL"  onclick="main_${randomNumber}()"/>
    </c:when>
    <c:otherwise>
        <input type="button"  title="${tooltip}" value="${label}" class="${styleClass}"  id="${styleId}" onclick="main_${randomNumber}()"/>
    </c:otherwise>
</c:choose>
<div id="${elementToPopup}">&nbsp;</div>
<style>
    #${elementToPopup} {
        background-color: white;
        border-radius: 10px 10px 10px 10px;
        box-shadow: 0 0 25px 5px #999;
        color: #111;
        display: none;
        min-width:${width};
        min-height:${height};
        padding: 10px;
    }

    #${elementToPopup} iframe{
        width:${width};
        height:${height};
    }
</style>
<script>
    // Semicolon (;) to ensure closing of earlier scripting
    // Encapsulation
    // $ is assigned to jQuery
    ;/*(function($) {

        // DOM Ready
        $(function() {

            // Binding a click event
            // From jQuery v.1.7.0 use .on() instead of .bind()
        <c:choose>
            <c:when test="${not empty callBefore}">
                $('.${_class}').bind('click',${callBefore}(f_${randomNumber}));
            </c:when>
            <c:otherwise>
                $('.${_class}').bind('click',f_${randomNumber});
            </c:otherwise>    
        </c:choose>
            
            });

        })(jQuery);*/
        
         function main_${randomNumber}(e) {             
            <c:choose>
            <c:when test="${not empty callBefore}">
                ${callBefore}(f_${randomNumber});
            </c:when>
            <c:otherwise>
                f_${randomNumber}(e);
            </c:otherwise>    
            </c:choose>
         }
         
         function f_${randomNumber}(e) {
                // Prevents the default action to be triggered. 
                //e.preventDefault();
                // Triggering bPopup when click event is fired
                $('#${elementToPopup}').bPopup({
                    content:'iframe', //'iframe' or 'ajax'
                    contentContainer:'#${elementToPopup}',
                    loadUrl:'${url}',
                    modalColor: 'black',
                    positionStyle: 'absolute'
                    ,onOpen: function() {showProgressBar(true);}
                    <c:if test="${not empty callBack}">
                        ,onClose: function() { ${callBack} }
                    </c:if>   
                    }, 
                function() {
                    showProgressBar(false);
                });
                }
        
</script>