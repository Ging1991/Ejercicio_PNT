package com.pnt.ejercicio;

import com.pnt.ejercicio.supermercado.Supermercado;

public class Main {
	
	public static void main(String[] args) {
		Supermercado supermercado = new Supermercado();
		supermercado.cargarProductos();
		supermercado.mostrarProductos();
		System.out.println("=============================");
		supermercado.mostrarExtremos();
	}

}