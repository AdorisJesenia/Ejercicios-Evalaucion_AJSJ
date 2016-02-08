/*
 * 
 */
package com.utng.ayc;


import java.util.List;



/**
 * @author Jessy
 *
 */
public class  Coche  {
	private String conductor;
	
	//Relacion de asociacion
	private Persona persona;
	
	//Comportamientos
	private void encender(){
		
	}
	private void apagar(){
		
	}
	private void acelerar(){
		
	}
private void frenar(){
		
	}
	
	
	//Relacion de agregacion
		private List<Motor> motor;

		public Coche(List<Motor>motor){
			this.motor= motor;
		}
	

}
