package io1.exercice2;

import java.io.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;

import static org.junit.Assert.*;

public class Question1Test {
	
	 static int uneFois = 100;
	
	@BeforeClass
	public static  void avantTouteMethode() {
		System.out.println("Executer en premier, une seule fois. ===" + uneFois );
	}
	@Before
	public void init() {
		System.out.println("Avant Chaque test");
	}
	@Test
	public void testSimple() {
		System.out.println("testSimple seule fois. ===" + uneFois );
		tester(12, "12");
	}
	
	@Test
	public void testDeuxNombres() {
		tester(46, "12fdsf az 34a");
	}

	@Test
	public void testDeuxNombresFin() {
		tester(46, "12fdsf az 34");
	}

	@Test
	public void testDeuxNombresPasDebut() {
		tester(46, "aad12fdsf az 34");
	}

	@Test
	//@Ignore
	public void testChiffresAraboIndiens() {
		// Ce test fonctionne si la procédure 
		// utilise Character.isDigit et Character.getNumericValue
		tester(123, "123");
	}
	
	private void tester(int somme, String txt)  {
		try {
		StringReader r= new StringReader(txt);
		int val= Question1.sommeEntiers(r);
		assertEquals( somme, val);
		assertFalse(true);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
