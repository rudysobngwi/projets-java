package visibilite_en_java;

import interfaces.Programmeur;

public class Fille extends Mere implements Programmeur{
	
	 private  String nom;
	 private int identifiant;
	 
	public void affiche() {
		 System.out.println("nom = " + nom + " identiafiant = " + identifiant);
	 }
	
	public boolean coderEnC() {
		if (nom != null && nom.equals("Anne Gaelle")) {
			return true;
		}
		return false;
	}
	public boolean coderEnCPlus() {
		return true;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
