// jQuery dataTable
// Ajax data
$(document).ready( function () {
	 var table = $('#employeesTable').DataTable({
			"sAjaxSource": "/employees",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "ssn" },
				  { "mData": "fname" },
				  { "mData": "lname" },
				  { "mData": "bdate" },
				  { "mData": "address" },
				  { "mData": "sex" },
				  { "mData": "salary" },
				  { "mData": "superssn" },
				  { "mData": "dno" },
				  { "mData": "pnumber" },
				  { "mData": "hours" },
				  { "mData": "dnumber" },
				  { "mData": "dname"},
				  { "mData": "mgrstartdate" },
				  { "mData": "dlocation" },
				  { "mData": "pname" },
				  { "mData": "plocation"}
			]
	 })
});