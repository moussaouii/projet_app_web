
<%@ include file="template/includeJSTL.jsp"%>


<!DOCTYPE html>
<html>

<%@ include file="template/head.jsp"%>


<body class="hold-transition register-page">
<div class="register-box">
  <div class="register-logo">
    <a href="#"><b>Myschool</b>Market</a>
  </div>

  <div class="register-box-body">
    <p class="login-box-msg">Créer un compte</p>
    
<%@ include file="template/show_alert.jsp"%>
    <form id="form1" action="inscrire" method="post" onsubmit="return validateForm()" >
        <input type="hidden" name="actionPost"  value="inscrire"/>
    	
    	
    		                <!-- select -->
                <div class="form-group has-feedback">
                  <label>Ecole</label>
                  <select class="form-control" name="ecole">
                  <c:forEach items="${ecoles}" var="e">	
                   <option value="${e.id}"> ${e.nom} </option>
                  </c:forEach>
                  </select>
                </div>
		
      <div class="form-group has-feedback">
        <input type="text"  class="form-control" name="nom" placeholder="nom" required>
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="text" class="form-control"  name="prenom" placeholder="prenom" required>
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="email" class="form-control" name="email" type="email" placeholder="Email" required>
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input   type="tel"  class="form-control" name="numTel"
        pattern="^(?:(?:\+|00)33|0)\s*[1-9](?:[\s.-]*\d{2}){4}$" placeholder="numéro téléphone" required>
        <span class="glyphicon glyphicon-phone form-control-feedback"></span>
      </div>
      
      <div class="form-group has-feedback">
        <input type="password" class="form-control" name="mdp" id="mdp" placeholder="mot de passe" required>
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
       <div class="form-group has-feedback">
        <input type="password" class="form-control" name="mdp2" id="mdp2" placeholder="Répéter mot de passe" required>
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>
     <div id="demo"></div>
      <div class="row">
        <div class="col-xs-8">

        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit"  class="btn btn-primary btn-block btn-flat">Valider</button>
        </div>
        <!-- /.col -->
      </div>
    </form>

    

    <a href="login" class="text-center">Je suis déja  inscrit</a>
  </div>
  <!-- /.form-box -->
</div>

	<%@ include file="template/script_js.jsp"%>

	<script>
	  function validateForm() {
		    var x = document.forms["form1"]["mdp"].value;
		    var y=document.forms["form1"]["mdp2"].value;
		    if (x != y) {
		    	document.getElementById("demo").innerHTML = "<div class=\"callout callout-danger\"><p>Les mots de passe ne correspondent pas. Voulez-vous réessayer ?</p></div>";
		        return false;
		    }
		}
</script>
</body>
</html>