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
	
	<p>Fill out the form Asterik</p>
	<form:form action="processForm" modelAttribute="customer">
		First Name : <form:input type="text" path="firstName"/>
		<br/>
		<br/>
		Last Name (*) : <form:input type="text" path="lastName"/>
		
		
		<form:errors path="lastName" cssClass="error" />
		<br/>
		<br/>
		
		Free Passes : <form:input type="text" path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		
		<br/>
		<br/>
		Postal Code <form:input type="text" path = "postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		
		
		<br/>
		<br/>
		Course Code : <form:input type="text" path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		
		<input type="submit" value="submit"/>
	
	</form:form>

</body>

</html>