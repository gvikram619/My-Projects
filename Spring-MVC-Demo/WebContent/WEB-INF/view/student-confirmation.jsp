<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Student confirmation</title>
</head>

<body>
<h2> Output form</h2>



Student Name : ${student.firstName} ${student.lastName}
<br><br>
Student Country: ${student.country} 
<br><br>
Favorite Language: ${student.favoriteLanguage} 
<br><br>
Operating systems: 

<ul>
<c:forEach var="temp" items="${student.operatingSystems}" >
<li> ${temp}  </li>
</c:forEach>
</ul>


</body>

</html>