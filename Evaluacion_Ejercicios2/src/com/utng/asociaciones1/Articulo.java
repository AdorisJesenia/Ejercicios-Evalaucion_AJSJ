/**
 * 
 */
package com.utng.asociaciones1;

import java.util.List;

/**
 * @author Jessy
 *
 */
public class Articulo {
	//Atributos
	private int art_Id;
	private String descripcion;
	private int estado;
	private int cantidad;
	private double cantidadCritica;
	private double cantidadMinima;
	
	//Relacion de asociacion
	
	private Precios precios;
	
	//Relacion de agregacion
	private List<Pedido> pedidos;

	public Articulo(List<Pedido>pedidos){
		this.pedidos = pedidos;
	}
}
