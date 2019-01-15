package com.pnt.ejercicio.supermercado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.pnt.ejercicio.productos.Bebida;
import com.pnt.ejercicio.productos.Fruta;
import com.pnt.ejercicio.productos.Shampoo;
import com.pnt.ejercicio.supermercado.Producto;
import com.pnt.ejercicio.supermercado.UnidadDeVenta;

public class Supermercado {
	private List<Producto> productos;
	
	public Supermercado() {
		productos = new ArrayList<>();
	}
	
	public void cargarProductos() {
		productos.add(new Bebida("Coca-Cola Zero", 20.0, 1.5));
		productos.add(new Bebida("Coca-Cola", 18.0, 1.5));
		productos.add(new Shampoo("Shampoo Sedal", 19.0, 500));
		productos.add(new Fruta("Frutillas", 64.0, UnidadDeVenta.kilo));
	}
	
	public void mostrarProductos() {
		for (Producto producto : productos) {
			System.out.println(producto);
		}
	}
	
	public void mostrarExtremos() {
		productos.sort(crearComparadorPorPrecio());
		Producto masCaro = productos.get(0);
		Producto masBarato = productos.get(productos.size()-1);
		System.out.println("Producto más caro: "+masCaro.getNombre());
		System.out.println("Producto más barato: "+masBarato.getNombre());
	}
	
	private Comparator<Producto> crearComparadorPorPrecio() {
		return new Comparator<Producto>() {
			
			@Override
			public int compare(Producto p1, Producto p2) {
				if (p1.getPrecio() > p2.getPrecio())
					return -1;
				if (p2.getPrecio() > p1.getPrecio())
					return 1;
				return 0;
			}
			
		};
	}
	
}