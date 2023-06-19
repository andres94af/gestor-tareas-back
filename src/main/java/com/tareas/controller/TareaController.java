package com.tareas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tareas.model.Tarea;
import com.tareas.service.TareaService;

@RestController
@RequestMapping("/api/v1")
public class TareaController {
	
	@Autowired
	TareaService tareaService;

	@GetMapping("/")
	public List<Tarea> obtenerTareas(){
		return tareaService.findAll();
	}
	
}
