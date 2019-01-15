package com.pnt.ejercicio.productos;

import com.pnt.ejercicio.supermercado.Producto;

public class Bebida extends Producto {
	private Double litros;

	public Bebida(String nombre, Double precio, Double litros) {
		super(nombre, precio);
		this.litros = litros;
	}

	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+" /// Litros: "+litros+" /// Precio: $"+precio.intValue();
	}
	
}