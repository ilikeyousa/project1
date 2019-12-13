<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 吕凯
  Date: 2019/11/14
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <%@include file="/common/head.jsp"%>
</head>
<body>
${msg}
<form action="${ctx}/book/querybook" method="post" >
<label>书本名称:</label><input type="text" name="bname"/><br>
    <input type="submit" value="提交">
</form>
<table width="100%" border="1" cellpadding="0" cellspacing="0">
    <thead>
    <th>书本编号</th>
    <th>书本名称</th>
    <th>书本类型</th>
    </thead>
<tbody>
<c:forEach items="${books}"  var="b">
    <tr>
        <td>${b.bid}</td>
        <td>${b.bname}</td>
        <td>${b.btype}</td>
    </tr>
</c:forEach>
</tbody>
</table>
${pb}
</body>
</html>
