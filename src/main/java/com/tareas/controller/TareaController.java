package com.tareas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tareas.model.Tarea;
import com.tareas.service.TareaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/v1/tareas")
public class TareaController {

	@Autowired
	TareaService tareaService;

	@GetMapping
	public List<Tarea> obtenerTareas() {
		System.out.println("Se llamo al get");
		return tareaService.findAll();
	}

	@PostMapping
	public void crearOEditarTarea(@RequestBody Tarea tarea) {
		System.out.println("Se va a guardar lo siguiente: " + tarea);
		tareaService.save(tarea);
	}

	@DeleteMapping(path = "/{id}")
	public void eliminarTarea(@PathVariable("id")Integer id) {
		System.out.println("Se va a eliminar la tarea con id " + id);
		tareaService.delete(id);
	}

}
