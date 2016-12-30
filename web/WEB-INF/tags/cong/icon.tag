<%@taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%@attribute name="type" required="true"%>
<%@attribute name="title" %>
<%@attribute name="styleClass" %>
<%@attribute name="onclick"%>
<%@attribute name="text"%>
<font class="${type} icon ${styleClass}" onclick="${onclick}" title="${title}">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${text}</font>