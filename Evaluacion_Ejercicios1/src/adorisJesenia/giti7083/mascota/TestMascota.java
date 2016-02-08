/**
 * 
 */
package adorisJesenia.giti7083.mascota;

import java.util.Scanner;


/**
 * @author Jessy
 *
 */
public class TestMascota {
	public void Test(){
		Animal animal;
		Mascota mascota;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Elige uno : "+"\n 1 Gato"+"\n 2 Leon"+"\n 3 Perro");
		int elegir= scanner.nextInt();
		
		
		switch (elegir) {
		case 1:
			mascota= new Gato();
			break;
		case 2:
			
			animal= new Leon();
			break;
		case 3:
			mascota= new Perro();
			break;
		

		default:
			break;
		}
	}

	public static void main(String[] args) {
		new TestMascota().Test();
	}

}
