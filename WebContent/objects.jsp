<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String userName = (String) request.getParameter("userName");
if (userName != null && !userName.isEmpty()) {
	//session.setAttribute("sessionUserName", userName);
	//application.setAttribute("applicationUserName", userName);
	pageContext.setAttribute("pageContextUserName", userName);
	pageContext.setAttribute("sessionUserName", userName, PageContext.SESSION_SCOPE);
	pageContext.setAttribute("applicationUserName", userName, PageContext.APPLICATION_SCOPE);
}
%>
<br>
The user name in request object is : <%=userName %>
<br>
The user name in session object is : <%=session.getAttribute("sessionUserName") %>
<br>
The user name in application object is : <%=application.getAttribute("applicationUserName") %>
<br>
The user name in page context object is : <%=pageContext.getAttribute("pageContextUserName") %>
<br>
The found object for "userName" attribute is : <%=pageContext.findAttribute("userName") %>
<br>
The found object for "name" attribute is : <%=pageContext.findAttribute("name") %>
</body>
</html>