package com.tareas.service;

import java.util.List;
import java.util.Optional;

import com.tareas.model.Tarea;

public interface TareaService{

	List<Tarea> findAll();
	Optional<Tarea> findById(Integer id);
	Tarea save(Tarea tarea);
	Tarea update(Tarea tarea);
	void delete(Integer id);
	
	
}
