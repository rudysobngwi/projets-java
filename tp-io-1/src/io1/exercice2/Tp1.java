package io1.exercice2;

import java.util.ArrayList;
/*import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;*/
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.text.*;

public class Tp1 {

	static void affiche(Reader r) throws IOException {
    	int i = r.read();
    	
    	while(i != -1) {
    		System.out.print((char)i);
    		i = r.read();
    	}
    }
    
	static void copie(Reader r, Writer w) throws IOException {
    	int i = r.read();
    	while(i != -1) {
    		Character tmp = (char)i;
    		tmp = tmp.toUpperCase(tmp);
    		//w.write((char)i);
    		w.write(tmp);
    		i = r.read();
    	}
    }
    
    public static void main(String args[]) throws IOException {
    	Reader rd = new FileReader("toto.txt");
    	Writer wr = new FileWriter("titi.txt");
		copie(rd,wr);
		rd.close();
		wr.close();
		rd = new FileReader("titi.txt");
		//affiche(rd);
		rd.close();
		
		FileInputStream fileInputStream = new FileInputStream("toto.txt");
		boolean ajouter = true;
		FileOutputStream fileOutputStream = new FileOutputStream("tutu.txt" , ajouter);
		int i = fileInputStream.read();
		System.out.println();
		String tousLesChars = "";
    	while(i != -1) {
    		Character tmp = (char)i;
    		tmp = tmp.toLowerCase(tmp);
    		//System.out.print(tmp);
    		tousLesChars += tmp;
    		fileOutputStream.write(i);
    		
    		i = fileInputStream.read();
    	}
    	fileOutputStream.write('\n');
    	fileInputStream.close();
    	fileOutputStream.close();
    	
    	/*File homedir= new File("C:\\Users\\X\\OneDrive\\Bureau\\cours cnam java\\tp-io-1\\src\\io1\\exercice2");
    
    	File f= new File(homedir, "MonProg.java");
    	boolean leFichierATileteCree =f.createNewFile();
    	System.out.println();
    	System.out.println(leFichierATileteCree);
    	System.out.println("Taille du fichier en octet " + f.length());
    	System.out.println("Le fichier est  il executable " + f.canExecute());
    	System.out.println(Arrays.toString(homedir.list()));
    	
    	DecimalFormat format= new DecimalFormat("10000.99");
    	double x= 1.0/3;
    	String s= format.format(x);
    	System.out.println("s = " + s);
    	//System.out.println(System.getProperties());*/
    	System.out.println("-------------------------------");
    	System.out.println(tousLesChars);
    	String[] toutesLesLignes = tousLesChars.split("\\R"); // je separe les lignes 
    	System.out.println("-------------------------------");
    	//System.out.println(Arrays.toString(toutesLesLignes));
    	List<Lien> liens = new ArrayList<>();
    	for (String lien : toutesLesLignes) {
			//System.out.println(lien);
    		String car6_8 = "" + lien.charAt(5) + lien.charAt(6) + lien.charAt(7) + "";
    		System.out.println("__> " + car6_8);
			String[] nomUrl = lien.split("="); // je separe avec =
			System.out.println("nom ===" + nomUrl[0] + "  url = " + nomUrl[1] );
			nomUrl[1] = nomUrl[1].replace("]", "");
			liens.add(new Lien(nomUrl[0], nomUrl[1]));
		
		}
    	System.out.println(liens);
    	//Reader rd1 = new FileReader("liens.txt");
    	

    	    
    
    	
    	
    	
	}
}

class Lien {
	private String label, url;
	public Lien(String label, String url) {
		this.label = label;
		this.url = url;
	}
	public String getLabel() {
		return label;
	}
	public String getUrl() {
		return url;
	}
	@Override
	public String toString() {
		return "Lien <label=" + label + ", url=" + url + ">";
	}
	
	
}
