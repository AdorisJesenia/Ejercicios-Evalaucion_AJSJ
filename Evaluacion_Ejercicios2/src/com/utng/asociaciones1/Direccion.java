/**
 * 
 */
package com.utng.asociaciones1;

import java.util.List;



/**
 * @author Jessy
 *
 */
public class Direccion {
	//Atributos
	private String calle;
	private String numero;
	private String departamento;
	private String provincia;
	private int piso;
	private String CP;
	private String localidad;
	private String pais;

	
	//Relacion de agregacion
		private List<Proveedor> proveedores;

		public Direccion(List<Proveedor>proveedores){
			this.proveedores = proveedores;
		}
}
