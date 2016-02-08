/**
 * 
 */
package adorisJesenia.giti7083.proyecto;

import java.util.Date;

/**
 * @author Jessy
 *
 */
public class Proyecto {
	//Constructor de la clase
	public Proyecto(){
		System.out.println("Proyecto nuevo");
	}

	/**
	 * Atributos
	 */
		
		private Date fecha;
		private String descripcion;
		private double importe;
		private String estado;
		/**
		 * Relacion de asociacion
		 */
		private Cliente cliente;
		private Maquina maquina;
	
}
