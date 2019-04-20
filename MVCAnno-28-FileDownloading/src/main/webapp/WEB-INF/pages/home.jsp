<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${!empty files}">
		<table align="center" border="1">
			<tr>
				<td>file</td>
				<td>download</td>
			</tr>
			<c:forEach var="i" items="${files}">
				<tr>
					<td>${i}</td>
					<td><a href="download.htm?name=${i}">download</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
records not found
</c:otherwise>
</c:choose>