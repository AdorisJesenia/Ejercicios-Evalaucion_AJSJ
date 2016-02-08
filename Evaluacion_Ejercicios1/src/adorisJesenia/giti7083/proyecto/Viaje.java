/**
 * 
 */
package adorisJesenia.giti7083.proyecto;

import java.util.Date;

/**
 * @author Jessy
 *
 */
public class Viaje {
	/**
	 * Atributos
	 */
 private int limite;
 private boolean transporte;
 private String motivo;
 private Date fechaIda;
 private Date fechaVuelta;
 
 
 /**
  * Relacion asociacion
  */
 private Presupuesto presupuesto;
 private Gasto gasto;
 private Comercial comercial[];
 

}
