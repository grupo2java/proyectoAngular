package com.lucatic.agenda.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lucatic.agenda.model.Provincia;
import com.lucatic.agenda.services.ProvinciaService;

/*
 * @author grupo2
 * 
 * @versiom 2.0
 * 
 * @date 20/05/2019
 * 
 * @description controlador que realiza las tareas de provincia
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/provincia"})
public class ProvinciaController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private ProvinciaService provinciaService;

	@GetMapping
	public List<Provincia> ProvinciaLista() {
		logger.info("--Lista de provincias");
		return provinciaService.findAll();
	}


	@PostMapping
	public Provincia create(@RequestBody Provincia provincia) {
		return provinciaService.create(provincia);
	}

	@GetMapping(path = {"/{id}"})
	public Provincia findOne(@PathVariable("id") int id) {
		return provinciaService.findById(id);
	}

	@PutMapping(path= {"/{id}"})
	public Provincia update(@PathVariable("id") int id, @RequestBody Provincia provincia) {
		provincia.setIdprovincia(id);
		return provinciaService.update(provincia);
	}

	@DeleteMapping(path = {"/{id}"})
	public Provincia delete(@PathVariable("id") int id) {
		return provinciaService.deleteById(id);
	}
	
	

}
