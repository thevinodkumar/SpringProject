<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form:form modelAttribute="userCmd" method="post"  onsubmit="return valide(this)">
	user name::<form:input path="name" />
	<span id="ename" ></span>
	<form:errors path="name" />
	<br>
	password::<form:input path="pwd" />
	<span id="epwd" ></span>
	<form:errors path="pwd" />
	<br>
	<form:hidden path="flag"/><br>
	age::<form:input path="age"/><form:errors path="age"/><br>
	<input type="submit" value="login">
</form:form>
<script type="text/javascript">
	function valide(frm) {
		var jname = frm.name.value;
		var jpwd = frm.pwd.value;
		frm.flag.value="yes";
		 if (jname == "") {
			document.getElementById("ename").innerHTML = "name-required";
			frm.name.focus();
			return false;
		} 
		if (jpwd == "") {
			document.getElementById("epwd").innerHTML = "pwd-required";
			frm.pwd.focus();
			return false;
		}
		return true;
	}
</script>

<c:if test="${!empty resultMsg }">
				${resultMsg }
	</c:if>

