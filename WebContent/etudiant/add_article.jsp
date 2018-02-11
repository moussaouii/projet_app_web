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
				<h1 class="text-center">Proposer Article</h1>
			</section>

			<!-- Main content -->
			<section class="content">



				<div class="row">
					<div class="col-lg-6 col-lg-offset-3">
						<div class="box">
							<div class="box-body">
								<div class="register-box-body">
									<p class="login-box-msg">Article</p>



									<form action="etudiant/annonce" method="post">
										<input type="hidden" name="actionPost" value="addArticle" />
										
										
										
										<div class="form-group has-feedback">
											<label>Titre</label>
											<input type="text" class="form-control" name="titre"
												 placeholder="titre" required>
										</div>
										<div class="form-group has-feedback">
											<label>Description</label>
											<textarea class="form-control"  name="description" rows="3"
												placeholder="décrire votre article"></textarea>
										</div>
										
										<div class="form-group has-feedback">
											<label>Prix</label>
											<input name="prix" class="form-control" placeholder="0.00" value="" type="text" pattern="[0-9$,.]*" required>
											 
											 <span class="glyphicon glyphicon-star form-control-feedback"></span> 
										</div>
										


										<div class="form-group has-feedback">
											<label>Photo d'article</label> 
											<input name="photo" type="file" >

											<p class="help-block">Une photo de format JPEG ou PNG.</p>
										</div>
										<div class="form-group has-feedback">
											<label>  Prix fixe
											</label>
											<input name="prixFixe" class="form-control" type="checkbox">
										</div>

										<div class="form-group has-feedback">
											<label> Nombre article </label> <input type="number"
												name="nbArticle" min="0" max="100" step="1" value="1" >


										</div>



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





</body>
</html>