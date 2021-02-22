
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  ${str }-->

<br>
<!--  ${res}-->

<!--${hc1 }-->
<!--${hc2 }-->
In encode
${hc1.str }
${hc2.str }

<table>
<thead>
<th> Character</th>
<th>Key Values</th>

</thead>
<tbody>
<c:forEach items="${keymap}" var="keymap">
<tr>
<td>${keymap.key}</td>
<td>${keymap.value}</td>
</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>