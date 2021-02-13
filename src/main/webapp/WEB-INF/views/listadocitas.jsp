<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/style/style.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
    <title>Listado de Reservas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.js"></script>
    
     
</head>
<body>
	<header>
 <div class="imgHeader">
        <img src=resources/img/clinica.png/>
    </div>  
  <h1>
	Listado de Reserva
</h1>
 </header>
<body>
    <div class="container" class="row g-3">
	<div id="especialidad" class="col-auto">
			<select id="selectEspecialidad" class="form-select form-select-sm btn-sm" aria-label=".form-select-lg example">
				<c:forEach var="e" items="${especialidades}">
					<option>
						<c:out value="${e.getDescripcion()}"></c:out>
					</option>
				</c:forEach>
			</select>
		</div>
		<div id="buscar" class="col-auto">
			<button type="submit" class="btn btn-outline-secondary" >Buscar</button>
		</div>
    	
		<br>
       <table class="table table-bordered border-primary">
       	<thead>
       		<tr>
       			<td>Paciente</td>
       			<td>Doctor (a)</td>
       			<td>Especialidad</td>
       			<td>Fecha</td>
       			<td>Hora</td>
       		</tr>
       	</thead>
       	<tbody>
       	
       	</tbody>
       </table>

    </div>
</body>
</html>
