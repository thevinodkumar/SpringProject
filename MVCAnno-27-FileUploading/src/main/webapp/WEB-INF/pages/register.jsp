<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
			<td>photo::<input type="file" name="photo"></td>
		</tr>
		<tr>
			<td>resume::<input type="file" name="resume"></td>
		</tr>
		<tr>
			<td>audio::<input type="file" name="audio"></td>
		</tr>
		<tr>
			<td><input type="submit" value="upload" /></td>
		</tr>
	</table>
</form:form>
${file1 }<br>
${file2}<br>
${file3 }<br>


