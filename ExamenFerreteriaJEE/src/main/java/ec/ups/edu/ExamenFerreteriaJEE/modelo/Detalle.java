package ec.ups.edu.ExamenFerreteriaJEE.modelo;

import java.io.Serializable;



public class Detalle implements Serializable {

	
	private int codigo;
	private int cantidad;
	private Producto producto;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
