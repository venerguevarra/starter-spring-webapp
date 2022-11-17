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
<table>
    <tr>
        <td>User ID</td>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Email</td>
        <td>Post ID</td>
        <td>Title</td>
        <td>Date</td>
    </tr>
    <c:forEach items="${userPostList.posts}" var="post">
        <tr>
	        <td><c:out value = "${post.userId}"/></td>
	        <td><c:out value = "${post.firstName}"/></td>
	        <td><c:out value = "${post.lastName}"/></td>
	        <td><c:out value = "${post.email}"/></td>
	        <td><c:out value = "${post.postId}"/></td>
	        <td><c:out value = "${post.title}"/></td>
	        <td><c:out value = "${post.postingDate}"/></td>
        </tr>
    </c:forEach>
    
</table>
<br/>