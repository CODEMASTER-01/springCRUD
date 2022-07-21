var bc=document.getElementById("form6Example1").style.borderColor;
var bw=document.getElementById("form6Example1").style.borderWidth;


document.getElementById("form6Example1").addEventListener("keydown",function validateFName(event){
		
	let x = event.charCode || event.keyCode;
	
	let name=document.getElementById("form6Example1").value;
	if(x>32 && x<65){
		document.getElementById("form6Example1").style.borderColor="red";
		document.getElementById("form6Example1").style.borderWidth="2px";
		}
	if(name.length==1){
			document.getElementById("form6Example1").style.borderColor=bc;
			document.getElementById("form6Example1").style.borderWidth=bw;
		}
		
	})
	
	
	

document.getElementById("form6Example2").addEventListener("keydown",function validateLName(event){
		
	let x = event.charCode || event.keyCode;
	
	let name=document.getElementById("form6Example2").value;
	if(x>32 && x<65){
		document.getElementById("form6Example2").style.borderColor="red";
		document.getElementById("form6Example2").style.borderWidth="2px";
		}
	if(name.length==1){
			document.getElementById("form6Example2").style.borderColor=bc;
			document.getElementById("form6Example2").style.borderWidth=bw;
		}
		
	})





document.getElementById("add-new-record").addEventListener("submit",function validateForm(event){
				let fName=document.getElementById("form6Example1");
				let lName=document.getElementById("form6Example2");
				let compName=document.getElementById("form6Example3");
				let address=document.getElementById("form6Example4");
				let email=document.getElementById("form6Example5");
				let phone=document.getElementById("form6Example6"); 
				let others=document.getElementById("form6Example7"); 
				 
				
				if(fName.value==""){
					event.preventDefault();
					fName.style.borderColor="red";
					fName.style.borderWidth="2px";
				}else{
					fName.style.borderColor=bc;
					fName.style.borderWidth=bw;
				}
				
				
				if(lName.value==""){
					event.preventDefault();
					lName.style.borderColor="red";
					lName.style.borderWidth="2px";
				}else{
					
					lName.style.borderColor=bc;
					lName.style.borderWidth=bw;
					}
				
				if(compName.value==""){
					compName.style.borderColor="red";
					compName.style.borderWidth="2px";
				}else{
					compName.style.borderColor=bc;
					compName.style.borderWidth=bw;
				}
				
				if(address.value==""){
					address.style.borderColor="red";
					address.style.borderWidth="2px";
				}else{
					address.style.borderColor=bc;
					address.style.borderWidth=bw;
					
				}
				
				
				if(email.value==""){
					email.style.borderColor="red";
					email.style.borderWidth="2px";
				}else{
					email.style.borderColor=bc;
					email.style.borderWidth=bw;
					
				}
				
				
				if(phone.value=="" && phone.value.length!=10){
					phone.style.borderColor="red";
					phone.style.borderWidth="2px";
				}else{
					phone.style.borderColor=bc;
					phone.style.borderWidth=bw;
					
				}
				
				if(others.value==""){
					others.style.borderColor="red";
					others.style.borderWidth="2px";
				}else{
					others.style.borderColor=bc;
					others.style.borderWidth=bw;
					
				}
	})