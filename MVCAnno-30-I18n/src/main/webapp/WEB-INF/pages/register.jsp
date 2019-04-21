<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h1><spring:message code="stud.h1"/></h1>
<form:form modelAttribute="cmd">
<spring:message code="stud.name"/>::<form:input path="name"/><br>
<spring:message code="stud.no"/>::<form:input path="no"/><br>
<spring:message code="stud.address"/>::<form:input path="add"/><br>
<spring:message code="stud.father"/>::<form:input path="father"/><br>

<input type="submit" value='<spring:message code="stud.btn"></spring:message>'/>
</form:form>
<a href="?lang=en_US">English</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=te_AP">Telugu</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=ka_KA">Kannada</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=hi_IN">Hindi</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=fr_FR">French</a>

	
	