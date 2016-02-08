/**
 * 
 */
package adorisJesenia.giti7083.interfaceFigura;

/**
 * @author Jessy
 *
 */
public class Cuadrado implements Figura{
	//Constructor de la clase
	public Cuadrado(){
		System.out.println("Cuadrado");
		
		
	}
	//Atributo
String nombre1="cubo";
	
	//Getters y Setters
/**
 * 
 * @return nombre get
 */
	public String getNombre1() {
		return nombre1;
	}
/**
 * 
 * @param nombre1 set
 */
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	/**
	 * Metodo implementado por la interface figura
	 */
	public void figura(){
		System.out.println("Soy una figura");
	}

}
