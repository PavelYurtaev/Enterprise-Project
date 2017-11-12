<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<jsp:include page="../fragments/header.jsp"/>

<body>
<jsp:include page="employeeNavigationBar.jsp"/>

<div id="mainContainer">
	<div id="mainRow">
		<section id="main">
			<h1>Все проекты</h1>
			<table align="center" border="1">
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Project basis</th>
					<th>Description</th>
					<th>Customer</th>
					<th>Price</th>
					<th>Begin date</th>
					<th>End date</th>
					<th>Orders for project</th>
				</tr>
				<c:forEach items="${allProjects}" var="project">
					<tr>
						<td>${project.id}</td>
						<td>${project.title}</td>
						<td>${project.projectBasis}</td>
						<td>${project.description}</td>
						<td>${project.customer}</td>
						<td>${project.price}</td>
						<td>${project.beginDate}</td>
						<td>
							<c:choose>
								<c:when test="${project.endDate == null}">
									open
								</c:when>
								<c:otherwise>
									${project.endDate}
								</c:otherwise>
							</c:choose>
						</td>
						<td><a href="<c:url value='/employee/all-projects/${project.id}/orders'/>">Show orders</a> </td>
					</tr>
				</c:forEach>
			</table>
		</section>
		<section id="news">
			<jsp:include page="../fragments/newssection.jsp"/>
		</section>
	</div>
</div>

<footer>
	&copy; 2016, Enterprise co.
</footer>

</body>
</html>


