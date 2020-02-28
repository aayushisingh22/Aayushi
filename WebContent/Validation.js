function registervalidation() {


	let elements = document.forms["regform"].elements;
	let userName = elements['userName'].value;
	let email = elements['email'].value;
	let mobile = elements['mobile'].value;
	let password = elements['password'].value;
	
	if (userName == '' || userName.length == 0) {
		document.getElementById('fullnameerror').innerHTML = 'enter full_name';
		return false;

	}
	if (email == '' || email.length == 0) {
		alert("enter  email_address");
		return false;
	}
	if (mobile == '' || mobile.length == 0) {
		alert("enter  mobile_number ");
		return false;
	}
	if (password == '' || password.length == 0) {
		alert("enter password");
		return false;
	}

	return true;

}

function loginValidation() {
	let elements = document.forms["logform"].elements;

	let email = elements['email'].value;
	let password= elements['password'].value;
	if (email == '' || email.length == 0) {
		alert("enter  email_address");
		return false;
	}

	if (password == '' || password.length == 0) {
		alert("enter password");
		return false;
	}
      return true;
}