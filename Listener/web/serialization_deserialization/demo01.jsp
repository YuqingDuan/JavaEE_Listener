<%@ page import="domain.AnimalBean" %><%--
  Created by IntelliJ IDEA.
  User: Yuqin
  Date: 3/16/2019
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Demo01 Page</title>
    </head>
    <body>
        <%
            AnimalBean animalBean = new AnimalBean();
            animalBean.setName("Millie");
            animalBean.setColor("pink");
            animalBean.setAge(24);

            session.setAttribute("bean02", animalBean);
        %>
    </body>
</html>
