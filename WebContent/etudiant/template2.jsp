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
				<h1 class="text-center">
					Blank page <small>it all starts here</small>
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
						<h3 class="box-title">Title of box</h3>
						 <h2 class="page-header">AdminLTE Custom Tabs</h2>

      
						


					</div>
					<div class="box-body">
						<%@ include file="../template/show_alert.jsp"%>
						body of box
					</div>
					<!-- /.box-body -->
					<div class="box-footer">Footer of box</div>
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


</body>
</html>