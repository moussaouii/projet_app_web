
<header class="main-header">
	<!-- Logo -->
	<a href="#" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
		<span class="logo-mini"><b>My</b>SM</span> <!-- logo for regular state and mobile devices -->
		<span class="logo-lg"><b>MySchool</b>Market</span>
	</a>
	<!-- Header Navbar: style can be found in header.less -->
	<nav class="navbar navbar-static-top">
		<!-- Sidebar toggle button-->
		<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
			role="button"> <span class="sr-only">Toggle navigation</span> <span
			class="icon-bar"></span> <span class="icon-bar"></span> <span
			class="icon-bar"></span>
		</a>

		<div class="navbar-custom-menu">
			<ul class="nav navbar-nav">
				<!-- Messages: style can be found in dropdown.less-->

				<!-- User Account: style can be found in dropdown.less -->
				<li class="dropdown user user-menu">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					<i class="fa fa-user"></i>
					 <span class="hidden-xs"> 
					 ${etudiant.nom} ${etudiant.prenom} 
						
					</span>
				</a>
					<ul class="dropdown-menu">
						<!-- User image -->
  

						<!-- Menu Footer-->
						<li class="user-footer"><a href="etudiant?action=voirProfil"
							class="btn btn-default btn-flat">Voir Profil</a> <br> <a
							href="etudiant?action=modifProfil" class="btn btn-default btn-flat">Changer
								Profil</a> <br> <a href="etudiant?action=changerMdp"
							class="btn btn-default btn-flat">Changer Mot de passe</a> <br>
							<a href="etudiant?action=deconnecter"
							class="btn btn-default btn-flat">Déconnecter</a>
							</li>
					</ul></li>
				<!-- Control Sidebar Toggle Button -->

			</ul>
		</div>
	</nav>
</header>