package swing1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.time.Duration;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CreateurUtilisateur {
	private JTextField identifiantField = new JTextField(10);
	private JTextField motDePasseField1 = new JTextField(10);
	private JTextField motDePasseField2 = new JTextField(10);
	Label identifiant = new Label("Identifiant");
	Label repeter = new Label("Repeter mot de passe");
	Label labelMotDePasse = new Label("mot de passe");
	JButton bouton = new JButton("Enregistrer");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	
	public CreateurUtilisateur() {
		mettreEnPage();
		activer();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(800, 300);
		frame.setVisible(true);
		
	}
	
	private void mettreEnPage() {
		panel.setLayout(new GridLayout(4,2));
		panel.add(identifiant);
		panel.add(identifiantField);
		panel.add(labelMotDePasse);
		panel.add(motDePasseField1);
		panel.add(repeter);
		panel.add(motDePasseField2);
		panel.add(new Label());
		panel.add(bouton);
		frame.add(panel);
		
		bouton.setEnabled(false);
		bouton.addActionListener(e -> sauverUtilisatuer());
		motDePasseField1.addActionListener( e ->{
			//motDePasse1 = motDePasseField1.getText();
			activer();
			
		});
		motDePasseField2.addActionListener( e ->{
			//motDePasse1 = motDePasseField2.getText();
			activer();
		});
		
	}
	private void activer()  {
		
	
		SwingUtilities.invokeLater ( new Runnable () {
			public  void run () {
				
				if (!motDePasseField1.getText().equals( "" ) &&  motDePasseField1.getText().equals(motDePasseField2.getText())) {
					bouton.setEnabled(true);
					bouton.setBackground(Color.BLACK);
					
				}
			}
		});
	}

	
	
	public static void main(String[] args) {
		new CreateurUtilisateur();
	}

	private void sauverUtilisatuer() {
		System.out.println("Ona clique sur le bouton...");
	}
}
