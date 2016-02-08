/**
 * 
 */
package adorisJesenia.giti7083.proyecto;

import java.util.Date;

/**
 * @author Jessy
 *Implementa la clase ConsultarEstado
 */
public class Presupuesto implements ConsultarEstado{
	//Constructor de la clase
	public Presupuesto(){
		System.out.println("El presupuesto aproximado del proyecto es de 20000");
	}
	/**
	 * Atributos
	 */
		
		private Date fechaInicio;
		private Date fechaFin;
		private String planificacion;
		private String descripcion;
		private String nombre;
		/**
		 * Relacion de asociacion
		 */
		
		private Cliente cliente;
		
}
