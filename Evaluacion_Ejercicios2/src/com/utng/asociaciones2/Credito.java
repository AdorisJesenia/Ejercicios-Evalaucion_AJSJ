/**
 * 
 */
package com.utng.asociaciones2;

import java.util.Date;

/**
 * @author Jessy
 *Relacion de Generalizacion(herencia) con la clase Pago
 */
public class Credito extends Pago{
	//Atributos
	private int numTCredito;
	private String tipo;
	private Date fechadeExp;
	private String nombre;
	
	//Metodo de la clase
	public boolean hacerCargo() {
		return false;
	}
		
	

}
