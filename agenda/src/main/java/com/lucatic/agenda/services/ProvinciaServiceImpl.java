package com.lucatic.agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatic.agenda.dao.ProvinciaRepository;
import com.lucatic.agenda.model.Provincia;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

	@Autowired
	private ProvinciaRepository provinciaRepository;
	
	@Override
	public Provincia deleteById(int id) {
		Provincia provincia = findById(id);
		if(provincia != null) {
			provinciaRepository.delete(provincia);
		}
		return provincia;
	}

	@Override
	public Provincia findById(int id) {
		return provinciaRepository.findById(id).orElse(null);
	}

	@Override
	public Provincia create(Provincia provincia) {
		return provinciaRepository.save(provincia);
	}

	@Override
	public List<Provincia> findAll() {
		return (List<Provincia>) provinciaRepository.findAll();
	}

	@Override
	public Provincia update(Provincia provincia) {
		return provinciaRepository.save(provincia);
	}
	

}
