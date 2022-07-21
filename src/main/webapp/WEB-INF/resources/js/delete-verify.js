document.getElementById("delete-validate-icon").addEventListener("click",function deleteVerify(event){
		
		let myChoice=confirm("Are you sure you want to delete this entry");
		if(myChoice==false){
			event.preventDefault();
		}
				
	})