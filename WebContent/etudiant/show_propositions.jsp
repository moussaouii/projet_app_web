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
					Les propositions 
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
                  <th>Prix d'une article</th>
                  <th>nombre Article</th>
                  <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${liP}" var="p">
                <tr>
                
                  <td><c:out value="${p.prixArticle}" />   </td>
                  <td><c:out value="${p.nbArticle}" /></td>
                  
                  
                  <c:if test="${p.etat eq 'enCours'}">
                  
                  <td> <a href="etudiant/annonce?action=accepterProposition&id=<c:out value="${p.id}"/>"
                  
                     class="btn btn-success btn-xs">Accepter
                    </a>
                    
                    
  	                <a href="etudiant/annonce?action=refuserProposition&id=<c:out value="${p.id}"/>"
                     class="btn  btn-danger btn-xs">Refuser</a>
					</td>
					

                </c:if>
                 
                </tr>
                </c:forEach>
                </tbody>
                <tfoot>
                <tr>
                  <th>Prix d'une article</th>
                  <th>nombre Article</th>
                  <th>Actions</th>
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
