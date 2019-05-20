<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form:form modelAttribute="userCmd" method="post">

	<table>
		<tr>
			<th>user name::<form:input path="name" /> <form:errors
					path="name" />
			</th>
		</tr>
		<tr>
			<th>password::<form:input path="pwd" /> <form:errors path="pwd" />
			</th>
		</tr>
		<tr>
			<th>age::<form:input path="age" /> <form:errors path="age" />
			</th>
		</tr>
		<tr>
			<td>country:: <form:select path="count">
					<form:option value="NONE" label="--- Select ---" />
					<form:options items="${country}" />
				</form:select>
			</td>
		</tr>
		<tr>
			<td>
			Hobbies:::<form:checkboxes items="${hobbies}" path="hobbies" /></td>
		</tr>
		<tr>
			<td>DOB:::<form:input path="date" />
			</td>
		</tr>

		<tr>
			<th><input type="submit" value="login"></th>
		</tr>

	</table>

</form:form>

<c:if test="${!empty resultMsg }">
				${resultMsg }
		<br>
	<br>
		${userCmd }
</c:if>


