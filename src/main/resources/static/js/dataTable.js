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
				  { "mData": "plocation",
				   render : function(mData) {
				        return mData == '0' ? 'Not Active' : 'Active';
				   }
				}
			]
	 })
});
// jQuery dataTable
// Ajax data
//$(document).ready(function () {
//                            $('#employeesTable').DataTable( {
//                             "ajax": {
//                             url:"/employees"},
//                                "columns": [
//                                    { "data": "id" },
//                                    { "mData": "SSN" },
//                                    { "mData": "FNAME" },
//                                    { "mData": "LNAME" },
//                                    { "mData": "BDATE" },
//                                    { "mData": "ADDRESS" },
//                                    { "mData": "SEX" },
//                                    { "mData": "SALARY" },
//                                    { "mData": "SUPERSSN" },
//                                    { "mData": "DNO" },
//                                    { "mData": "PNUMBER" },
//                                    { "mData": "HOURS" },
//                                    { "mData": "DNUMBER" },
//                                    { "mData": "DNAME"},
//                                    { "mData": "MGRSTARTDATE" },
//                                    { "mData": "DLOCATION" },
//                                    { "mData": "PNAME" },
//                                    { "mData": "PLOCATION"}
//                                ]
//                            } );
//                });