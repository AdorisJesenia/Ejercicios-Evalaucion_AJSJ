/**
 * 
 */
package adorisJesenia.giti7083.interfaceFigura;

/**
 * @author Jessy
 *
 */

public class Circulo implements Figura{
	//Atributo
	String nombre="Pelota";
	/**
	 * Constructor de la clase
	 */
	public Circulo(){
		System.out.println("Circulo");
		
	}
	/**
	 * 
	 * @return
	 */

	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo implementado en la clase figura
	 */
	public void figura(){
		System.out.println("Soy una figura");
	}

}
