package ec.ups.edu.ExamenFerreteriaJEE.modelo;
import java.io.Serializable;




public class Producto implements Serializable   {

	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nombre;
	private int stock;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


	

	
	
	
}
