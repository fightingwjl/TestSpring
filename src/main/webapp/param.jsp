<%--
  Created by IntelliJ IDEA.
  User: 亮亮
  Date: 2019/12/31
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--参数绑定--%>
<%--<a href="param/testParam?username=hehe&&password=nini">参数绑定</a>--%>

<%--<form action="param/saveAccount" method="post">--%>
<%--    姓名：<input type="text" name="username"/><br/>--%>
<%--    密码：<input type="text" name="password" /><br/>--%>
<%--    金额：<input type="text" name="money" /><br/>--%>
<%--    用户姓名：<input type="text" name="user.username" /><br/>--%>
<%--    用户年龄：<input type="text" name="user.age" /><br/>--%>

<%--    用户姓名：<input type="text" name="list[0].username" /><br/>--%>
<%--    用户年龄：<input type="text" name="list[0].age" /><br/>--%>

<%--    用户姓名：<input type="text" name="map['one'].username" /><br/>--%>
<%--    用户年龄：<input type="text" name="map['one'].age" /><br/>--%>
<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>


<%--自定义类型转换器--%>
<form action="param/saveUser" method="post">
    用户姓名：<input type="text" name="username" /><br/>
    用户年龄：<input type="text" name="age" /><br/>
    用户生日：<input type="text" name="date" /><br/>

    <input type="submit" value="提交"/>
</form>

<a href="param/testServelt">Servelt原生API</a>

</body>
</html>
