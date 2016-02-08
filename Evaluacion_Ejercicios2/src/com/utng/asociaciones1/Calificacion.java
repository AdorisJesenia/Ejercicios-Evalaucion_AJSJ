/**
 * 
 */
package com.utng.asociaciones1;

import java.util.List;

/**
 * @author Jessy
 *
 */
public class Calificacion {
	//Atributos
	private int cal_Id;
	private String cal_Descripcion;
	
	//Relacion de agregacion
			private List<ProveedorCalificado> proveedoresCal;

			public Calificacion(List<ProveedorCalificado>proveedoresCal){
				this.proveedoresCal = proveedoresCal;
			}

}
