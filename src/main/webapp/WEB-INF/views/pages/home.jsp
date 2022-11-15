<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div>
    <hr/>
    <c:out value="${message}"/>
    <hr/>
    <c:url var="studentFormUrl" value="/app/student/form"/>
    <a href="${studentFormUrl}">New Student</a>
    <c:url var="postUrl" value="/app/posts"/>
    <a href="${postUrl}">New Post</a>
</div>