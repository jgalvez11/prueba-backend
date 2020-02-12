package com.backend.mysql.app.models.services;

import java.util.List;

import com.backend.mysql.app.models.entity.Usuario;

public interface IUsuarioService {

	/**
	 * Buscar todos los usuarios
	 * 
	 * @return Lista de usuarios
	 */
	public List<Usuario> findAll();

	/**
	 * Buscar usuario por ID
	 * 
	 * @param id
	 * @return Usuario
	 */
	public Usuario findById(int id);

	/**
	 * Guardar usuario
	 * 
	 * @param usuario
	 * @return Usuario creado
	 */
	public Usuario save(Usuario usuario);

}
