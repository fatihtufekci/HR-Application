<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
<title>HR Manager Home Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div class="container">
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" href="/newJobListing">Add Job Listing</a>
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
	<c:if test="${not empty message}">
		<div style="color:blue">
			${message}
		</div>
	</c:if>
	<br/>
	<table class="table">
		<thead class="thead-dark">
			<tr style="font-weight: bold;" bgcolor="lightblue">
				<th scope="col">Job Title</th>
				<th scope="col">Job Description</th>
				<th scope="col">Number of People to Hire</th>
				<th scope="col">Last Application Date</th>
				<th scope="col"></th>
				<th scope="col"></th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${jobListings}" var="jobListing" varStatus="status">
				<tr bgcolor="${status.index % 2 == 0 ? 'white' : 'lightgray'}">
					<td>${jobListing.jobTitle}</td>
					<td>${jobListing.jobDescription}</td>
					<td>${jobListing.numberOfPeopleToHire}</td>
					<td>${jobListing.lastApplicationDate}</td>
					<td><a href="/home/details/${jobListing.id}">Show Detail</></a></td>
					<td><a href="/home/update/${jobListing.id}">Edit</></a></td>
					<td><a href="/home/delete/${jobListing.id}">Delete</></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br/>
	
</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	
</body>
</html>