
<%@ include file="template/includeJSTL.jsp"%>


<!DOCTYPE html>
<html>

<%@ include file="template/head.jsp"%>


<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
			<a href="#"><b>MySchool</b>Market</a>
		</div>
		<!-- /.login-logo -->
		<div class="login-box-body">
			<p class="login-box-msg">Se connecter</p>
			<%@ include file="template/show_alert.jsp"%>
			<form action="login" method="post">
				<input type="hidden" name="actionPost" value="login" />





				<div class="form-group has-feedback">

					<input type="email" class="form-control" name="email"
						placeholder="Email" required> <span
						class="glyphicon glyphicon-envelope form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="password" class="form-control" name="mdp"
						placeholder="Mot de passe" required> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<div class="row">
					<div class="col-xs-6">


						<a href="inscrire" class="text-center">S'inscrire</a>
					</div>
					<!-- /.col -->
					<div class="col-xs-6">
						<button type="submit" class="btn btn-primary btn-block btn-flat">
							S'authentifier</button>

					</div>

					<!-- /.col -->
				</div>
			</form>


			<!-- /.social-auth-links -->


		</div>
		<!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->



	<!-- ./wrapper -->

	<%@ include file="template/script_js.jsp"%>

	<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
  });
</script>
</body>
</html>
