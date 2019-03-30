<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<body>
		
		<h1>Hello World Spring Form </h1>
		
		<h2>Student Name : ${student.firstName} ${student.lastName}</h2>
		
		<h2>Country : ${student.country }</h2>
		
		<br/>
		Favorite Language <b> ${student.favoriteLanguage} </b>
		
		<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			
		<li>${temp}</li>
		</c:forEach>
			
		
		</ul>
	</body>

</html>