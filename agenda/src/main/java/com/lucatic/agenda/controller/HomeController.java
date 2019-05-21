package com.lucatic.agenda.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lucatic.agenda.model.Persona;
import com.lucatic.agenda.services.PersonaService;

/*
 * @author grupo2
 * 
 * @date 20/05/2019
 * 
 * @version 2.0
 * 
 * @Description controlador que hace las tareas de contacto
 * 
 * 
 */

@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping({"/persona"})
public class HomeController {

	@Autowired
	private PersonaService persoService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@PostMapping
	public Persona create(@RequestBody Persona persona) {
		logger.info("-- en crear");
		return persoService.create(persona);
	}
	
	@GetMapping(path= {"/{id}"})
	public Persona findOne(@PathVariable("id") int id) {
		return persoService.findById(id);
	}

	@PutMapping(path= {"/{id}"})
	public Persona update(@PathVariable("id") int id, @RequestBody Persona persona) {
		persona.setIdpersona(id);
		logger.info("-- en editar");
		return persoService.update(persona);
	}

	
	@DeleteMapping(path= {"/{id}"})
	public Persona delete(@PathVariable("id") int id) {
		logger.info("-- en eliminar");
		return persoService.deleteById(id);
	}
	
	@GetMapping
	public List<Persona> findAll(){
		return persoService.list();
	}
	

}
