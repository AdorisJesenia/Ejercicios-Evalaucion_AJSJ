/**
 * 
 */
package adorisJesenia.giti7083.animal;

import java.util.Scanner;


/**
 * @author Jessy
 *Clase para probar
 */
public class TestAnimal {
	public void Test(){
		Animal animal;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Elige uno : "+"\n 1 Elefante"+"\n 2 Leon"+"\n 3 Pato");
		int elegir= scanner.nextInt();
		
		
		switch (elegir) {
		case 1:
			animal= new Elefante();
			break;
		case 2:
			
			animal= new Leon();
			break;
        case 3:
			
			animal= new Pato();
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		new TestAnimal().Test();
	}

}


