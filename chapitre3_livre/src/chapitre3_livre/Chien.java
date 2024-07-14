package chapitre3_livre;

public class Chien {
	String nom;
	public static void main(String[] args) {
		
		Chien chien1 = new Chien();
		chien1.aboyer();
		chien1.nom = "Rex";
		
		Chien[] mesChiens = new Chien[3];
		mesChiens[0] = new Chien ();
		mesChiens[1] = new Chien ();
		mesChiens[2] = chien1;
		
		mesChiens[0].nom = "Fido";
		mesChiens[1].nom = "Mirza";
		
		System.out.print("le dernier s'appelle ");
		System.out.println(mesChiens[2].nom);
		
		int x = 0;
		while(x < mesChiens.length) {
			mesChiens[x].aboyer();
			x =x + 1;
		}
	}
	public void aboyer () {
		System.out.println(nom + " dit Ouarf!");
	}
	public void manger() {
	}
	public void poursuivreChat() {
	}
}
