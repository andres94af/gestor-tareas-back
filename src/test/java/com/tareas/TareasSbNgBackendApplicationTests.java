package com.tareas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.tareas.model.Tarea;
import com.tareas.service.TareaService;

@SpringBootTest
class TareasSbNgBackendApplicationTests {

	@Autowired
	TareaService tareaService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void saveTareaDDBB() {
		Tarea tarea1 = new Tarea(null, "Estudiar ingles", false);
		Tarea tareaEsperada = tareaService.save(tarea1);
		assertEquals(tareaEsperada, tarea1, "Es correcto");
	}

}
