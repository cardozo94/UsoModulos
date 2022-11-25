package co.camcar.uso.modulos;

import co.camcar.producto.Producto;

public class UsoProductos {

	public static void main(String[] args) {
		
		Producto producto = new Producto();
		producto.setPrecio(15000);
		
		System.out.println(producto.getDescuento());

	}

}
