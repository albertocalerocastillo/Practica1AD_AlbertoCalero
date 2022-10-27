package es.studium.practica1ad;

public class ArticuloAComprar {

	// Atributos
	private String descripcion;
	private int cantidad;
	private String unidad;

	// Constructores
	// Constructor vacío o por defecto
	public ArticuloAComprar() {
		descripcion = "";
		cantidad = 0;
		unidad = "";
	}
	
	// Constructor por parámetros
	public ArticuloAComprar(String descripcion, int cantidad, String unidad) {
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.unidad = unidad;
	}
	
	//Métodos getters y setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
}
