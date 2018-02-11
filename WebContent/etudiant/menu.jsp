 <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
            <span class="fa fa-user"></span>
        </div>
        <div class="info">
          <p>
          <i class="fa fa-user"></i>

          ${etudiant.nom} ${etudiant.prenom} 
          </p>
        </div>
      </div>
      <!-- search form -->

      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        
        <li><a href="etudiant"><i class="fa fa-home"></i> <span>
        Home</span></a></li>
                  
			<li class="treeview"><a href="#"> <i class="fa fa-file-text"></i>
					<span>Mes Annonces</span> <span class="pull-right-container">
						<i class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<li class="treeview"><a href="#"> <i
							class="fa fa-pencil"></i> <span>Deposer</span> <span
							class="pull-right-container"> <i
								class="fa fa-angle-left pull-right"></i>
						</span>
					</a>
						<ul class="treeview-menu">
							<li><a href="etudiant/annonce?action=addOffreArticle"><i
									class="fa fa-circle-o"></i>Proposer Article</a></li>
							<li><a href="etudiant/annonce?action=addOffreService"><i
									class="fa fa-circle-o"></i> Proposer Service</a></li>
							<li><a href="etudiant/annonce?action=addDemandeService"><i
									class="fa fa-circle-o"></i> Rechercher Service</a></li>
													</ul></li>
					<li><a href="etudiant/annonce?action=showAnnoncesEnCours"><i
							class="fa fa-clock-o"></i> En Cours</a></li>
					<li><a href="etudiant/annonce?action=showAnnoncesArchivees"><i
							class="fa fa-archive"></i> Archivees</a></li>
					
				</ul></li>




			<li><a href="etudiant/annonce?action=showMessages"><i class="fa fa-comment"></i> <span>Mes Messages</span></a></li>

					<li class="treeview"><a href="#"> <i
							class="fa fa-money"></i> <span>Mes Coins</span> <span
							class="pull-right-container"> <i
								class="fa fa-angle-left pull-right"></i>
						</span>
					</a>
				
						<ul class="treeview-menu">
							<li><a href="../charts/chartjs.html"><i
									class="fa fa-circle-o"></i>Releve</a></li>
							<li><a href="../charts/morris.html"><i
									class="fa fa-circle-o"></i> Acheter Coins</a></li>
						</ul></li>
        


        <li><a href="user?action=changerProfil"><i class="fa fa-info"></i> <span>Infos Coins</span></a></li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>
