/**
 * 
 */
package uo.mp2021.util.check;

/**
 * @author Raquel
 *
 */
public class IndexCheck {
	/**
	 * Comprueba si la condici�n es correcta. Si no lo es, lanza una excepci�n
	 * de tipo IndexOutOfBoundsException en la que se env�a el mensaje del 
	 * par�metro
	 * 
	 * @param condition
	 * @param msg
	 */
	public static void isTrue(boolean condition, String msg) {
		if (!condition) {
			throw new IndexOutOfBoundsException(msg);
		}
	}
	
	/**
	 * Comprueba si la condici�n es correcta. Si no lo es, lanza una excepci�n
	 * de tipo IndexOutOfBoundsException
	 * @param condition
	 */
	public static void isTrue(boolean condition) {
		if (!condition) {
			throw new IndexOutOfBoundsException();
		}
	}
}
