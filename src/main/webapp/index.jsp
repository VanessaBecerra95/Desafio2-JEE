<%@page import="java.util.List"%>
<%@page import="cl.praxis.model.Habitacion"%>
<%@page import="cl.praxis.model.HabitacionBusiness"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// Librerias Requeridas
HabitacionBusiness habitacionb = new HabitacionBusiness();
// listado de Evento
List<Habitacion> listaHabitacion = habitacionb.getHabitaciones();
%>
<!DOCTYPE html>
<html lang="es">
<%@include file="assets/html/head.jsp"%>
<body>
	<%@include file="assets/html/header.jsp"%>
	<form method="post" action="procesa.jsp">
		<!-- Section-->
		<section class="py-5">
			<div class="container px-4 px-lg-5 mt-5">
				<div class="row justify-content-center">
					<h1>
						Habitaciones Disponibles (<%=listaHabitacion.size()%>)
					</h1>
					<hr>
				</div>
				<div
					class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
					<%
					for (int x = 0; x < listaHabitacion.size(); x++) {
					%>
					<div class="col mb-5">
						<div class="card h-100 pb-4">
							<img class="card-img-top"
								src="<%=listaHabitacion.get(x).getImagen()%>"
								alt="<%=listaHabitacion.get(x).getNombre()%>" />
							<div class="card-body p-4">
								<div class="text-center">
									<h5 class="fw-bolder"><%=listaHabitacion.get(x).getNombre()%></h5>

									<p><%=listaHabitacion.get(x).getDescripcion()%></p>
									CL$
									<%=listaHabitacion.get(x).getPrecio()%>
								</div>
							</div>
							<input type="radio" id="html" name="idHabitacion"
								value="<%=listaHabitacion.get(x).getId()%>" checked>
							<input type="hidden" name="cantidadHabitaciones" value="<%=listaHabitacion.get(x).getHabitaciones()%>">
						</div>
					</div>
					<%
					}
					%>
				</div>
			</div>
		</section>
		<!-- Formulario -->
		<section>
			<div class="container px-4 px-lg-5 mt-5">
				<h1>Información de Venta</h1>
				<hr />
				<div class="row g-3">
					<div class="col-md-6">
						<label for="nombre" class="form-label">Nombre</label> <input
							type="text" class="form-control" id="nombre" name="nombre"
							value="Arturo Erasmo">
					</div>
					<div class="col-md-6">
						<label for="apellido" class="form-label">Apellido</label> <input
							type="text" class="form-control" id="apellido" name="apellido"
							value="Vidal Pardo">
					</div>
					<div class="col-md-6">
						<label for="email" class="form-label">Email</label> <input
							type="text" class="form-control" id="email" name="email"
							value="arturo.vidal@anfp.cl">
					</div>
					<div class="col-md-2">
						<label for="medio_pago" class="form-label">Medio pago</label> <select
							id="medio_pago" name="medio_pago" class="form-select">
							<option value="Contado">Contado</option>
							<option value="Tarjeta">Tarjeta</option>
						</select>
					</div>
					<div class="col-md-2">
						<label for="dias" class="form-label">Días</label> <select
							id="dias" name="dias" class="form-select">
							<%
							for (int x = 0; x < 15; x++) {
							%>
							<option value="<%=x + 1%>"><%=x + 1%> día(s)
							</option>
							<%
							}
							%>
						</select>
					</div>
					<div class="col-md-2">
						<label for="fecha_entrada" class="form-label">Fecha de
							entrada</label> <select id="fecha_entrada" name="fecha_entrada" class="form-select">
							<option value="">Seleccione una fecha</option>
							<%
							String[] fechas = { "2023-01-05", "2023-01-06", "2023-01-07", "2023-01-08", "2023-01-09", "2023-01-10", "2023-01-11",
									"2023-01-12", "2023-01-13", "2023-01-14", "2023-01-15", "2023-01-16", "2023-01-17", "2023-01-18", "2023-01-19",
									"2023-01-20", "2023-01-21", "2023-01-22", "2023-01-23", "2023-01-24", "2023-01-25", "2023-01-26", "2023-01-27",
									"2023-01-28", "2023-01-29", "2023-01-30" };
							for (String fecha : fechas) {
							%>
							<option value="<%=fecha%>"><%=fecha%></option>
							<%
							}
							%>
						</select>
					</div>
					<div class="col-12">
						<hr />
						<button type="submit" class="btn btn-primary">Enviar
							Solicitud de Compra</button>
					</div>
				</div>
			</div>
		</section>
		<br /> <br />
	</form>
	<%@include file="assets/html/footer.jsp"%>
</body>
</html>