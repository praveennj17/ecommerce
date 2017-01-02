<%--
    Document   : sun
    Created on : Jun 4, 2010, 8:09:44 PM
    Author     : sunil
--%>
<%@include file="/taglib.jsp"%>
<%@attribute name="style"%>
<body onload="gotoParent(${refreshParent});reloadParent('${reloadParentWithURL}');disablePage(${disablePage})" style="${style}">
    <jsp:doBody/>
</body>
<c:if test="${not empty form}">
<script>
        $("#${form}").validate({
            rules: {
                ${unique_rules}
            },
            messages: {
                ${unique_messages}
            }
        });

    </script>
</c:if>
