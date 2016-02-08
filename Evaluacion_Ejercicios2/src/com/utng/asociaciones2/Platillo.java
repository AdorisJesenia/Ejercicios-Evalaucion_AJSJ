/**
 * 
 */
package com.utng.asociaciones2;

import java.util.List;

/**
 * @author Jessy
 *
 */
public class Platillo {
	//Atributos
	private int cantidad;
	private String tipo;
	
	//Relacion de Agregacion
		private List<Orden> ordenes;

		public Platillo(List<Orden>ordenes){
			this.ordenes= ordenes;
		}
		

}
