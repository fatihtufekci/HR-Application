<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Job Listing</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div class="container">
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" href="/newJobListing">Add Job Listing</a>
		</li>
		<li class="nav-item"><a class="nav-link active" href="/">Index Page</a>
		</li>
		<li class="nav-item">
			<form action="logout" method="post">
				<input class="nav-link active" type="submit" value="Logout"/>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			</form>
		</li>
	</ul>
	<br/>
	<form:form modelAttribute="jobListing" method="post">
		<div class="form-group">
			<label for="jobTitle">Job Title</label>
			<form:input path="jobTitle" class="form-control" id="jobTitle" />
			<form:errors path="jobTitle" cssStyle="color:red"/>
		</div><div class="form-group">
			<label for="jobDescription">Job Description</label>
			<form:input path="jobDescription" class="form-control" id="jobDescription" />
			<form:errors path="jobDescription" cssStyle="color:red"/>
		</div><div class="form-group">
			<label for="numberOfPeopleToHire">Number Of People To Hire</label>
			<form:input path="numberOfPeopleToHire" class="form-control" id="numberOfPeopleToHire" />
		</div><div class="form-group">
			<label for="lastApplicationDate">Last Application Date</label>
			<form:input path="lastApplicationDate" class="form-control" id="lastApplicationDate" />
			<form:errors path="lastApplicationDate" cssStyle="color:red"/>
		</div>
		<form:button name="submit" class="btn btn-primary">Create</form:button>
	</form:form>
	
</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>