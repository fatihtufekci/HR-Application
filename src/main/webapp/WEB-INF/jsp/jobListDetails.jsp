<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
<title>Job Listing Details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div class="container">
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" href="/home">HR Manager Home Page</a>
		</li>
		<li class="nav-item"><a class="nav-link active" href="/">Job Listings</a>
		</li>
		<li class="nav-item">
			<form action="logout" method="post">
				<input class="nav-link active" type="submit" value="Logout"/>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			</form>
		</li>
	</ul>
	<br/>
	<br/>
	<table class="table">
		<caption>Applications</caption>
		<thead class="thead-dark">
			<tr style="font-weight: bold;" bgcolor="lightblue">
				<th scope="col">Name</th>
				<th scope="col">E-mail</th>
				<th scope="col">Phone</th>
				<th scope="col">Thoughts On Job</th>
			</tr>
		</thead>
		<tbody>
		  	<c:if test="${not empty jobListings}">
				<c:forEach items="${jobListings}" var="jobListing" varStatus="status">
					<tr bgcolor="${status.index % 2 == 0 ? 'white' : 'lightgray'}">
						<td>${jobListing.name}</td>
						<td>${jobListing.email}</td>
						<td>${jobListing.phone}</td>
						<td>${jobListing.thoughtsOnJob}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<br/>
	
</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	
</body>
</html>