package visibilite_en_java;

public class Mere {

	 private  String nom;
	 int identifiant;
	 static String prenom ;
	 
	 
	public Mere() {}

	protected void affiche() {
		 System.out.println( " identiafiant = " + identifiant + "nom = " + nom);
	 }
	
	void afficheSimple() {
		affiche();
	}
	
	
	public static void afficheCompilque() {
		
		System.out.println( "prenom = " + prenom);
	}
	
	 	
}
