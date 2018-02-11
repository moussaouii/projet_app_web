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
			
			
			
			
			
		
			
			
			
				<div class="box box-solid">
					<div class="box-header with-border">
						<h3 class="box-title">${a.titre}</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">

						<div class="row">
							<div class="col-md-6">

<c:if test="${!(empty a.pathImage)}">
								<img src="${a.pathImage}" class="img-responsive center-block"
									style="max-height: 400px;" />


</c:if>

<c:if test="${(empty a.pathImage)}">
								<img src="image/null.jpg" class="img-responsive center-block"
									style="max-height: 400px;" />


</c:if>
									
																	<br>
									
									<br>

							</div>




							<div class="col-md-6">


								<br> <br> <br> <strong class="text-light-blue">
									Description :&nbsp;&nbsp; </strong> ${a.description} <br> 
									 <strong class="text-light-blue">
									Prix :&nbsp;&nbsp; </strong> 
								<fmt:formatNumber type="number" maxFractionDigits="2"
									value="${a.prixArticle}" />
								coins <br> <strong class="text-light-blue"> Nombre
									d'article :&nbsp;&nbsp; </strong> ${a.nbArticle} <br> 
									
									
									<c:if test="${!(a.prixFixe)}">

										<strong class="text-light-blue"> Prix négociable </strong>

									</c:if>
									<c:if test="${a.prixFixe}">

										<strong class="text-light-blue"> Prix Fixe </strong>

									</c:if>
									<br>
									
								   
								   
								   <strong class="text-light-blue">Date :&nbsp;&nbsp;	</strong><fmt:formatDate pattern="yyyy-MMM-dd" value="${a.date}" />
								   
								   <br>
								   

									
									
														</div>
					

				</div>
									
								<div class="row">
							<div class="col-md-6">
							
							
							<h4 class="text-light-blue">Proposer un prix	</h4>
							
									<form action="etudiant/annonce" method="post"  >
										<input type="hidden" name="actionPost" value="addPropositionOffreArticle" />
										<input type="hidden" name="id" value="${a.id}" />
						
							
										<div class="form-group has-feedback">
											<label>Prix</label>
											<input name="prix" class="form-control" placeholder="0.00" value="" type="text" pattern="[0-9$,.]*" required>
											 
											 <span class="glyphicon glyphicon-star form-control-feedback"></span> 
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

								
									<br>
									
									<br>

							</div>




							<div class="col-md-6">			
							
							
							
							
								<h4 class="text-light-blue">Envoyer un message </h4>
							
							
										<form action="etudiant/annonce" method="post"    >
										<input type="hidden" name="actionPost" value="addMessage" />
										<input type="hidden" name="idRecepteur" value="${a.etudiant.id}" />
						
						

										<div class="form-group has-feedback">
											<label>Message</label>
											<textarea class="form-control"  name="msg" rows="3"
												placeholder="écrire ton message ici"></textarea>
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
							
							
							
							
							
							
							
							
														
																		
																									<br>
									<br>
									<br>

							</div>										
																		
							</div>	
							<div class="row">	
							<div class="col-md-6  col-md-offset-6">
							<div class="row">	
							<div class="col-md-6">
																
																		
														
									<strong class="text-light-blue">Annonceur :&nbsp;&nbsp;	</strong> ${a.etudiant.nom}   ${a.etudiant.prenom}
									</div>
									<div class="col-md-6">
									<i class="fa fa-fw fa-phone-square" > </i>&nbsp;&nbsp;	${a.etudiant.email}  
									<br>
									
									<i class="fa fa-fw  fa-commenting" > </i>&nbsp;&nbsp;	${a.etudiant.numTel}  
									
									</div>										
																		
									</div>	
									</div>
									</div>								





			
			
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