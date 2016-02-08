/**
 * 
 */
package com.utng.asociaciones1;

import java.util.List;

/**
 * @author Jessy
 *
 */
public class Rubro {
	//Atributos
	private int rb_Id;
	private String rb_Descripcion;

	//Relacion de agregacion
			private List<Proveedor> proveedores;
			private List<Articulo> articulos;

			public Rubro(List<Proveedor>proveedores ){
				this.proveedores = proveedores;
				this.articulos = articulos;
			}
		
			

			
}
