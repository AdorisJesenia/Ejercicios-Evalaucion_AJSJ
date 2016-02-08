/**
 * 
 */
package adorisJesenia.giti7083.canino;

import java.util.Scanner;


/**
 * @author Jessy
 *Clase para probar
 */
public class TestCanino {
	public void Test(){
		Animal animal;
		Perro perro;
		Scanner scanner= new Scanner(System.in);
		new Perro().sacarPaseo();
		new Perro().comer();
		
	
	}
	
	public static void main(String[] args) {
		new TestCanino().Test();
	}
}
