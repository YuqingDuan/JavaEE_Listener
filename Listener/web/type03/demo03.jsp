<%@ page import="domain.PersonBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Bind and Unbind Test Page</title>
    </head>
    <body>
        <%
            PersonBean personBean = new PersonBean();
            personBean.setName("yduan");
            personBean.setAge(26);

            session.setAttribute("bean01", personBean);
            session.removeAttribute("bean01");
        %>
    </body>
</html>
