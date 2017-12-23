<%-- 
    VideoAulas Neri www.www.com.br
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Tecnoar/FaleConosco</title>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    </head>
    <body> 
    <form action="enviaremail.jsp" method="post">  
    <table border="0" align="center" bgcolor="gray">  
    <tr>  
    <tr>  
    <td>  
    <font color="blue"><b>Nome</b></font></td>  
    <td><input name="nome" type="Text"><font color="blue"></td>  
    </tr>  
    <td>  
    <font color="blue"><b>E-mail</b> </font></td>  
    <td><input type="Text" name="de"><font color="blue"></td>  
    </tr>  
        <td>  
    <font color="blue"><b>Fone</b> </font></td>  
    <td><input type="Text" name="fone"><font color="blue"></td>  
    </tr>  
    <tr>  
    <td><font color="blue"><b>Assunto</b></font></td>  
    <td><select name="assunto">  
        <option>Chamados</option>  
        <option>Contato</option>  
        <option>Informações</option>  
    </select><font color="blue"></td>  
    </tr>  
    <tr>  
    <td colspan="2">  
    <textarea name="obs" rows=10 cols=45></textarea>
		
    </td>
		</tr>
	<tr>
	<td>
	<p> 
<input name="sendBtn" type="submit"  value="Enviar">
&nbsp; 
<input type="reset"  value="Limpar"> 
</p>	
		
	</td>	
	</tr>	
</body>
</html>


s
