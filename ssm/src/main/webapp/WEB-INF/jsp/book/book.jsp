
<%@ page contentType="text/html;charset=UTF-8" language="java"   errorPage=""  import="java.util.ResourceBundle"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<%@include file="/common/head.jsp"%>
</head>
<body>
s
<f:form action="${ctx}/book/addBook" method="post" modelAttribute="book">
<label>书本编号：</label><input type="text" name="bid" readonly="readonly"/><br>
<label>书本名称：</label><input type="text" name="bname"><form:errors path="bname"/><br>
<label>书本类型：</label><input type="text" name="btype"><form:errors path="btype"/><br>
<input type="submit" value="提交">

</f:form>


</body>
</html>
