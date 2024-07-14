package swing1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ToutDansMain {
	private JTextField nombre1Field, resultatField;
	private JButton ajouterButton;
	private JButton effacerButton;
	
	public ToutDansMain() {
		nombre1Field= new JTextField(10);
		resultatField= new JTextField(10);
		resultatField.setEditable(false); // pas modifiable.
		ajouterButton= new JButton("+");
		effacerButton= new JButton("effacer");
		effacerButton.addActionListener( (e) -> effacer(e) );
		mettreEnPage ();
	}
	public void mettreEnPage () {
		// On récupère le conteneur interne de la frame.
				JPanel panel = new JPanel();
				// On fixe son "layout" : une grille de 
				// 4 lignes et 1 colonnes.
				panel.setLayout(new GridLayout(4,1));
				panel.add(nombre1Field);
				panel.add(ajouterButton);
				panel.add(resultatField);
				panel.add(effacerButton);
				
				JFrame jFrame = new JFrame();
				jFrame.add(panel);// ajoute le panel à la frame.
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// On fixe la taille de la frame : 
				jFrame.pack();
				jFrame.setVisible(true);
				jFrame.setSize(500, 300);
				jFrame.show();
		}
	public void effacer(ActionEvent e) {
		System.out.println("Je vais effacer suite au click sur le bouton effacer " + e.toString());
		//this.getNombre1Field().setText("0");
		//this.getResultatField().setText("" + 0.0);
		//setSomme(0.0);
		nombre1Field.setText("0");
		resultatField.setText("0.0");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater ( new Runnable () {
			public  void run () {
			new ToutDansMain ();
			}
			});
		//  new ToutDansMain ();
	}

}
