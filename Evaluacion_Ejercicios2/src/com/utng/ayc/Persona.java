/**
 * 
 */
package com.utng.ayc;

import java.util.ArrayList;
import java.util.List;



/**
 * @author Jessy
 *
 */
public class Persona {
	private String nombre;
	//Relacion de asociacion
	private Coche coche;
	
	///Relacion de composicion 
	private List<Corazon> corazon;
	public Persona(){
		this.corazon = new ArrayList<Corazon>();
		
	}
	

}
