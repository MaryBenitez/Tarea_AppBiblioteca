package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.dao.LibroDAO;
import com.uca.capas.domain.Libro;

@Service
public class LibroServiceImpl implements LibroService{
	
	@Autowired
	LibroDAO libroDAO;

	@Override
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
		return libroDAO.findAll();
	}

	@Override
	public List<Libro> busqueda(String valor, String opcion) {
		// TODO Auto-generated method stub
		return libroDAO.busqueda(valor, opcion);
	}

	
	

}
