<%@ page language='java' contentType='text/html; charset=UTF-8'  pageEncoding='UTF-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<ol>
	<c:forEach var='fruit' items='${fruits}'>
		<li>${fruit}</li>
	</c:forEach>
</ol>