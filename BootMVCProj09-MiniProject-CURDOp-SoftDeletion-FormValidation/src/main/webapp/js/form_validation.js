function validate(frm) {
	// empty form validation error message
	document.getElementById('enameError').innerHTML='';
	document.getElementById('jobError').innerHTML='';
	document.getElementById('salError').innerHTML='';
	document.getElementById('deptnoError').innerHTML='';
		
	
	// read form data
	let name = frm.ename.value;
	let desg = frm.job.value;
	let salary = frm.sal.value;
	let deptno = frm.deptno.value;
	let validationFlag = true;

	// form validation logics (client side)
	if (name == '') { // required rule
		document.getElementById('enameError').innerHTML = "Employee name is required!(cs)";
		validationFlag = false;
	} else if (name.length < 5) { // min length rule
		document.getElementById('enameError').innerHTML = "Employee name must have min 5 characters!(cs)";
		validationFlag = false;
	}

	if (desg == '') { // required rule
		document.getElementById('jobError').innerHTML = "Employee job is required!(cs)";
		validationFlag = false;
	} else if (desg.length < 5) { // min length rule
		document.getElementById('jobError').innerHTML = "Employee job must have min 5 characters!(cs)";
		validationFlag = false;

	}

	if (salary == '') { // required rule
		document.getElementById('salError').innerHTML = "Employee salary is required!(cs)";
		validationFlag = false;
	} else if (isNaN(salary)) { // numeric rule
		document.getElementById('salError').innerHTML = "Employee salary must be numeric value!(cs)";
		validationFlag = false;

	} else if (salary < 10000 || salary > 1000000) {
		document.getElementById('salError').innerHTML = "Employee salary must be in range of 10000 to 1000000!(cs)";
		validationFlag = false;

	}

	if (deptno == '') { // required rule
		document.getElementById('deptnoError').innerHTML = "Employee salary is required!(cs)";
		validationFlag = false;
	} else if (isNaN(deptno)) { // numeric rule
		document.getElementById('deptnoError').innerHTML = "Employee deptno must be numeric value!(cs)";
		validationFlag = false;

	} else if (deptno < 10 || deptno > 1000) {
		document.getElementById('deptnoError').innerHTML = "Employee deptno must be in range of 10000 to 1000000!(cs)";
		validationFlag = false;
	}
	
	frm.vflag.value="yes";

	return validationFlag;
}