<%--
  Created by IntelliJ IDEA.
  User: Yuqin
  Date: 3/16/2019
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%
            session.setAttribute("name","yuqing");
            session.setAttribute("name","stephen");
            session.removeAttribute("name");
        %>
    </body>
</html>
