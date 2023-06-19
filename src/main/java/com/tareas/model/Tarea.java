package com.tareas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tareas")
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private boolean completada;

	public Tarea() {
	}

	public Tarea(Integer id, String nombre, boolean completada) {
		this.nombre = nombre;
		this.completada = completada;
	}

}
