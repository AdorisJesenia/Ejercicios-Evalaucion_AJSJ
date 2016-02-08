/**
 * 
 */
package giti7083.AdorisJesenia.Animal;

/**
 * @author Jessy
 *
 */
public class Animal implements InterfaceAnimal{
	//Atributos

	private String nombre;
	
	//TODO Auto-generated constructor stub
	
	public static void tipoAnimal(){
		
	}
	//Getters y Setters
	/**
	 * 
	 * @return nombre get
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre de nombre set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @Override
	 */
	
	public void comunicarse(){
		System.out.println("Me estoy comunicando");
	}
	 


}
