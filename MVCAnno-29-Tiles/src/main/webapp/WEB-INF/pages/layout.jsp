<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<style>
div {
	font-family: sans-serif;
	font: italic;
	color: orange;
}
</style>
<table border="0" width="100%" height="100%">
	<tr>
		<td colspan="2" height="30%" width="100%"><tiles:insertAttribute name="header" />
		</td>
	</tr>

	<tr>
		<td width="20%" height="50%"><tiles:insertAttribute name="menu" /></td>
		<td width="70%" height="50%"><tiles:insertAttribute name="body" /></td>
	</tr>
	<tr><td colspan="2" height="20%">
	<tiles:insertAttribute name="footer" />
</td></tr>
</table>