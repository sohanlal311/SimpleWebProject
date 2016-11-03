<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Hello JSP</h3>

<%!
public int add(int a, int b) {
	return a + b;
}
%>
<%

int i = 3;
int j = 6;
int k;
k = i + j;
//out.println("The value of k is " + k);

%>
The value of k is <%=k+2 %>

<%
k=add(2341, 1734);
%>

<br>
The value of k is <%=add(23, 17)%>

<%
for (i=5;i<15;i++) {
%>
 <br>i=<%=i %>
<%}
%>

</body>
</html>