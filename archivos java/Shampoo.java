package com.pnt.ejercicio.productos;

import com.pnt.ejercicio.supermercado.Producto;

public class Shampoo extends Producto {
	private Integer contenidoML;

	public Shampoo(String nombre, Double precio, Integer contenidoML) {
		super(nombre, precio);
		this.contenidoML = contenidoML;
	}

	public Integer getContenidoML() {
		return contenidoML;
	}

	public void setContenidoML(Integer contenidoML) {
		this.contenidoML = contenidoML;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+" /// Contenido: "+contenidoML+"ml /// Precio: $"+precio.intValue();
	}

}