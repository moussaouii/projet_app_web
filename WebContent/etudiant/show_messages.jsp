<%@ include file="../template/includeJSTL.jsp"%>


<!DOCTYPE html>
<html>

<%@ include file="../template/head.jsp"%>


<body class="hold-transition skin-blue sidebar-mini">
	<!-- Site wrapper -->
	<div class="wrapper">

		<%@ include file="header.jsp"%>

		<!-- =============================================== -->

		<!-- Left side column. contains the sidebar -->
		<%@ include file="menu.jsp"%>


		<!-- =============================================== -->

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1 >
					Mes messages 
				</h1>
			</section>

			<!-- Main content -->
			<section class="content">

				
				<!--   pour controler la taille de box  <div class="row">
					<div class="col-lg-8 col-lg-offset-2"> grande taille
					<div class="col-lg-6 col-lg-offset-3"> moyenne taille 
					grande taille par defaut -->
				<!-- Default box -->
				<div class="box">
					<div class="box-header with-border">
						<h3 class="box-title">Mes Messages</h3>


					</div>
					<div class="box-body">
						<%@ include file="../template/show_alert.jsp"%>
						






              <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                  <th>Emetteur</th>
                  <th>Message</th>
                  <th>Répondre</th>
                  <th>Date</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${liM}" var="m">
                <tr>
                
                  <td><c:out value="${m.emetteur.nom}" /> &nbsp;&nbsp; <c:out value="${m.emetteur.prenom}" /> </td>
                  <td><c:out value="${m.text}" /></td>
                  <td>
                  
                  
                  <form action="etudiant/annonce" method="post"   >
										<input type="hidden" name="actionPost" value="repondreMsg" />
										<input type="hidden" name="idEmetteur" value="<c:out value="${m.emetteur.id}" />" />
												<div class="row">
												<div class="col-md-8">
												<input type="text" name="msg"/>
												</div>
												<div class="col-md-4">												
												<button type="submit"
													class="btn btn-primary btn-block btn-flat">Répondre</button>
												
												
												</div>
										</div>
										
										
								
												
											
				</form>			
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  </td>
                 <td><fmt:formatDate pattern="yyyy-MMM-dd:hh" value="${m.date}" /></td>
                 
                </tr>
                </c:forEach>
                </tbody>
                <tfoot>
                <tr>
                  <th>Emetteur</th>
                  <th>Message</th>
                  <th>Répondre</th>
                  <th>Date</th>
                </tr>
                </tfoot>
              </table>










					</div>
					<!-- /.box-body -->
					<div class="box-footer"></div>
					<!-- /.box-footer-->
				</div>
				<!-- /.box -->

			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

















	</div>
	<!-- wrapper -->
	<%@ include file="../template/footer.jsp"%>

	<!-- Control Sidebar -->

	<!-- ./wrapper -->

	<%@ include file="../template/script_js.jsp"%>
	
	

<script>
  $(function () {
    $("#example1").DataTable();
/*    $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false
    });*/
  });
</script>


</body>
</html>










