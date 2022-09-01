package com.uniquindio.proyectosoftware2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Column(name = "titulo", nullable = false, length = 50)
	private String titulo;

	@Id
	private String ISBN;

	@Column(name = "review", nullable = true, length = 200)
	private String review;

	@Column(name = "calificacion", nullable = true, length = 2)
	private Integer calificacion;

	@Column(name = "autor", nullable = false, length = 30)
	private String autor;

	public Libro() {

	}

	public Libro(String titulo, String iSBN, String autor) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
		this.autor = autor;
	}

	public Libro(String titulo, String iSBN, String review, int calificacion, String autor) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
		this.review = review;
		this.calificacion = calificacion;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + ", review=" + review + ", calificacion=" + calificacion
				+ ", autor=" + autor + "]";
	}

}
