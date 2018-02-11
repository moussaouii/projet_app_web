
<c:if test="${!(empty alertDanger)}">
<div class="alert alert-danger alert-dismissible">
	<button type="button" class="close" data-dismiss="alert"
		aria-hidden="true">&times;</button>
	<h4>
		<i class="icon fa fa-ban"></i> Alert!
	</h4>
		<c:out value="${alertDanger}" />
</div>
</c:if>



<c:if test="${!(empty alertDanger1)}">
<div class="alert alert-danger alert-dismissible">
	<button type="button" class="close" data-dismiss="alert"
		aria-hidden="true">&times;</button>
	<h4>
		<i class="icon fa fa-ban"></i> Alert!
	</h4>
		<c:out value="${alertDanger1}" />
</div>
</c:if> 



<c:if test="${!(empty alertDanger2)}">
<div class="alert alert-danger alert-dismissible">
	<button type="button" class="close" data-dismiss="alert"
		aria-hidden="true">&times;</button>
	<h4>
		<i class="icon fa fa-ban"></i> Alert!
	</h4>
		<c:out value="${alertDanger2}" />
</div>
</c:if> 


<c:if test="${!(empty alertDanger3)}">
<div class="alert alert-danger alert-dismissible">
	<button type="button" class="close" data-dismiss="alert"
		aria-hidden="true">&times;</button>
	<h4>
		<i class="icon fa fa-ban"></i> Alert!
	</h4>
		<c:out value="${alertDanger3}" />
</div>
</c:if>
<c:if test="${!(empty alertDanger4)}">
<div class="alert alert-danger alert-dismissible">
	<button type="button" class="close" data-dismiss="alert"
		aria-hidden="true">&times;</button>
	<h4>
		<i class="icon fa fa-ban"></i> Alert!
	</h4>
		<c:out value="${alertDanger4}" />
</div>
</c:if> 


<c:if test="${!(empty alertInfo)}">
<div class="alert alert-info alert-dismissible">
	<button type="button" class="close" data-dismiss="alert"
		aria-hidden="true">&times;</button>
	<h4>
		<i class="icon fa fa-info"></i> Alert!
	</h4>
		<c:out value="${alertInfo}" />
</div>
</c:if>


<c:if test="${!(empty alertWarning)}">
<div class="alert alert-warning alert-dismissible">
	<button type="button" class="close" data-dismiss="alert"
		aria-hidden="true">&times;</button>
	<h4>
		<i class="icon fa fa-warning"></i> Alert!
	</h4>
		<c:out value="${alertWarning}" />
</div>
</c:if>

<c:if test="${!(empty alertSuccess)}">
<div class="alert alert-success alert-dismissible">
	<button type="button" class="close" data-dismiss="alert"
		aria-hidden="true">&times;</button>
	<h4>
		<i class="icon fa fa-check"></i> Alert!
	</h4>
		<c:out value="${alertSuccess}" />
</div>
</c:if>
