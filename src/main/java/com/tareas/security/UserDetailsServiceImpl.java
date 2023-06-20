package com.tareas.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tareas.model.Usuario;
import com.tareas.service.UsuarioService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UsuarioService usuarioService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	Usuario usuario = usuarioService
			.findByEmail(email)
			.orElseThrow(()-> new UsernameNotFoundException("El usuario con email " + email + " no existe"));
	
		return new UserDetailsImpl(usuario);
	}

}
