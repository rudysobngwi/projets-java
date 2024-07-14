package io1.exercice2;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

public class Question1 {

	public static int sommeEntiers(StringReader r) throws IOException{
		String result = "";
		int carLu =  r.read();
		
		//System.out.println("Premier Caractere Lu en int :" + carLu);
		Character c = (char) carLu;
		
		
		//System.out.println("Premier Caractere Lu en char  :" + c);
		while ( carLu != -1) {
			if ( c.isDigit(c) || c.isSpace(c)) {
			result  += c + "";
			}
			carLu =  r.read();
		//	System.out.println("Prochain Caractere Lu en int :" + carLu);
			c = (char) carLu;
		//	System.out.println("Prochain  Caractere Lu en char  :" + c);
			
		}
	//	System.out.println("Result = " + result);
		String[] resCou  = result.split("\\s+");
		//System.out.println("resCou =" + Arrays.toString(resCou));
		int somme = 0;
		for (String string : resCou) {
		//	System.out.println(string);
			//if ( !string.equals(" ")) {
				somme += Integer.parseInt(string);
			//}
		}
		//System.out.println("somme = " + somme);
		r.close();
		return somme;
	}

}
