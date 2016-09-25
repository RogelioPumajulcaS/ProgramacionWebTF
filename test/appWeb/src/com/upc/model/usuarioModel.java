package com.upc.model;

import java.sql.SQLException;
import java.util.List;

import com.upc.dao.IUsuariodao;
import com.upc.dto.Usuario;
import com.upc.factory.Factory;

public class usuarioModel {

	private IUsuariodao udao=null;
	  
	  public usuarioModel(){
		  udao=Factory.getInstance().getUsuariodao();
	  }
		
	  
	  public void RegistrarUsuario(Usuario usua) throws SQLException{
		  udao.create(usua);
	  }
	  
	  public void EliminarUsuario(int id) throws SQLException{
		  udao.delete(id);
	  }
	  
	  public void ActualizarUsuario(Usuario usua) throws SQLException{
		  udao.update(usua);
	  }
	  
	  public Usuario BuscarUsuario(int id) throws SQLException{
		  return udao.get(id);
	  }
	  
	  public List<Usuario> Listarusuarios() throws SQLException{
		  return udao.getAll();
	  }
	  
}
