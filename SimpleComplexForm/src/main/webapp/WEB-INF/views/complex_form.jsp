<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- ya tag aap key ju erroer aata hai uss ko fornate per open karta hai -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page isELIgnored="false"%>
<!-- here is started my Bootstrap -->
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body class="" style="background: #e2e2e2;">
	<!-- here is started your form -->
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						<!-- yaha per hamko paste karna hai danger wala div -->
						<div class="alert alert-danger" role="alert">This is my alert</div>
							
							<form:errors path="student.*"/> <!-- yaha per kiya huwaga ju error aayega student per wo sab dikhega -->

						<form action="handelform" method="post">
							<!-- jis url per iss form handel karna chahate usska name yaha per de du ki value ma -->
							<div class="form-group">
								<!-- iss ko ma kise used karunga bus mughe aapne controller ma ja kar method key aander used karna hai  @RequestParam ab hamara form handel hu jayega  -->
								<label for="exampleInputEmail1">Your name</label> <input
									name="name" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter name"> <small id="emailHelp"
									class="form-text text-muted">We will never share your
									name with anyone else.</small>
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">Your ID</label> <input name="id"
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter ID">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">Your DOB</label> <input
									name="date" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="dd/mm/yyyy">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">Select Courses</label> <select
									name="courses" class="form-control" id="exampleInputEmail1"
									multiple>
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>SQL</option>
									<option>Spring Framework</option>
								</select>
							</div>

							<!-- here is your sign up button in the middle -->
							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>

								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>

							<div class="form-group">
								<label for="">Select Type</label> <select class="form-control"
									name="type">
									<option value="oldstudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>
							</div>

							<!-- here i am staring custom class field -->

							<div class="card">
								<div class="card-body"></div>
								<p>your address</p>

							</div>

							<!--  yaha per hamara data banding huwa hai custom class ka  -->
							<div class="form-group">
								<input name="address.street" type="text" class="form-control"
									placeholder="Enter street" />

							</div>

							<div class="form-group">
								<input name="address.city" type="text" class="form-control"
									placeholder="Enter city" />

							</div>


							<div></div>


							<div class="container text-center">
								<button type="submit" class="btn btn-success">Sign up</button>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
		crossorigin="anonymous"></script>
</body>
</html>
