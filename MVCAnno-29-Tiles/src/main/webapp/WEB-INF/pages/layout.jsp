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
<header>
	<tiles:insertAttribute name="header" />
</header>
<table border="0%" width="100%">
	<tr>
		<td><tiles:insertAttribute name="menu" /></td>
		<td><tiles:insertAttribute name="body" /></td>
	</tr>
</table>
<footer>
	<tiles:insertAttribute name="footer" />
</footer>