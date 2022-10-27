package es.studium.practica1ad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaDeLaCompra {
	// Atributos
	private String nombreLista;

	List<ArticuloAComprar> lista = new ArrayList<ArticuloAComprar>();

	// Constructores
	// Constructor vacío por defecto
	public ListaDeLaCompra() {
		nombreLista = "";

	}

	public ListaDeLaCompra(String nombreLista) {
		this.nombreLista = nombreLista;

	}

	public String getNombreLista() {
		return nombreLista;
	}

	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}

	public void agregarProductoAComprar(ArticuloAComprar articulo) {

		lista.add(articulo);

		try {
			FileWriter fr = new FileWriter(nombreLista + ".txt", true);
			BufferedWriter bf = new  BufferedWriter(fr);

			bf.write(articulo.getDescripcion() + " - " + articulo.getCantidad() + " - " + articulo.getUnidad() + "\n");
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void eliminarArticulo (String descripcionArticulo) 
	{
		for (int i = 0; i< lista.size();++i) 
		{
			if(descripcionArticulo == lista.get(i).getDescripcion())
			{
				lista.remove(i);
			}
		}

		try 
		{
			FileWriter fr = new FileWriter(nombreLista + ".txt", false);
			BufferedWriter bf = new  BufferedWriter(fr);

			for(ArticuloAComprar articulo:lista)
			{
				bf.write(articulo.getDescripcion() + " - " + articulo.getCantidad() + " - " + articulo.getUnidad() + "\n");
			}

			bf.close();
			fr.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public List<ArticuloAComprar> getArticulos()
	{
		return lista;
	}
}
