<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html> 
<html>
<head>
<title>Student Registration page</title>
</head>
<body>
<form:form action="processform" modelAttribute="student">

First name: <form:input path="firstName" /> 

<br><br>

Last name: <form:input path="lastName" />
<br><br>

country: <form:select path="country">
<form:options items="${student.countryoptions}"   />

</form:select>

<br><br>
Favorite Language:
JAVA <form:radiobutton path="favoriteLanguage" value="java" />
C# <form:radiobutton path="favoriteLanguage" value="C#" />
PYTHON <form:radiobutton path="favoriteLanguage" value="python" />
PHP <form:radiobutton path="favoriteLanguage" value="php" />
<br><br>

Operating Systems:
Windows<form:checkbox path="operatingSystems" value="Windows" />
Linux<form:checkbox path="operatingSystems" value="LINUX" />
MAC<form:checkbox path="operatingSystems" value="MAC" />

<br><br>
<input type="submit" value="submit">
</form:form> 


</body>


</html>
