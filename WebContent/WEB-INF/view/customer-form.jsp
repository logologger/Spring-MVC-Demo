<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<html>

<head>
<title>Customer Form </title>
<style>

.error {
color:red;
}

</style>
</head>
<body>
	<h1>Customer Form</h1>
	
	Fill out the form Asterik
	<form:form action="processForm" modelAttribute="customer">
		First Name : <form:input type="text" path="firstName"/>
		<br/>
		<br/>
		Last Name (*) : <form:input type="text" path="lastName"/>
		
		<form:errors path="lastName" cssClass="error" />
		
		<input type="submit" value="submit"/>
	
	</form:form>

</body>

</html>