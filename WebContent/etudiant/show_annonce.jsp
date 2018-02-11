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
			
			
			
			
<%@ include file="../template/show_alert.jsp"%>
			
			
			
			
			
			
			
			
			
			
			
			
			      <!-- SELECT2 EXAMPLE -->
      <div class="box box-default">
        <div class="box-header with-border">
          <h3 class="box-title">Search</h3>

          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-plus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div>
        </div>
        <!-- /.box-header -->
        <div class="box-body" style="display: none;">
        <form action="etudiant/annonce" method="post"  enctype="multipart/form-data"  >
          <div class="row">
            <div class="col-md-6">
            
            
            <h4 class="text-light-blue">Type d'annonce :	</h4>
            
            
            								
										<input type="hidden" name="actionPost" value="addOffreArticle" />
										<div id="demo"></div>
						

										<div class="form-group has-feedback">

											<input name="offreArticle" value="offreArticle" type="checkbox">
											&nbsp;&nbsp;<label>  Offre Article </label>
										</div>
										
										<div class="form-group has-feedback">
											<input name="offreService" value="offreService" type="checkbox">
											&nbsp;&nbsp;<label>  Offre Article </label>
										</div>

										<div class="form-group has-feedback">
	
											<input name="DemandeService" value="DemandeService" type="checkbox">
											&nbsp;&nbsp;<label>  Demande service </label>
										</div>



										
									
            
            
            
            </div>
            
            <div class="col-md-6">
            
            
            										<div class="form-group has-feedback">
											<label>Prix maximum</label>
											<input name="prix" class="form-control" placeholder="0.00" value="" type="text" pattern="[0-9$,.]*" required>
											 
											 <span class="glyphicon glyphicon-star form-control-feedback"></span> 
										</div>
            
            
            
            										<div class="form-group has-feedback">
											<label>Search</label>
											<input type="text" class="form-control" name="search"
												 placeholder=" Que recherchez-vous ? " required>
										</div>
										
										
										<button type="submit"
													class="btn btn-primary btn-block btn-flat">Valider</button>
            
            
            
             
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
        </form>
        <!-- /.box-body -->
        <div class="box-footer" style="display: none;">
          Visit <a href="https://select2.github.io/">Select2 documentation</a> for more examples and information about
          the plugin.
        </div>
      </div>
      <!-- /.box -->
      
      </div>
      
      
      
      
      
      
      
      
      
			
			
			
			
			

				<div class="box box-solid">
					<div class="box-header with-border">
						<h3 class="box-title">Titre annonce</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">

						<div class="row">
							<div class="col-md-6">

								<img src="image/test.jpg" class="img-responsive center-block"
									style="max-height: 300px;" />

							</div>




							<div class="col-md-6">


								<br> <br> <br> <strong class="text-light-blue">
									Titre :&nbsp;&nbsp; </strong> annonce exemple <br> <strong
									class="text-light-blue"> Description :&nbsp;&nbsp; </strong>
								hhhhhhhhhhhhh fjhdfjjhdf n fdjhdhfjdfj jdfhnndfj ,jkdfnkjfd
								jhfdkj jhfdjhdkf <br> <strong class="text-light-blue">
									Prix :&nbsp;&nbsp; </strong>
								<fmt:formatNumber type="number" maxFractionDigits="2"
									value="11.00" />
								coins <br> <strong class="text-light-blue"> Nombre
									d'article :&nbsp;&nbsp; </strong> 10 <br> <br>
							</div>


						</div>

						<div class="row">
							<div class="col-md-6 col-md-offset-6">
								<div class="row">
									<div class="col-md-4">
										<button type="submit" class="btn btn-success btn-block">Valider
										</button>
										<br>
									</div>
									<div class="col-md-4">
										<button type="submit" class="btn btn-info btn-block">Valider
										</button>
										<br>
									</div>
									<div class="col-md-4">
										<button type="submit" class="btn btn-primary btn-block">Valider
										</button>
										<br>
									</div>
								</div>
							</div>
						</div>




					</div>
					<!-- /.box-body -->

				</div>
				
				
				
				
				
				
				
				
				
				
				
				<div class="box box-solid">
					<div class="box-header with-border">
						<h3 class="box-title">Titre annonce</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">

						<div class="row">
							<div class="col-md-6">

								<img src="image/test.jpg" class="img-responsive center-block"
									style="max-height: 300px;" />

							</div>




							<div class="col-md-6">


								<br> <br> <br> <strong class="text-light-blue">
									Titre :&nbsp;&nbsp; </strong> annonce exemple <br> <strong
									class="text-light-blue"> Description :&nbsp;&nbsp; </strong>
								hhhhhhhhhhhhh fjhdfjjhdf n fdjhdhfjdfj jdfhnndfj ,jkdfnkjfd
								jhfdkj jhfdjhdkf <br> <strong class="text-light-blue">
									Prix :&nbsp;&nbsp; </strong>
								<fmt:formatNumber type="number" maxFractionDigits="2"
									value="11.00" />
								coins <br> <strong class="text-light-blue"> Nombre
									d'article :&nbsp;&nbsp; </strong> 10 <br> <br>
							</div>


						</div>

						<div class="row">
							<div class="col-md-6 col-md-offset-6">
								<div class="row">
									<div class="col-md-4">
										<button type="submit" class="btn btn-success btn-block">Valider
										</button>
										<br>
									</div>
									<div class="col-md-4">
										<button type="submit" class="btn btn-info btn-block">Valider
										</button>
										<br>
									</div>
									<div class="col-md-4">
										<button type="submit" class="btn btn-primary btn-block">Valider
										</button>
										<br>
									</div>
								</div>
							</div>
						</div>




					</div>
					<!-- /.box-body -->

				</div>
				
				
				
				  <c:forEach items="${liA}" var="a">
				  		<%@ include file="offre_article_for_list.jsp"%>
                  </c:forEach>
				
				
				
				
				
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