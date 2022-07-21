	var	bc=document.getElementById("form3Example1cg").style.borderColor;
	var	bw=document.getElementById("form3Example1cg").style.borderWidth;
	
	
	document.getElementById("form3Example1cg").addEventListener("keydown",function myFunction(event){
		
	let x = event.charCode || event.keyCode;
	
	let name=document.getElementById("form3Example1cg").value;
	
	if(x>32 && x<65){
		document.getElementById("form3Example1cg").style.borderColor="red";
		document.getElementById("form3Example1cg").style.borderWidth="2px";
		}
	if(name.length==1){
			document.getElementById("form3Example1cg").style.borderColor=bc;
			document.getElementById("form3Example1cg").style.borderWidth=bw;
		}
		
	})
		
	document.getElementById("registration-form").addEventListener("submit",function validateForm(event){
				let password=document.getElementById("form3Example4cg");
				let repeatPassword=document.getElementById("form3Example4cdg");
				let checkBox=document.getElementById("form2Example3cg");
				let name=document.getElementById("form3Example1cg");
				let username=document.getElementById("form3Example3cg");
				
				if(password.value=="" || password.value!=repeatPassword.value){
					event.preventDefault();
					password.style.borderColor="red";
					password.style.borderWidth="2px";
				}else{
					password.style.borderColor=bc;
					password.style.borderWidth=bw;
				}
				
				
				if(repeatPassword.value=="" || password.value!=repeatPassword.value){
					event.preventDefault();
					repeatPassword.style.borderColor="red";
					repeatPassword.style.borderWidth="2px";
				}else{
					
					repeatPassword.style.borderColor=bc;
					repeatPassword.style.borderWidth=bw;
					}
				
				if(name.value==""){
					name.style.borderColor="red";
					name.style.borderWidth="2px";
				}else{
					name.style.borderColor=bc;
					name.style.borderWidth=bw;
				}
				
				if(username.value==""){
					username.style.borderColor="red";
					username.style.borderWidth="2px";
				}else{
					username.style.borderColor=bc;
					username.style.borderWidth=bw;
					
				}
				
				
				if (checkBox.checked==false){
					event.preventDefault();
					alert("Please agree to the terms and conditions...");
					
					
				}
					
	
	})	