package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Libro;

public class LibroDAOImpl implements LibroDAO {

	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	
	@Override
	public List<Libro> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.Libro");
		Query consulta = entityManager.createNativeQuery(sb.toString(), Libro.class);
		List<Libro> resultado = consulta.getResultList();
		return resultado;
	}

	@Override
	public Libro findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
