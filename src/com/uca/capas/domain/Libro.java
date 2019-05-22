package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="libro")
public class Libro {
	
	@Id
	@GeneratedValue(generator="libro_id_libro_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "libro_id_libro_seq", sequenceName = "public.libro_id_libro_seq", allocationSize = 1)
	@Column(name="id_libro")
	private int id_libro;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="autor")
	private String autor;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="existencia")
	private int cant_exist;
	
	public Libro() {}
	
	public Libro(int id_libro, String titulo, String autor, String genero, String isbn, int cant_exist) {
		super();
		this.id_libro = id_libro;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.isbn = isbn;
		this.cant_exist = cant_exist;
	}
	
	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public int getCant_exist() {
		return cant_exist;
	}

	public void setCant_exist(int cant_exist) {
		this.cant_exist = cant_exist;
	}
	
}
