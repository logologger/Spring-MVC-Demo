<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title>Student Registration Form</title>

<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br/>
		Last Name : <form:input path="lastName" />
		<br/>
		
		Country : 
		<form:select path="country">
			<form:options items = "${countriesOptions}"/>		
		</form:select>
		<br/>
		Favorite Language
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		Groovy <form:radiobutton path="favoriteLanguage" value="Groovy"/>
		
		<br/>
		
		Operating Systems
		
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		MS Windows <form:checkbox path="operatingSystems" value="windows"/>
		Android <form:checkbox path="operatingSystems" value="android"/>
		<input type="submit"/>
	</form:form>
	
	
	
</body>