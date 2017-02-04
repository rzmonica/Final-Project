<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="col-md-12">
	<div id="carousel-1" class="carousel slide" data-ride="carousel">
		<!--Indicadores-->
		<ol class="carousel-indicators">
			<li data-target="#carousel-1" data-slide-to="0" class="active"></li>
			<li data-target="#carousel-1" data-slide-to="1"></li>
			<li data-target="#carousel-1" data-slide-to="2"></li>
		</ol>

		<!--Contenedor-->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="${pageContext.request.contextPath}/resources/img/img1.jpg"  alt="" class="img-responsive">
				<div class="carousel-caption hidden-xs hidden-sm">
					<h3>Welcome</h3>
					<p>Find the book that you are looking for!</p>
				</div>
			</div>
			<div class="item">
				<img src="${pageContext.request.contextPath}/resources/img/img2.jpg" alt="" class="img-responsive">
				<div class="carousel-caption hidden-xs hidden-sm">
					<h3>Welcome</h3>
					<p>Thousands of options</p>
				</div>
			</div>
			<div class="item">
				<img src="${pageContext.request.contextPath}/resources/img/img3.jpg" alt="" class="img-responsive">
				<div class="carousel-caption hidden-xs hidden-sm">
					<h3>Welcome</h3>
					<p>Order Now!</p>
				</div>
			</div>
		</div>

		<!--Controles-->
		<a href="#carousel-1" class="left carousel-control" rol="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a href="#carousel-1" class="right carousel-control" rol="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>

	</div>
</div>