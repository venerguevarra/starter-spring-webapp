<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="POST" modelAttribute="postForm">
    <c:out value="${userError}"/><br/>
    <form:label path="userId">User ID</form:label>
    <form:input path="userId" />
    <form:errors path="userId" cssClass="error" />
    <br />
	<form:label path="title">What is in your mind?</form:label>
	<form:textarea path="title" />
	<form:errors path="title" cssClass="error" />
	<br />
	<input type="submit" value="Post" />
</form:form>
<br/>
<c:forEach items="${posts}" var="post">
<<<<<<< HEAD
    Post <c:out value = "${post.id}"/> <c:out value="${post.title}"/> <c:out value="${post.postingDate}"/><br/>
=======
    Post <c:out value = "${post.id}"/> <c:out value="${post.title}"/>
>>>>>>> branch 'master' of git@github.com:venerguevarra/starter-spring-webapp.git
</c:forEach>
<br/>