/**
 * 
 */
package com.utng.asociaciones2;

import java.util.List;



/**
 * @author Jessy
 *
 */
public class Bebida {
	//Declarar Atributos
	private int cantidad;
	private String tipo;
	
	//Relacion de agregacion
	private List<Orden> ordenes;

	public Bebida(List<Orden>ordenes){
		this.ordenes= ordenes;
	}
	

}
