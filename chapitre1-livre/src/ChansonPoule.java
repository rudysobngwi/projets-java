
public class ChansonPoule {

	public static void main (String [] args) {
		int nbPoussins = 99;
		String mot = "poussins";
		
		while (nbPoussins > 0) {
			
			if (nbPoussins == 1) {
				mot = "poussins";
			}
			System.out.println("Ma poule n'a plus que " + nbPoussins + "" + mot);
			nbPoussins = nbPoussins - 1;
			
			if ( nbPoussins > 0) {
				System.out.println("Ma poule n'a plus que " + nbPoussins + "" + mot);
				System.out.println("Elle en avait 30");
				System.out.println("Elle en avait 30");
				System.out.println("Allongeins la jambe, la jambe car la route est longue");
				System.out.println("Allongeons la jambe, la jambe car la route est longue");
			}else {
				System.out.println("On est arrivé.");
			}
		}
		
	}
}
