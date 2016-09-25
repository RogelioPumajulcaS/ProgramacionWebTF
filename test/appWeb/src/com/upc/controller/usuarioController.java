package com.upc.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dto.Usuario;
import com.upc.model.usuarioModel;

@WebServlet({ "/newu", "/insertu", "/editu", "/updateu", "/listu" })
public class usuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private usuarioModel umodel = null;
	private String mensaje = null;
	private String destino = "index.jsp";
	
    public usuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	umodel = new usuarioModel();
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path = request.getServletPath();
		try {
			
			if(path.equals("/newu")){
				destino="index.jsp";
			}else if(path.equals("/insertu")){
				insert(request);
				/*mensaje = get(request, umodel);*/
				destino = "pagina3.jsp";
			}else if(path.equals("/editu")){
				read(request, umodel);
				destino = "pagina4.jsp";
			}else if(path.equals("/updateu")){
				update(request);
				mensaje = get(request, umodel);
				destino = "pagina4.jsp";
			}
			
			if(mensaje != null){
				request.setAttribute("mensaje", mensaje);
			}else{
				request.removeAttribute("mensaje");
			}
			
		} catch (SQLException e) {
			
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);
	}

	protected void insert(HttpServletRequest request) throws ServletException, IOException, SQLException {
		
		Usuario usu = new Usuario();
		usu.setNombres(request.getParameter("nombre"));
		usu.setApellidos(request.getParameter("apellido"));
		usu.setUsuario(request.getParameter("usuario"));
		usu.setContraseña(request.getParameter("contrasenia"));
		usu.setCorreo(request.getParameter("correo"));
		usu.setTelefono(Integer.parseInt(request.getParameter("telefono")));
		usu.setGenero(request.getParameter("genero"));
		umodel.RegistrarUsuario(usu);
	}
	
	protected void update(HttpServletRequest request) throws ServletException, IOException, SQLException {
		
		Usuario usu = new Usuario();
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String usuario = request.getParameter("usuario");
		String contrasenia = request.getParameter("contrasenia");
		String correo = request.getParameter("correo");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		String genero = request.getParameter("genero");
		
		usu.setIdUsuario(id);
		usu.setNombres(nombre);
		usu.setApellidos(apellido);
		usu.setUsuario(usuario);
		usu.setContraseña(contrasenia);
		usu.setCorreo(correo);
		usu.setTelefono(telefono);
		usu.setGenero(genero);
		
		umodel.ActualizarUsuario(usu);
	}
	
	protected void delete(HttpServletRequest request) throws ServletException, IOException, SQLException {
		
		Usuario usu = new Usuario();
		int id = Integer.parseInt(request.getParameter("id"));
		
		umodel.EliminarUsuario(id);
	}
	
	protected String get(HttpServletRequest request, usuarioModel umodel) throws ServletException, IOException, SQLException {
		String error = null;
		
		return error;
	}
	
	protected String read(HttpServletRequest request, usuarioModel umodel) throws ServletException, IOException, SQLException {
		String error = null;
		
		return error;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
