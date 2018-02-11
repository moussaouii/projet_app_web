
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
									style="max-height: 300px;" />


</c:if>

<c:if test="${(empty a.pathImage)}">
								<img src="image/null.jpg" class="img-responsive center-block"
									style="max-height: 300px;" />


</c:if>

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
									
									<br>
									
									
									
									
									
									
									
							</div>


						</div>

						<div class="row">
							<div class="col-md-6 col-md-offset-6">
								<div class="row">
									<div class="col-md-4">
										<a href="etudiant/annonce?action=showOne&id=${a.id}" class="button btn btn-success btn-block">Proposer
										</a>
										<br>
									</div>
									<div class="col-md-4">
										<a href="etudiant/annonce?action=showOne&id=${a.id}" class="button btn btn-info btn-block">Envoyer un message
										</a>
										<br>
									</div>
									<div class="col-md-4">
										<a href="etudiant/annonce?action=showOne&id=${a.id}" class="button btn btn-primary btn-block">Consulter
										</a>
										<br>
									</div>
								</div>
							</div>
						</div>




					</div>
					<!-- /.box-body -->

				</div>