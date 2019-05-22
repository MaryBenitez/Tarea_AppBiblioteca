package com.uca.capas.controller;

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
		List<Libro> libros = libroservice.busqueda(buscar, code);
		mav.addObject("libros",libros);
		mav.setViewName("buscar");
		
		return mav;
	}
	
	@RequestMapping("/BTodos")
	public ModelAndView BuscarTodos() {
		ModelAndView mav = new ModelAndView();
		List<Libro> libros = libroservice.findAll();
		mav.addObject("libros",libros);
		mav.setViewName("Lista");
		
		return mav;
	}
	

}
