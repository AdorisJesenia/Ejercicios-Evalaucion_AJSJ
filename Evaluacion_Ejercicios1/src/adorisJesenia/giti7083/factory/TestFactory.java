/**
 * 
 */
package adorisJesenia.giti7083.factory;

import java.util.Scanner;

/**
 * @author Jessy
 *Clase para probar
 */
public class TestFactory {
	public void Test(){
		ProductoA productoA;
		ProductoB productoB;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Selecciona un producto: "+"\n 1 ProdcutoA1"+"\n 2 ProductoA2"+"\n 3 ProductoB1"+"\n 4 ProductoB2");
		int elegir= scanner.nextInt();
		
		
		switch (elegir) {
		case 1:
			productoA= new ProductoA1();
			break;
		case 2:
			
			productoA= new ProductoA2();
			break;
		case 3:
			productoB= new ProductoB1();
			break;
		case 4:
			
			productoB= new ProductoB2();
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		new TestFactory().Test();
	}

}
