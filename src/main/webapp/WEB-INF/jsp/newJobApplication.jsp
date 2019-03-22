<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Job Application</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div class="container">
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" href="/">Job Listings</a>
		</li>
	</ul>
	<br/>
	<div class="col-md-6">
	<form:form modelAttribute="applicant" method="post">
		<div class="form-group">
			<label for="name">Name</label>
			<form:input path="name" class="form-control" id="name" />
			<form:errors path="name"  cssStyle="color:red"/>
		</div>
		<div class="form-group">
			<label for="email">Email</label>
			<form:input path="email" class="form-control" id="email" />
			<form:errors path="email" cssStyle="color:red"/>
		</div>
		<div class="form-group">
			<label for="phone">Phone</label>
			<form:input path="phone" class="form-control" id="phone" />
			<form:errors path="phone" cssStyle="color:red"/>
		</div>
		<div class="form-group">
			<label for="thoughtsOnJob">Thoughts on Job</label>
			<form:input path="thoughtsOnJob" class="form-control" id="thoughtsOnJob" />
			<form:errors path="thoughtsOnJob" cssStyle="color:red"/>
		</div>
		<form:button name="submit" class="btn btn-primary">Create</form:button>
	</form:form>
	</div>
</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>