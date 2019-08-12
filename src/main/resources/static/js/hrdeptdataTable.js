// jQuery dataTable
// Ajax data
$(document).ready( function () {
     $('#hrdepartmentsTable thead tr').clone(true).appendTo( '#hrdepartmentsTable thead' );
     $('#hrdepartmentsTable thead tr:eq(1) th').each( function (i) {
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

	 var table = $('#hrdepartmentsTable').DataTable({
	    orderCellsTop: true,
	    fixedHeader: true,
			"sAjaxSource": "/employees/hr",
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
