<%-- 
    Document   : index
    Created on : 22-ago-2018, 10:03:03
    Author     : java
--%>

<%@page import="exception.UsuPass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Hoteles</title>
        <script language="JavaScript">


            function saludar() {
                var nombre = inicio.usu.value;
                var pass = String.valueOf(inicio.pass.value);
                if (nombre.length == 0 || pass.length == 0)
                    alert("compruebe que ha escrito un usuario y contraseña");
            }
        </script>
    </head>
    <body  >

        <form name="inicio" action="/WebAppHoteles/Home" method="post">
            <div align="center">
                <div class="card" style="width:400px">
                    <img class="card-img-top" src="imagenes/inicio.jpg" alt="Card image" style="width:100%">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="form-group">
                                    <label> usuario</label>
                                    <input type="text" class="form-control" placeholder="usuario" name="usu">
                                </div>

                                <div class="form-group" >
                                    <label >contraseña</label>
                                    <input type="password" class="form-control"  placeholder="contraseña" name="pass">
                                </div>

                                <div class="form-group" >
                                    <button type="submit" class="btn btn-primary" name="ini" onclick="saludar()">iniciar</button>
                                    </form>

                                    <form name="reg" action="/WebAppHoteles/reg" method="post">
                                        <button type="submit" class="btn btn-primary" name="reg">registrarse</button>
                                    </form>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>

            </div>



    </body>
</html>
