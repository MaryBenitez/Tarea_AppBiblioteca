package com.uca.capas.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Libro;
import com.uca.capas.service.LibroService;


@Controller
public class MainController {
	
	@Autowired
	public LibroService libroservice;
	
	@RequestMapping("/")
	public String initMain() {
		return "main";
	}
	
	@RequestMapping("/BuscarLibro")
	public ModelAndView BuscarLibro(@RequestParam(value="seleccionar")String code,@RequestParam(value="buscar")String buscar) {
		ModelAndView mav = new ModelAndView();
		BigInteger cant_enti_e = libroservice.contar(buscar, code);
		List<Libro> libros = libroservice.busqueda(buscar, code);
		String dato = buscar;
		mav.addObject("libros",libros);
		mav.addObject("Cantidad_Entidades",cant_enti_e);
		mav.addObject("buscar",dato);
		mav.setViewName("buscar");
		
		return mav;
	}
	
	@RequestMapping("/BTodos")
	public ModelAndView BuscarTodos() {
		ModelAndView mav = new ModelAndView();
		List<Libro> libros = libroservice.findAll();
		BigInteger Total_Existencia_L = libroservice.suma2();
		BigInteger Cantidad_Autores = libroservice.contar2();
		mav.addObject("libros",libros);
		mav.addObject("Total_Existencia_L",Total_Existencia_L);
		mav.addObject("Cantidad_Autores",Cantidad_Autores);
		mav.setViewName("Lista");
		
		return mav;
	}
	

}
