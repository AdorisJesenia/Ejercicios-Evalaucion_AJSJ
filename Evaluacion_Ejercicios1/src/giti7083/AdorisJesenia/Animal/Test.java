/**
 * 
 */
package giti7083.AdorisJesenia.Animal;

/**
 * @author Jessy
 *Clase test para probar 
 */
public class Test {
	private Gato gato;
	private Perro perro;
	
	public static void main (String []args){
		Test test= new Test();
		test.gato =new Gato();
		test.perro = new Perro();
		
		test.gato.setNombre("Rod");
		test.gato.comunicarse();
		System.out.println("El nombre del gato es "+ test.gato.getNombre());
		
		
		test.perro.setNombre("Boby");
		test.perro.comunicarse();
		System.out.println("El nombre del perro es "+ test.perro.getNombre());
	}

}
