<%--
  Created by IntelliJ IDEA.
  User: 亮亮
  Date: 2019/12/31
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="anno/testModelAttribute" method="post">
    用户姓名：<input type="text" name="username" /><br/>
    用户年龄：<input type="text" name="age" /><br/>

    <input type="submit" value="提交"/>
</form>

<a href="anno/testSessionAttributes">SessionAttributes</a>
<a href="anno/getSessionAttributes">getSessionAttributes</a>
<a href="anno/delSessionAttributes">delSessionAttributes</a>

</body>
</html>
