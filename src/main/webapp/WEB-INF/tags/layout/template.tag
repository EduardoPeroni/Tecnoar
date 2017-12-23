<%@ tag pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
]

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->



<html>
   <head>
    <link href="<c:url value="/static/css/css.css" />" rel="stylesheet"/>
    <link href="<c:url value="/static/css/bootstrap.css" />" rel="stylesheet"/>
    <link href="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js" />" rel="stylesheet"/>
    <link href="<c:url value="/static/Javascript/javascript.js"/>" rel="stylesheet" />
    <link href="<c:url value="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js" />" rel="stylesheet" />
    <link href="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js" />" rel="stylesheet" />
    <meta name="text:Search Label" content="" />
    <script type="text/javascript" src="http://static.tumblr.com/p2evvtm/Wycm17d1m/tumblr_search_box.js"></script>    
   </head>
<body>
    <header>
                <!-- Header Inicio -->
            <div class="pagina">
            <nav class="menu">
				
                <ul>
                    <li><a href="<c:url value="/"/>">Início</a></li> 
                    <li><a href="<c:url value="/empresa/A Empresa/"/>">A EMPRESA</a></li>  
		    <li><a href="<c:url value="/faleconosco/FaleConosco/"/>">FALE CONOSCO</a></li>
                    <li><a href="<c:url value="/produtos/Produtos/"/>">PRODUTOS</a></li>
                    <li><a>SERVIÇOS</a>
					<ul>
                                            <a href="<c:url value="/higienização/Higienizaçao"/>" class="subProduto">Higienização</a>
                                            <a href="<c:url value="/manutenção/Manutençao"/>" class="subProduto">Manutenção</a>
                                            <a href="<c:url value="/instalação/Instalaçao"/>" class="subProduto">Instalação</a>
					</ul>
                    </li>
		</ul>
                </nav>
        
                </div>
    </header>
            <div class="imagem">
                <img src="<c:url value="/static/img/LogoTecnoar.png"/>" align="left" alt="logomarca" title="Logo_Tecnoar" style="width:25%" />
            </div>
<footer class="short" id="footer">
				<div class="container">
					<div class="row">
						<div class="col-md-8">
							<h4 class="heading-primary">Endereço</h4>
							<p>Rua IPSUM IPSUM Pato Branco PR </p>
							
						</div>
						<div class="col-md-3 col-md-offset-1">
							<h5 class="mb-sm">Contato</h5>
							<span class="phone">00000000</span>
							
							<ul class="list list-icons list-icons-sm">
								<li><i class="fa fa-envelope"></i><a href="<c:url value="mailto:Fulano@hotmail.com"/>">Full@hotmail.com</a></li>
							</ul>
							
						</div>
					</div>
				</div>
</footer>    
        
       
</body>    
</html>