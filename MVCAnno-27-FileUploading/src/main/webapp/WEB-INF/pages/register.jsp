<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="">File Uploading/h1>

<form:form modelAttribute="upCmd" enctype="multipart/form-data">
	<table align="center" height=20px>
		<tr>
			<td>name::<form:input path="name" /></td>
		</tr>
		<tr>
			<td>desg::<form:input path="desg" /></td>
		</tr>

		<tr>
			<td>photo::<form:input path="photo" /></td>
		</tr>
		<tr>
			<td>resume::<form:input path="resume" /></td>
		</tr>
		<tr>
			<td>audio::<form:input path="audio" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="upload" /></td>
		</tr>
	</table>
</form:form>