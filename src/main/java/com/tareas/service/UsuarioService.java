package com.tareas.service;

import java.util.Optional;

import com.tareas.model.Usuario;

public interface UsuarioService {

	Optional<Usuario> findByEmail(String email);
	Optional<Usuario> findById(Integer id);
	void save(Usuario usuario);
	
}
