<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>

	<h2>
		Student is confirmed 
		
		${customer.firstName} : ${customer.lastName}
		
		<br/>
		
		<p>Free Passes</p> 
		<p> ${customer.freePasses} </p>
	
		<p>Course Code</p>
		<p> ${ customer.courseCode} </p>
	</h2>

</html>