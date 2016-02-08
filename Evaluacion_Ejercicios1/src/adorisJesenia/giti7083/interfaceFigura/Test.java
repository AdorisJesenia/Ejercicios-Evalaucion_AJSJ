/**
 * 
 */
package adorisJesenia.giti7083.interfaceFigura;

/**
 * @author Jessy
 *Clase test para probar 
 */
public class Test {
	
	
	public static void main (String []args){
		Triangulo t = new Triangulo();
		t.figura();
		String nombre2= t.getNombre2();
		System.out.println("Soy como una" + nombre2);
		
		Circulo c =new Circulo();
		c.figura();
		String nombre= c.getNombre();
		System.out.println("Soy como una" + nombre);
		
		Cuadrado cu= new Cuadrado();
		c.figura();
		String nombre1= cu.getNombre1();
		System.out.println("Soy como un" + nombre1);
		
		
		
	}

}
