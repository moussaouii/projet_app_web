<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="req" value="${pageContext.request}" />
<c:set var="uri" value="${req.requestURI}" />
<c:set var="url">${req.requestURL}</c:set>


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





























		<!-- =============================================== -->

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1 class="text-center">Ajouter un admin</h1>
			</section>

			<br> 
			<br>

			<!-- Main content -->
			<section class="content">

				<div class="row">
					<div class="col-lg-6 col-lg-offset-3">
						<div class="box">
							<div class="box-body">
								<%@ include file="../template/show_alert.jsp"%>


								<div class="register-box-body">
									<p class="login-box-msg">Créer un compte</p>

									<form id="form1" name="form1" action="admin"
										onsubmit="return validateForm()" method="post">
										<input type="hidden" name="actionPost" value="addAdmin" />
										<div class="form-group has-feedback">
											<input type="text" class="form-control" required name="nom"
												placeholder="nom"> <span
												class="glyphicon glyphicon-user form-control-feedback"></span>
										</div>

										<div class="form-group has-feedback">
											<input type="text" class="form-control" name="prenom"
												required placeholder="prenom"> <span
												class="glyphicon glyphicon-user form-control-feedback"></span>
										</div>
										<div class="form-group has-feedback">
											<input type="email" class="form-control" name="email"
												required type="email" placeholder="Email"> <span
												class="glyphicon glyphicon-envelope form-control-feedback"></span>
										</div>
										<div class="form-group has-feedback">
											<input type="password" class="form-control" name="mdp"
												id="mdp" required placeholder="mot de passe"> <span
												class="glyphicon glyphicon-lock form-control-feedback"></span>
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
