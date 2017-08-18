<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<h1>ROLE_ADMIN 用户可以访问的界面</h1>

<sec:authorize access="hasRole('ROLE_USER')">
		<button type="button" value="Click Mes">USER权限才可以进行点击</button>
</sec:authorize>

<sec:authorize access="hasRole('ROLE_ADMIN')">
		<button type="button" value="Click Mes">admin权限才可以进行点击</button>
</sec:authorize>

<br>
<sec:authorize access="isFullyAuthenticated()" var="isFullyAuthenticated">

      只有通过登录界面进行登录的用户才能看到1。<br/>

   </sec:authorize>

   上述权限的鉴定结果是：${isFullyAuthenticated }<br/>

   <%if((Boolean)pageContext.getAttribute("isFullyAuthenticated")) {%>

      只有通过登录界面进行登录的用户才能看到2。

   <%}%>
   

   <sec:authentication property="principal.username"  scope="session" var="username"/>
   <br></br>
 <p>当前登录用户:${username}</p>  
  
</body>
</html>