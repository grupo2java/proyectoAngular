package com.lucatic.agenda.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
* 
* @author grupo2
* 
* @Version 2.0
* 
* fecha:17/05/2019
* 
* Descripcion:Repositorio para la clase provincia
* 
* 
*
*/


import com.lucatic.agenda.model.Provincia;

@Repository
public interface ProvinciaRepository extends CrudRepository<Provincia, Integer>{
	
	

}
