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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>${title}</title>
  </head>
  
  <style>
  	
    .buttonAdd:hover {
 			 transform: scale(1.2);
		}
  </style>
  
  <body class="bg-image"
  style="
    background-image: url('https://mdbcdn.b-cdn.net/img/new/fluid/nature/015.webp');">
   

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" 
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" 
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>



<a href="${pageContext.request.contextPath}/" align="right" style="font-size: 25px; color: white;vertical-align: top;text-align: right;">LogOut</a>
<div class="container p-4 border border-light mt-5 rounded" style="width:500px;height:620px;background-color:#ededed;" >
<div class="text-center  mb-3 p-2"><h1  style="font-size:2vw;">${heading}</h1></div>



<form action="${pageContext.request.contextPath}/addrecord" method="post" id="update-entry">
  <!-- 2 column grid layout with text inputs for the first and last names -->
  <div class="row mb-4">
    <div class="col">
      <div class="form-outline">
      <input type="number" id="form6Example0" class="form-control" value="${emp.eId}" name="eId" hidden/>
        <input type="text" id="form6Example1" class="form-control" value="${emp.fName}" name="fName" />
        
      </div>
    </div>
    <div class="col">
      <div class="form-outline">
        <input type="text" id="form6Example2" class="form-control" value="${emp.lName }" name="lName" />
        
      </div>
    </div>
  </div>

  <!-- Text input -->
  <div class="form-outline mb-4">
    <input type="text" id="form6Example3" class="form-control" value="${emp.compName}" name="compName" />
    
  </div>

  <!-- Text input -->
  <div class="form-outline mb-4">
    <input type="text" id="form6Example4" class="form-control" value="${emp.address}" name="address" />
    
  </div>

  <!-- Email input -->
  <div class="form-outline mb-4">
    <input type="email" id="form6Example5" class="form-control" value="${emp.email}" name="email" />
    
  </div>

  <!-- Number input -->
  <div class="form-outline mb-4">
    <input type="number" id="form6Example6" class="form-control" value="${emp.phone}" name="phone" />
    
  </div>

  <!-- Message input -->
  <div class="form-outline mb-4">
    <input type="text" class="form-control" id="form6Example7" rows="4" value="${emp.additionalDetails}" name="additionalDetails"></input>
    
  </div>

  

  <!-- Submit button -->
  <div class="container text-center">
  <a href="${pageContext.request.contextPath}/show" class="btn btn-outline-primary mr-3 buttonAdd">Back</a>
  <button type="submit" class="btn btn-outline-success  ml-3 buttonAdd">Update</button>
  </div>
</form>

</div>
  <script src="<c:url value="/resources/js/update-entry-validate.js" />" ></script>
  
</body>
</html>
