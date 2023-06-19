package com.tareas.service;

import java.util.List;
import com.tareas.model.Tarea;

public interface TareaService{

	List<Tarea> findAll();
	Tarea save(Tarea tarea);
	void delete(Integer id);
	
}
