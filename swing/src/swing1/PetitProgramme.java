package swing1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PetitProgramme  extends JFrame{
	private JTextField nombre1Field, resultatField;
	private JButton ajouterButton;
	private JButton effacerButton;
	private double somme = 0.0;
	JFrame frame = new JFrame("xx");
	
	public PetitProgramme() {
		nombre1Field= new JTextField(10);
		nombre1Field.addActionListener( e -> {
			System.out.println(e);
		String text	= nombre1Field.getText();
		if ( text.length() <= 8) {
			nombre1Field.setForeground(Color.RED);
		}
		else {
			nombre1Field.setForeground(Color.GREEN);
		}
			
		});
		resultatField= new JTextField(10);
		resultatField.setEditable(false); // pas modifiable.
		ajouterButton= new JButton("+");
		effacerButton= new JButton("effacer");
		effacerButton.addActionListener( (e) -> effacer(e) );
		mettreEnPage();
		}
	private void mettreEnPage() {
		
		
		// On fixe la taille de la frame : 
		
		
		// On récupère le conteneur interne de la frame.
		JPanel panel = new JPanel();
		// On fixe son "layout" : une grille de 
		// 4 lignes et 1 colonnes.
		panel.setLayout(new GridLayout(4,1));
		panel.add(nombre1Field);
		panel.add(ajouterButton);
		panel.add(resultatField);
		panel.add(effacerButton);
		this.add(panel);// ajoute le panel à la frame.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// On fixe la taille de la frame : 
		this.pack();
		this.setVisible(true);
		this.setSize(500, 300);
		this.show();
		}
	
		public void effacer(ActionEvent e) {
			System.out.println("Je vais effacer suite au click sur le bouton effacer " + e.toString());
			//this.getNombre1Field().setText("0");
			//this.getResultatField().setText("" + 0.0);
			//setSomme(0.0);
			nombre1Field.setText("0");
			resultatField.setText("0.0");
		}
		
		void setSomme(double somme) {
			this.somme = somme;
			this.getResultatField().setText("" + somme);
			}
		
		
	public JTextField getNombre1Field() {
			return nombre1Field;
		}
	
	public JTextField getResultatField() {
		return resultatField;
	}
	public static void main(String[] args) {
/*
		// Nous utilisons le main, ce qui n'est pas du tout recommandé.
// La fenêtre extérieure
		JFrame frame = new JFrame("Jolie fenêtre");
// On ajoute un composant graphique dans la fenêtre:
		JTextField textField = new JTextField("Salut, vous pouvez me modifier");
		frame.add(textField);
// On demande à la fenêtre de calculer sa taille au plus juste
		frame.pack();
// On la rend visible
		frame.setVisible(true);
// On dit que le programme doit se terminer quand la fenêtre se ferme
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		
		/*PetitProgramme petitProgramme = new PetitProgramme();
		JTextField textField = new JTextField("Salut, vous pouvez me modifier");
		petitProgramme.add(textField);
		petitProgramme.pack();
		petitProgramme.setVisible(true);
		petitProgramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		petitProgramme.show();*/
		new PetitProgramme();
		
		
	}
	
	
	
	
	
}

/*
class EffacerActionListener implements ActionListener {
	private final PetitProgramme calculetteApplication;

	EffacerActionListener(PetitProgramme calculetteApplication) {
		this.calculetteApplication = calculetteApplication;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
            calculetteApplication.effacer();
	}
}*/
