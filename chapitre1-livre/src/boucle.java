
public class boucle {

	public static void main (String args[]) {
		int x = 1;
		System.out.println("Avant la boucle");
		while (x < 4) {
			System.out.println("Dans la boucle");
			System.out.println("La valeur de x est " + x);
			x = x + 1;
		}
		System.out.println("Après la boucle");
	}
}
