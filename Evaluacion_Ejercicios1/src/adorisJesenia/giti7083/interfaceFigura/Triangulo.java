/**
 * 
 */
package adorisJesenia.giti7083.interfaceFigura;

/**
 * @author Jessy
 *Implementa la clase figura relacion de Realizacion
 */
public class Triangulo implements Figura{
	/**
	 * Constructor de la clase
	 */
	
	public Triangulo(){
		System.out.println("Triangulo");
		
	}
	//Atributo
String nombre2="piramide";
	
	
//Getter y Setter
/**
 * 
 * @return
 */
	public String getNombre2() {
		return nombre2;
	}
/**
 * 
 * @param nombre2
 */
	public void setNombre(String nombre2) {
		this.nombre2 = nombre2;
	}
	/**
	 * Metodo de la interface figura
	 */
	public void figura(){
		System.out.println("Soy una figura");
	}

}
