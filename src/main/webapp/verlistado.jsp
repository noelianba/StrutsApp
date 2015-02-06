<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Listado de estaciones</h1> 

<logic:iterate name="listaestacion" id="list">

<h1><bean:write name="list" property="id" /></h1>
<h1><bean:write name="list" property="title" /></h1>
<h1><bean:write name="list" property="fecha" /></h1>
<h1><bean:write name="list" property="cor_x" /></h1>
<h1><bean:write name="list" property="cor_y" /></h1>
<h1><bean:write name="list" property="icon" /></h1>
</logic:iterate>
</body>
</html>