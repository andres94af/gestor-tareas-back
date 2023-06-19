package com.tareas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tareas.model.Tarea;
import com.tareas.repository.TareaRepository;

@Service
public class TareaServiceImpl implements TareaService{

	@Autowired
	TareaRepository repository;
	
	@Override
	public List<Tarea> findAll() {
		return repository.findAll();
	}

	@Override
	public Tarea save(Tarea tarea) {
		return repository.save(tarea);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
