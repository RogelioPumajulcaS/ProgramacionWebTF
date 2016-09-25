package com.upc.dao;

import java.sql.SQLException;

import com.upc.dto.Usuario;

public interface IUsuariodao extends ICruddao<Usuario>, IRowmapper<Usuario> {

	Usuario autenticar(String usuario, String contraseña)throws SQLException;
}
