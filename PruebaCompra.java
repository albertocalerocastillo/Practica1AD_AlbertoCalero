package es.studium.practica1ad;

public class PruebaCompra {

	public static void main(String[] args) {
		ArticuloAComprar articulo1 = new ArticuloAComprar("Arroz", 5, "Kilogramos");
		ArticuloAComprar articulo2 = new ArticuloAComprar("Leche", 3, "Litros");
		ArticuloAComprar articulo3 = new ArticuloAComprar("Agua", 10, "Litros");
		ListaDeLaCompra lista = new ListaDeLaCompra("Carrefour");
		lista.agregarProductoAComprar(articulo1);
		lista.agregarProductoAComprar(articulo2);
		lista.agregarProductoAComprar(articulo3);
		lista.eliminarArticulo("Arroz");
		for(ArticuloAComprar articulo:lista.getArticulos())
		{
			System.out.println(articulo.getDescripcion() + "-" + articulo.getCantidad() + "-" + articulo.getUnidad());
		}
	}

}
