package com.upc.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.dao.IUsuariodao;
import com.upc.ds.Dbconnection;
import com.upc.dto.Usuario;

public class Usuariodao implements IUsuariodao {

	@Override
	public void create(Usuario o) throws SQLException {
		
		String insert = "{call sp_insert_usuario(?,?,?,?,?,?,?,?,?,?)}";

		Connection cn = Dbconnection.getInstance();

		cn.setAutoCommit(true);// Transaccion nivel BD.

		CallableStatement cs = cn.prepareCall(insert);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		
		cs.setString(2, o.getNombres());
		cs.setString(3, o.getApellidos());
		cs.setString(4, o.getUsuario());
		cs.setString(5, o.getContraseña());
		cs.setDate(6, (java.sql.Date) o.getFechaNacimiento());
		cs.setString(7, o.getCorreo());
		cs.setLong(8, o.getTelefono());
		cs.setString(9, o.getGenero());
		cs.setString(10, o.getAutorizacion());
				
		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new SQLException();
		}
		
	}

	@Override
	public void update(Usuario o) throws SQLException {
		
		String update = "{call sp_update_usuario(?,?,?,?,?,?,?,?,?,?,?)}";

		Connection cn = Dbconnection.getInstance();

		cn.setAutoCommit(true);// Transaccion nivel BD.

		CallableStatement cs = cn.prepareCall(update);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		
		cs.setInt(2, o.getIdUsuario());
		cs.setString(3, o.getNombres());
		cs.setString(4, o.getApellidos());
		cs.setString(5, o.getUsuario());
		cs.setString(6, o.getContraseña());
		cs.setDate(7, (java.sql.Date) o.getFechaNacimiento());
		cs.setString(8, o.getCorreo());
		cs.setLong(9, o.getTelefono());
		cs.setString(10, o.getGenero());
		cs.setString(11, o.getAutorizacion());
				
		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new SQLException();
		}
		
	}

	@Override
	public void delete(int id) throws SQLException {
		
		String delete = "{call sp_delete_usuario(?,?)}";

		Connection cn = Dbconnection.getInstance();

		cn.setAutoCommit(true);// Transaccion nivel BD.

		CallableStatement cs = cn.prepareCall(delete);

		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		//TODO
		cs.setInt(2, id);
						
		cs.execute();

		String estado = cs.getString(1);

		cs.close();
		cs = null;

		if (!estado.equals("ok")) {
			throw new SQLException();
		}
		
	}

	@Override
	public Usuario get(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "{call sp_get_usuario(?)}";

		Connection cn = Dbconnection.getInstance();

		CallableStatement cs = cn.prepareCall(query);

		cs.setInt(1, id);
						
		ResultSet rs = cs.executeQuery();

		if(rs.next()){
			mapRow(rs);
		}
		
		return mapRow(rs);
	}

	@Override
	public List<Usuario> getAll() throws SQLException {
		
		List<Usuario> lista = new ArrayList<>();
		String query = "{call sp_list_usuario()}";

		Connection cn = Dbconnection.getInstance();

		CallableStatement cs = cn.prepareCall(query);

		ResultSet rs = cs.executeQuery();

		while(rs.next()){
			lista.add(mapRow(rs));
		}
		
		return lista;
	}

	@Override
	public Usuario mapRow(ResultSet rs) throws SQLException {
		
		Usuario u = new Usuario();
		
		u.setIdUsuario(rs.getInt(1));
		u.setNombres(rs.getString(2));
		u.setApellidos(rs.getString(3));
		u.setUsuario(rs.getString(4));
		u.setContraseña(rs.getString(5));
		u.setFechaNacimiento(rs.getDate(6));
		u.setCorreo(rs.getString(7));
		u.setTelefono(rs.getInt(8));
		u.setGenero(rs.getString(9));
		u.setAutorizacion(rs.getString(10));
		
		return u;
	}

	@Override
	public Usuario autenticar(String usuario, String contraseña) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
