function setaImagem(){
			var settings = {
				primeiraImg: function(){
					elemento = document.querySelector("#slider a:first-child");
					elemento.classList.add("ativo");
					this.legenda(elemento);
				},

				slide: function(){
					elemento = document.querySelector(".ativo");

					if(elemento.nextElementSibling){
						elemento.nextElementSibling.classList.add("ativo");
						settings.legenda(elemento.nextElementSibling);
						elemento.classList.remove("ativo");
					}else{
						elemento.classList.remove("ativo");
						settings.primeiraImg();
					}

				},

				proximo: function(){
					clearInterval(intervalo);
					elemento = document.querySelector(".ativo");
					
					if(elemento.nextElementSibling){
						elemento.nextElementSibling.classList.add("ativo");
						settings.legenda(elemento.nextElementSibling);
						elemento.classList.remove("ativo");
					}else{
						elemento.classList.remove("ativo");
						settings.primeiraImg();
					}
					intervalo = setInterval(settings.slide,4000);
				},

				anterior: function(){
					clearInterval(intervalo);
					elemento = document.querySelector(".ativo");
					
					if(elemento.previousElementSibling){
						elemento.previousElementSibling.classList.add("ativo");
						settings.legenda(elemento.previousElementSibling);
						elemento.classList.remove("ativo");
					}else{
						elemento.classList.remove("ativo");						
						elemento = document.querySelector("a:last-child");
						elemento.classList.add("ativo");
						this.legenda(elemento);
					}
					intervalo = setInterval(settings.slide,4000);
				},

				legenda: function(obj){
					var legenda = obj.querySelector("img").getAttribute("alt");
					document.querySelector("figcaption").innerHTML ="" ;
				}

			};


			//chama o slide
			settings.primeiraImg();

			//chama a legenda
			settings.legenda(elemento);

			//chama o slide à um determinado tempo
			var intervalo = setInterval(settings.slide,4000);
			document.querySelector(".next").addEventListener("click",settings.proximo,false);
			document.querySelector(".prev").addEventListener("click",settings.anterior,false);

		}

		window.addEventListener("load",setaImagem,false);
                
                
                
                $(".menu>ul").addClass("js");
			$(".menu>ul").addClass("js").before('<div class="atalho">?</div>');

			$(".atalho").click(function(){
				$(".menu>ul").toggle();
			});

			$(window).resize(function(){
				if(window.innerWidth > 768) {
					$(".menu>ul").removeAttr("style");
				}			});
                            
                            
                            var corAtiva = "rgb(112, 156, 190)";
var corInativa = "rgb(255, 255, 255)";
$(function(){
    $(".titulo").hover(
        function(){$(this).css("background", corAtiva);},
        function(){$(this).css("background", corInativa);}
    );
	$(".conteudo").hover(
        function(){$(this).css("background", corAtiva);},
        function(){$(this).css("background", corInativa);}
    );
 
    $(".titulo").click(function(){
        $(".conteudo").slideUp();
        var cont = $(this).next();
        $(cont).slideDown("fast");      
    });
	$(".conteudo").click(function(){
        $(".subconteudo").slideUp();
        var cont = $(this).next();
        $(cont).slideDown("fast");      
    });
});



$(document).ready(function(){
  $('.menujq > ul > li:has(ul)').addClass('desplegable');
   $('.menujq > ul > li > a').click(function() {
     var comprobar = $(this).next();
     $('.menujq li').removeClass('active');
     $(this).closest('li').addClass('active');
     if((comprobar.is('ul')) && (comprobar.is(':visible'))) {
        $(this).closest('li').removeClass('active');
        comprobar.slideUp('normal');
     }
     if((comprobar.is('ul')) && (!comprobar.is(':visible'))) {
        $('.menujq ul ul:visible').slideUp('normal');
        comprobar.slideDown('normal');
     }
  });
  $('.menujq > ul > li > ul > li:has(ul)').addClass('desplegable');
   $('.menujq > ul > li > ul > li > a').click(function() {
     var comprobar = $(this).next();
     $('.menujq ul ul li').removeClass('active');
     $(this).closest('ul ul li').addClass('active');
     if((comprobar.is('ul ul')) && (comprobar.is(':visible'))) {
        $(this).closest('ul ul li').removeClass('active');
        comprobar.slideUp('normal');
     }
     if((comprobar.is('ul ul')) && (!comprobar.is(':visible'))) {
        $('.menujq ul ul ul:visible').slideUp('normal');
        comprobar.slideDown('normal');
     }
  });
});	
	

