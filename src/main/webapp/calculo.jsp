<%-- 
    Document   : Actividad3
    Created on : 30/01/2020, 09:30:57 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    Integer resultadoArea = (Integer) request.getAttribute("resultadoArea");
    Integer resultadoPerimetro = (Integer) request.getAttribute("resultadoPerimetro");
%>

<!DOCTYPE html>
<body style="background-color:pink;"></body> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <center><h1>Resultado</h1>       
            El area es: <%=resultadoArea%><br>
          El perimetro es: <%=resultadoPerimetro%>
    </body>
</html>
