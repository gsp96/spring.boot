<%@ page language='java' contentType='text/html; charset=UTF-8'  pageEncoding='UTF-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<img src='<c:url value="/attatch/${user.faceFilename}"/>'/><br>
${user.name} / ${user.age}