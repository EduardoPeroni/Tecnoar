<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags/layout" prefix="layout" %>


 <layout:template>   
    
    

    <jsp:body>
        <figure>
		<span class="trs next"></span>
		<span class="trs prev"></span>

		<div id="slider">
                    <a href="#" class="trs"><img src="<c:url value="/static/img/border.jpg"/>" width="100%" height="354px"></a>
                    <a href="#" class="trs"><img src="<c:url value="/static/img/calculator.jpg"/>" width="100%" height="354px"></a>
		</div>

		<figcaption></figcaption>
	</figure>

	
<section class="section m-none">
					<div class="container">
						<div class="row">
							<div class="col-md-12 center">
								<h2>Servi�os</h2>
							</div>
						</div>
						<div class="row mt-lg">
							<div class="col-xs-12 col-md-4">
								<div class="row">
									<div class="col-xs-12 col-md-4">
                                                                            <img class="img-responsive mb-lg" src="<c:url value="/static/img/1.jpg"/> " alt="" height="100px" width="90%" />
									</div>
									<div class="col-md-8">    
										<h4 class="mb-xs">HIGIENIZA��O</h4>
										<p>teste teste teste teste teste teste teste</p>
										<p><a class="btn-flat btn-xs" href="<c:url value="/jsp/higieniza�ao/Higieniza�ao.jsp"/>">Conhe�a<i class="fa fa-arrow-right"></i></a></p>
									</div>
								</div>
							</div>
							<div class="col-xs-12 col-md-4">
								<div class="row">
									<div class="col-xs-12 col-md-4">
                                                                            <img class="img-responsive mb-lg" src="<c:url value="/static/img/1.jpg"/> " alt="" height="100px" width="90%"/>
									</div>
									<div class="col-md-8">
										<h4 class="mb-xs">MANUTEN��O</h4>
										<p>teste teste teste teste teste teste teste teste </p>
										<p><a class="btn-flat btn-xs" href="<c:url value="/jsp/manuten�ao/Manuten�ao.jsp"/>">Conhe�a<i class="fa fa-arrow-right"></i></a></p>
									</div>
								</div>
							</div>
							<div class="col-xs-12 col-md-4">
								<div class="row">
									<div class="col-xs-12  col-md-4">
										<img class="img-responsive mb-lg" src="<c:url value="/static/img/1.jpg"/> " alt="" height="100px" width="90%">
									</div>
									<div class="col-md-8">
										<h4 class="mb-xs">INSTALA��O</h4>
										<p>teste teste teste teste teste teste teste</p>
										<p><a class="btn-flat btn-xs" href="<c:url value="/jsp/instala�ao/Instala�ao.jsp"/>">Conhe�a<i class="fa fa-arrow-right"></i></a></p>
									</div>
								</div>
							</div>

						</div>
					</div>
				</section>
         </jsp:body>
</layout:template>
