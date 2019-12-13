<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title<%=System.currentTimeMillis()%></title>
</head>
<body>
<%--<h1><t:message code="yhzh.label"/></h1>--%>
<%--<h1><t:message code="bookAdd.label"/></h1>--%>
<%--<h1><t:message code="bookList.label"/></h1>--%>
<%--<h1><t:message code="hello.label"/></h1>--%>
<p>
    <a href="/book/change?type=zh">中文</a>
    <a href="/book/change?type=ja">日语</a>

</p>

</body>
</html>
