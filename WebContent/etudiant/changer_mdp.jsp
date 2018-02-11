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
				<h1 class="text-center">Modifier le mot de pass de votre compte</h1>
			</section>

			<!-- Main content -->
			<section class="content">



				<div class="row">
					<div class="col-lg-6 col-lg-offset-3">
						<div class="box">
							<div class="box-body">
								<div class="register-box-body">
									<p class="login-box-msg"></p>


									<%@ include file="../template/show_alert.jsp"%>


									<form id="form1" name="form1" action="etudiant"
										onsubmit="return validateForm()" method="post">
										<input type="hidden" name="actionPost" value="modifMdp" />
										<div class="form-group has-feedback">
											<input type="password" class="form-control" name="mdpA"
												id="mdpA" required placeholder="l'ancien mot de passe">
											<span class="glyphicon glyphicon-lock form-control-feedback"></span>
										</div>
										<div class="form-group has-feedback">
											<input type="password" class="form-control" name="mdp"
												id="mdp" required placeholder="nouveau mot de passe">
											<span class="glyphicon glyphicon-lock form-control-feedback"></span>
										</div>
										<div class="form-group has-feedback">
											<input type="password" class="form-control" name="mdp2"
												id="mdp2" required placeholder="Répéter mot de passe">
											<span
												class="glyphicon glyphicon-log-in form-control-feedback"></span>
										</div>
										<div id="demo"></div>
										<div class="row">
											<div class="col-xs-8"></div>
											<!-- /.col -->
											<div class="col-xs-4">
												<button type="submit"
													class="btn btn-primary btn-block btn-flat">Valider</button>
											</div>
											<!-- /.col -->
										</div>
									</form>


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

	<script>
		function validateForm() {
			var x = document.forms["form1"]["mdp"].value;
			var y = document.forms["form1"]["mdp2"].value;
			if (x != y) {
				document.getElementById("demo").innerHTML = "<div class=\"callout callout-danger\"><p>Les mots de passe ne correspondent pas. Voulez-vous réessayer ?</p></div>";
				return false;
			}
		}
	</script>



</body>
</html>