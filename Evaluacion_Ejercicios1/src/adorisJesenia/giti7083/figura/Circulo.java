/**
 * 
 */
package adorisJesenia.giti7083.figura;

/**
 * @author Jessy
 *Relacion de herencia con la clase Figura
 */
public class Circulo extends Figura{
	//Constructor de la clase
		public Circulo(){
			System.out.println("Me llamo circulo");
		}
	//Atributos
	private int radio;
	
	////Comportamiento que hereda
	public void area(){
		super.area();
	}

}
