<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!doctype html>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" href="<c:url value='/static/css/main.css'/>" />
</head>
<body>
	<div>
	    <div>
            <tiles:insertAttribute name="header" />
        </div>
		<div>
			<tiles:insertAttribute name="menu" />
		</div>
		<div>
			<div>
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<div>
            <tiles:insertAttribute name="footer" />
        </div>
	</div>
</body>
</html>