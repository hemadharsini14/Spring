<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
In weaather display
<br>
 <!--  ${mw.id }-->
<br>
<b>${mw.city_name }</b>
<br>
Climate  ${mw.desc }
<br>
<img src="${mw.icon}"/>
<br>
Temperature  ${mw.temperature }
<br>

Pressure  ${mw.pressure }
<br>
Humidity  ${mw.humidity }



</body>
</html>