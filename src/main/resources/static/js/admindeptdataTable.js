// jQuery dataTable
// Ajax data
$(document).ready( function () {
     $('#admindepartmentsTable thead tr').clone(true).appendTo( '#admindepartmentsTable thead' );
     $('#admindepartmentsTable thead tr:eq(1) th').each( function (i) {
         var title = $(this).text();
         $(this).html( '<input type="text" placeholder="Search '+title+'" />' );

         $( 'input', this ).on( 'keyup change', function () {
             if ( table.column(i).search() !== this.value ) {
                 table
                     .column(i)
                     .search( this.value )
                     .draw();
             }
         } );
     } );

	 var table = $('#admindepartmentsTable').DataTable({
	    orderCellsTop: true,
	    fixedHeader: true,
			"sAjaxSource": "/employees/admin",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
				  { "mData": "fname" },
				  { "mData": "lname"},
				  { "mData": "salary" }
			],
			"dom": "Bfrtip",
			"buttons": [
			    'columnsToggle'
			]
	 });
});
