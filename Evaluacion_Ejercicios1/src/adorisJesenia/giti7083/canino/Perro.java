/**
 * 
 */
package adorisJesenia.giti7083.canino;

/**
 * @author Jessy
 *Relacion de Herencia de clase Canino
 */
public class Perro extends Canino{
	//Cosntructor
	public Perro(){
		System.out.println("Perro ");
	}
	
	/**
	 * Comportamientos propios
	 */
public void sacarPaseo(){
	System.out.println("Pasea por el parque");
	
}
public void vacunar(){
	
}

/**
 * Comportamientos Clase Padre
 */

public void comer() {
	// TODO Auto-generated method stub
	 super.comer();
	 System.out.println("Come croquetas");
}
   public void hacerRuido() {
		// TODO Auto-generated method stub
		super.hacerRuido();
	}
}
