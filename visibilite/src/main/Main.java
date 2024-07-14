package main;

import visibilite_en_java.Fille;
import visibilite_en_java.Mere;

public class Main {
	
	 public static void main(String [] args) {
		 System.out.println("main de Mere");
		 Mere mere = new Mere();
		// System.out.println(mere.nom);
		// mere.afficheSimple();
		 Mere.afficheCompilque();
		 
		 Fille anneGaelle = new Fille();
		 boolean coder = anneGaelle.coderEnC();
		 System.out.println(coder);
		 anneGaelle.setNom("Anne Gaelle");
		 coder = anneGaelle.coderEnC();
		 System.out.println(coder);

	 }
	 
	 void x() {
		 Mere.afficheCompilque();
	 }


}
