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
					Mon  Profil 
				</h1>
			</section>

			<!-- Main content -->
			<section class="content">

				<div class="row">
					<div class="col-lg-6 col-lg-offset-3">
						<div class="box">
							<div class="box-body">


							<%@ include file="../template/show_alert.jsp"%>


								<br>
								<div class="row">
									<div class="col-lg-10 col-lg-offset-1">
										<h4>
											<strong class="text-light-blue"> Nom :&nbsp;&nbsp; </strong>
											${etudiant.nom}
										</h4>

										<br>
										<h4>
											<strong class="text-light-blue"> Prenom
												:&nbsp;&nbsp; </strong> ${etudiant.prenom}
										</h4>

										<br>
										<h4>
											<strong class="text-light-blue"> Email :&nbsp;&nbsp;
											</strong> ${etudiant.email}
										</h4>

										<br>
										<h4>
											<strong class="text-light-blue"> némuro téléphone :&nbsp;&nbsp; </strong>
											${etudiant.numTel}
										</h4>

										<br>


										


										<br> <br> <a href="etudiant?action=modifProfil"
											type="button" class="btn btn-block btn-primary btn-sm">
											Modifier profil </a> <br> <br>

									</div>

								</div>
							</div>
						</div>
						<!-- /.box -->
					</div>

				</div>
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