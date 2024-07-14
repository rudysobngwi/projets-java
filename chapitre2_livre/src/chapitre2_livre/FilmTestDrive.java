package chapitre2_livre;

public class FilmTestDrive {
	public static void main (String [] args) {
		Film un = new Film();
		un.titre = "Autant en apporte la bourse";
		un.genre = "Tragique";
		un.classement = -2;
		Film deux = new Film();
		deux.titre = "Perdus dans un box";
		deux.genre = "Comique";
		deux.classement = 5;
		Film trois = new Film();
		trois.titre = "le club des octets";
		trois.genre = "Tragique mais edifiant";
		trois.classement = 127;
	}

}
