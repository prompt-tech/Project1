
//$(document).ready( function () {
//	 var table = $('#employeesTable').DataTable({
//			"sAjaxSource": "/employees",
//			"sAjaxDataProp": "",
//			"order": [[ 0, "asc" ]],
//			"data": "Employee",
//			"aoColumns": [
//			      { "mData": "id"},
//		          { "mData": "SSN" },
//				  { "mData": "FNAME" },
//				  { "mData": "LNAME" },
//				  { "mData": "BDATE" },
//				  { "mData": "ADDRESS" },
//				  { "mData": "SEX" },
//				  { "mData": "SALARY" },
//				  { "mData": "SUPERSSN" },
//				  { "mData": "DNO" },
//				  { "mData": "PNUMBER" },
//				  { "mData": "HOURS" },
//				  { "mData": "DNUMBER" },
//				  { "mData": "DNAME"},
//				  { "mData": "MGRSTARTDATE" },
//				  { "mData": "DLOCATION" },
//				  { "mData": "PNAME" },
//				  { "mData": "PLOCATION"}
//
//			]
//	 })
//});
// jQuery dataTable
// Ajax data
$(document).ready(function () {
                            $('#employeesTable').DataTable( {
                             "ajax": {
                             url:"/employees"},
                                "columns": [
                                    { "data": "id" },
                                    { "mData": "SSN" },
                                    { "mData": "FNAME" },
                                    { "mData": "LNAME" },
                                    { "mData": "BDATE" },
                                    { "mData": "ADDRESS" },
                                    { "mData": "SEX" },
                                    { "mData": "SALARY" },
                                    { "mData": "SUPERSSN" },
                                    { "mData": "DNO" },
                                    { "mData": "PNUMBER" },
                                    { "mData": "HOURS" },
                                    { "mData": "DNUMBER" },
                                    { "mData": "DNAME"},
                                    { "mData": "MGRSTARTDATE" },
                                    { "mData": "DLOCATION" },
                                    { "mData": "PNAME" },
                                    { "mData": "PLOCATION"}
                                ]
                            } );
                });