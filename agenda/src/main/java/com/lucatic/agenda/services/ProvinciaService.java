package com.lucatic.agenda.services;

import java.util.List;

import com.lucatic.agenda.model.Provincia;

public interface ProvinciaService {

	Provincia create(Provincia provincia);
	Provincia deleteById(int id);
	Provincia findById(int id);
	List<Provincia> findAll();
	Provincia update(Provincia provincia);
}
