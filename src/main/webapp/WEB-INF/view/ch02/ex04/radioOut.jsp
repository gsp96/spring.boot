<%@ page language='java' contentType='text/html; charset=UTF-8'  pageEncoding='UTF-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>

<c:if test='${agree == "yes"}'>
	약관에 동의합니다.
</c:if>
<c:if test='${agree == "no"}'>
	약관을 거절합니다.
</c:if>
<hr>

<c:choose>
	<c:when test='${agree == "yes"}'>
		합니다.
	</c:when>
	<c:otherwise>
		안 합니다.
	</c:otherwise>
</c:choose>