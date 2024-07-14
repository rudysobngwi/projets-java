package io1.exercice2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Tp2 {

	static boolean isValidArgument(StreamTokenizer s, Map<String,Double> vars) {
		return (s.ttype != StreamTokenizer.TT_EOF) &&
				(s.ttype == StreamTokenizer.TT_NUMBER
				|| s.ttype == StreamTokenizer.TT_WORD && vars.containsKey(s.sval));
	}
	
	public static void main(String[] args) throws IOException {
		double total = 0.0;
		System.out.println("tt_eof=" + StreamTokenizer.TT_WORD);
		boolean lookAhead = false; // si vrai alors il y a un nextToken non interprété
		Map<String,Double> vars = new HashMap<String,Double>();
		StreamTokenizer s = new StreamTokenizer(new InputStreamReader(System.in));
		//int ret = s.nextToken();
		//System.out.println("ret = " + ret );
		System.out.println((s.ttype ));
		System.out.println(StreamTokenizer.TT_EOF);
		while (s.ttype != StreamTokenizer.TT_EOF) {
			switch (s.ttype) {
			case StreamTokenizer.TT_NUMBER:
				throw new IOException("Mauvais format: nombre inattendu ici");
			case StreamTokenizer.TT_WORD:
				if (s.sval.equals("SET")) {
					s.nextToken();
					if (s.ttype == StreamTokenizer.TT_WORD) {
						vars.put(s.sval, total);
					} else {
						throw new IOException("Mauvais format: nom de variable attenude ici.");
					}
				} else if (s.sval.equals("PRINT")) {
					System.out.println("" + total);
				} else if (s.sval.equals("CLEAR")) {
					total = 0;
				} else if (s.sval.equals("ADD")) {
					s.nextToken();
					while (isValidArgument(s, vars)) {
						if (s.ttype == StreamTokenizer.TT_NUMBER) {
							total += s.nval;
						} else if (s.ttype == StreamTokenizer.TT_WORD && vars.containsKey(s.sval)) {
							total += vars.get(s.sval);
						} else {
							throw new IOException(
									"Mauvais format: nombre ou variable attendu ici " + "mais j'ai rencontré: " + s);
						}
						s.nextToken();
					}
					lookAhead = true;
				} else if (s.sval.equals("MULT")) {
					s.nextToken();			
					if (s.ttype == StreamTokenizer.TT_NUMBER) {
						total *= s.nval;
					} else if (s.ttype == StreamTokenizer.TT_WORD
							&& vars.containsKey(s.sval)) {
						total *= vars.get(s.sval);
					} else { throw new IOException("Mauvais format: nombre ou variable attendu ici"
							+ "mais j'ai rencontré: "+s);}
				} else { throw new IOException("Mauvaise commande: " + s); }
				break;
			default:
				System.exit(0);
				throw new IOException("Mauvaise commande: " + s);
			}
			if (!lookAhead) { s.nextToken(); } else { lookAhead = false; }
		}
	}

		public static void main1(String[] args) throws IOException {
			// Encode les 3 états
			// invariant dansAdd et dansMult pas simultanément vrais)
			boolean dansAdd = false ,dansMult = false;
			double total = 0.0;
			StreamTokenizer s = new StreamTokenizer(new InputStreamReader(System.in));
			s.nextToken();
			while (s.ttype != StreamTokenizer.TT_EOF) {
				switch (s.ttype) {
				case StreamTokenizer.TT_NUMBER:
					if (dansAdd) { total += s.nval; dansAdd = false; }
					else if (dansMult) { total *= s.nval; dansMult = false; }
					else { throw new IOException("Mauvais format: j'attendais un nombre"); }
					break;
				case StreamTokenizer.TT_WORD:
					if (dansAdd || dansMult) { throw new IOException("Mauvais format!"); }
					if (s.sval.equals("PRINT")) {
						System.out.println("" + total);
					} else if (s.sval.equals("CLEAR")) {
						total = 0;
					} else if (s.sval.equals("ADD")) {
						dansAdd = true;
					} else if (s.sval.equals("MULT")) {
						dansMult = true;
					} else { throw new IOException("Mauvaise commande: " + s); }
					break;
				default:
					throw new IOException("Mauvaise commande: " + s);
				}
				s.nextToken();
			}

	}

}

