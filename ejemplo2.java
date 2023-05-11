/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class ejemplo2
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello my name is Ruben Marin Silva");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}
