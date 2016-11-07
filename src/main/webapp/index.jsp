<html>
<body>
<h2>Hello World!</h2>
<%=
org.springframework.web.context.support.WebApplicationContextUtils.getRequiredWebApplicationContext(application).getBean(springweb.HelloBean.class).hello()
%>
</body>
</html>
