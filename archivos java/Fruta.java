package com.pnt.ejercicio.productos;

import com.pnt.ejercicio.supermercado.Producto;
import com.pnt.ejercicio.supermercado.UnidadDeVenta;

public class Fruta extends Producto {
	private UnidadDeVenta unidad;

	public Fruta(String nombre, Double precio, UnidadDeVenta unidad) {
		super(nombre, precio);
		this.unidad = unidad;
	}

	public UnidadDeVenta getUnidadDeVenta() {
		return unidad;
	}

	public void setUnidadDeVenta(UnidadDeVenta unidad) {
		this.unidad = unidad;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+" /// Precio: $"+precio.intValue()+" /// Unidad de venta: "+unidad;
	}

}