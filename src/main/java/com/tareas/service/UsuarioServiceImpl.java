package com.tareas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareas.model.Usuario;
import com.tareas.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository repository;

	@Override
	public Optional<Usuario> findByEmail(String email) {
		return repository.findByEmail(email);
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void save(Usuario usuario) {
		repository.save(usuario);
	}

}
