<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
	<meta charset="UTF-8">
	<link rel="shortcut icon" href="images/chanchito.ico" type="image/x-icon"/>
	<title>Simulador de pensiones AFP</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/bootstrap-theme.min.css"/>
	<link rel="stylesheet" href="cssper/estiloind.css"/>
</head>
<body>
		<div class="container-fluid">
			<h1 class="titulo">Simulador de fondos de pensiones</h1>
			<br/>
			 <p class="subtitulo">Este simulador te ayudará a planificar tus aportaciones
			 para que puedas disfrutar del nivel de vida que deseas a tu jubilación. Con el
			 podrá conocer el impacto fiscal de diversas opciones de cobro</p>
			
		</div>
		

	    <div class="container">    
        <div id="loginbox" style="margin-top:60px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-primary" >
                    <div class="panel-heading">
                        <div class="panel-title">Sign In</div>
                        
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="loginform" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="Usuario" autofocus>                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="password" placeholder="Contraseña">
                                    </div>
                                    

                                
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Recordar contraseña
                                        </label>
                                      </div>
                                    </div>


                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                      <a id="btn-login" href="pagina1.jsp" class="btn btn-success">Ingresar  </a>
                                      

                                    </div>
                                </div>


                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            No tengo una cuenta! 
                                        <a data-toggle="modal" data-target="#myModal" href="#">
                                            Registrate aqui
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                            </form>     



                        </div>                     
                    </div>  
        </div>
		
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        
			
				<div class="modal-dialog" role="document">
					<div class="modal-content">
			            <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="panel-title">Registrate</div>
                            
                        </div>  
                        <div class="panel-body" >
                            <form id="signupform form-order" class="form-horizontal" method="post" action="insertu">
                                
                                <div id="signupalert" style="display:none" class="alert alert-danger">
                                    <p>Error:</p>
                                    <span></span>
                                </div>
                                    
                                                                  
                                <div class="form-group">
                                    <label for="nombre" class="col-md-3 control-label">Nombres</label>
                                    <div class="col-md-9">
                                        <input required type="text" class="form-control" name="nombre" id="nombre" pattern="[A-Za-z |á|é|í|ó|ú|Á|É|Í|Ó|Ú]{1,30}" maxlength="30"
										title="No puede contener caracteres especiales" placeholder="Jorge Abel">
                                    </div>
                                </div>
                                    
                                <div class="form-group">
                                    <label for="apellido" class="col-md-3 control-label">Apellidos</label>
                                    <div class="col-md-9">
                                        <input required type="text" class="form-control" name="apellido" id="apellido" pattern="[A-Za-z |á|é|í|ó|ú|Á|É|Í|Ó|Ú]{1,30}" maxlength="30"
										title="No puede contener caracteres especiales" placeholder="Gutierrez Mendoza">
                                    </div>
								</div>
                                <div class="form-group">
                                    <label for="usuario" class="col-md-3 control-label">Usuario</label>
                                    <div class="col-md-9">
                                        <input required type="text" class="form-control" name="usuario" id="usuario" minlength="6" maxlength="20" 
										title="El usuario debe tener un minimo de 6 caracteres" placeholder="User123">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="contraseña" class="col-md-3 control-label">Contraseña</label> <span></span>
                                    <div class="col-md-9">
                                        <input required type="password" class="form-control" name="contrasenia" id="contrasenia" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" maxlength="15"
										title="Debe tener minimo 8 caracteres y contener mayusculas, minusculas y numeros" placeholder="********">
                                    </div>
                                </div>
                                <!--  
                                <div class="form-group">
                                    <label for="conficon" class="col-md-3 control-label">Confirmar contraseña</label>
                                    <div class="col-md-9">
                                        <input required type="password" class="form-control" name="conficon" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" maxlength="15"
										title="Debe tener minimo 8 caracteres y contener mayusculas, minusculas y numeros" placeholder="********">
                                    </div>
                                </div> -->
                                
                                
								<div class="form-group">
                                    <label for="fechnacim" class="col-md-3 control-label">Fecha de nacimiento</label>
                                    <div class="col-md-9">
                                        <input required type="date" class="form-control" name="fechnacim" min="1900-01-01">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="correo" class="col-md-3 control-label">Correo</label>
                                    <div class="col-md-9">
                                        <input required type="email" class="form-control" name="correo" id="correo" placeholder="ejemplo123@hotmail.com">
                                    </div>
                                </div>
                                    
                                <div class="form-group">
                                    <label for="telefono" class="col-md-3 control-label">Telefono</label>
                                    <div class="col-md-9">
                                        <input required type="tel" class="form-control" name="telefono" id="telefono" pattern="[0-9]{7,11}" maxlength="11"
										title="Mínimo 7 y máximo 11 números" placeholder="4231578">
                                    </div>
                                </div>
								
								<div class="form-group">
                                    <label for="genero" class="col-md-3 control-label">Genero</label>
                                    <div class="col-md-9">
										<div class="radio">
											<label for="radio1">
												<input checked type="radio" name="opcion1" id="radio1"/>Masculino
											</label>
											<label for="radio2">
												<input type="radio" name="opcion2" id="radio2"/>Femenino
											</label>
										</div>
									</div>
                                </div>

                                <div class="form-group">
                                    <!-- Button -->                                        
                                    <div class="col-md-offset-3 col-md-9">
                                        <button id="btn-signup" type="submit" class="btn btn-success"><i class="icon-hand-right"></i>
										&nbsp Registrarse &nbsp <span class="glyphicon glyphicon-ok" aria-hidden="true"></span></button>
                                        <button id="btn-signup" type="button" data-dismiss="modal" class="btn btn-danger"><i class="icon-hand-right"></i>
										&nbsp Cancelar &nbsp <span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                                    </div>
                                </div>
								
							                                                       
                            </form>    
                        </div>
                            
                        </div>
                    </div>

                </div>
               
        </div>
		</div>
         
    
	
	
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	
</body>
</html>