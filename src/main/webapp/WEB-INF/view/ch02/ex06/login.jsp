<%@ page language='java' contentType='text/html; charset=UTF-8'  pageEncoding='UTF-8'%>
<form method='post'>
	ID: <input type='text' name='id' value='${user.id}'/>
	PW: <input type='password' name='pw'/>
	<input type='checkbox' name='rememberMe'/>아이디 저장
	<input type='submit' value='로그인'/>
</form>