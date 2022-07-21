<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" 
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" 
    integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" 
    crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" 
    integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
     crossorigin="anonymous" referrerpolicy="no-referrer" />

    <title>${title}</title>
  </head>
  
  <style>
  	a:hover i {
            transform: scale(1.8);
        }
    .buttonAdd:hover {
 			 transform: scale(1.2);
		}
	
	.logout:hover {
 			 transform: scale(1.2);
		}	
		
		
    
  </style>
  
  <body class="bg-image"
  style="
    background-image: url('https://mdbcdn.b-cdn.net/img/new/fluid/nature/015.webp');" >
   

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity=
    "sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
     integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" 
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    
    
 <a href="${pageContext.request.contextPath}/" align="right" style="font-size: 25px; color: white;vertical-align: top;text-align: right;">LogOut</a>  
<form class="container" action="makenewrecord" method="post">

<div class="container table-responsive mt-5 border border-dark p-0 ">

<table class="table table-border  table-hover bg-light p-0 mb-0">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">First name</th>
      <th scope="col">Last name</th>
      <th scope="col">Company name</th>
      <th scope="col">Address</th>
      <th scope="col">Email</th>
      <th scope="col">Phone</th>
      <th scope="col">Additional information</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  
  <c:forEach var="j" items="${allEmployee}">  
   
  <tbody>
    <tr>
      <th scope="row">${j.eId}</th>
      <td>${j.fName}</td>
      <td>${j.lName}</td>
      <td>${j.compName}</td>
      <td>${j.address}</td>
      <td>${j.email}</td>
      <td>${j.phone}</td>
      <td>${j.additionalDetails}</td>
      <td><a href="${pageContext.request.contextPath}/delete/${j.eId}" ><i class="fa-solid fa-trash-can mr-2 text-danger" id="delete-validate-icon"></i></a>
      <a href="${pageContext.request.contextPath}/update/${j.eId}"><i class="fa-solid fa-pen ml-2 text-primary"></i></a></td>
    </tr>
    
  </tbody>
    
</c:forEach>  
</table>

</div>
<div class="text-center mt-3"><button type="submit" class="btn btn-success buttonAdd">Make A New Entry</button></div>
</form>

	<script src="<c:url value="/resources/js/delete-verify.js" />" ></script>
	

</body>
</html>