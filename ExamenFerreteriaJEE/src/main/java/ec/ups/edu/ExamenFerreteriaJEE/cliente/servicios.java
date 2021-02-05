package ec.ups.edu.ExamenFerreteriaJEE.cliente;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import ec.ups.edu.ExamenFerreteriaJEE.modelo.Detalle;
import ec.ups.edu.ExamenFerreteriaJEE.modelo.Producto;


public class servicios {

	private String proveedor1 = "http://localhost:8081/ExamenProveedor1JEE/rs/productos/productos";
	private String pedidosProveedor1 = "http://localhost:8081/ExamenProveedor1JEE/rs/productos/detalle";
	private String actualizarstock  = "http://localhost:8081/ExamenProveedor1JEE/rs/productos/actualizarStock";
	private String proveedor2 = "http://localhost:8081/ExamenProveedor2JEE/rs/productos/productos";
	private String pedidosProveedor2 = "http://localhost:8081/ExamenProveedor2JEE/rs/productos/detalle";	
	private String actualizarstock2  = "http://localhost:8081/ExamenProveedor1JEE/rs/productos/actualizarStock";		

			public List<Producto> listaProductos() {
				Client client = ClientBuilder.newClient();
				WebTarget target = client.target(proveedor1);

				List<Producto> pros = target.request().get(new GenericType<List<Producto>>() {});
				
				client.close();
				
				return pros;		
			}
	
	public String actualizarStock (Producto p) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(actualizarstock);
		String respuesta = target.request().post(Entity.json(p), String.class);
		return respuesta;
	}
	
	public String guardarpedido(Detalle d) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(pedidosProveedor1);
		String respuesta = target.request().post(Entity.json(d), String.class);
		return respuesta;
	}
	
	public List<Producto> listaProductos2() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(proveedor2);

		List<Producto> pros = target.request().get(new GenericType<List<Producto>>() {});
		
		client.close();
		
		return pros;		
	}

public String actualizarStock2 (Producto p) {
Client client = ClientBuilder.newClient();
WebTarget target = client.target(actualizarstock2);
String respuesta = target.request().post(Entity.json(p), String.class);
return respuesta;
}

public String guardarpedido2(Detalle d) {
Client client = ClientBuilder.newClient();
WebTarget target = client.target(pedidosProveedor2);
String respuesta = target.request().post(Entity.json(d), String.class);
return respuesta;
}
	
}
