import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class FenetreAjout extends JFrame implements ActionListener
{
	private JTextField nom;
	private JTextField prenom;
	private JTextField rue;
	private JTextField rue2;
	private JTextField ville;
	private JTextField CP;
	private JTextField tel;
	
	private JButton ajout;
	
	public FenetreAjout(String titre) 
	{
		super(titre);
		
		JLabel libN = new JLabel("Nom");
		libN.setForeground(new Color(0,150,0));
		nom = new JTextField(10);
		nom.setBackground(new Color(0,0,0));
		nom.setForeground(new Color(0,150,0));
		nom.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		JLabel libP = new JLabel("Prenom");
		libP.setForeground(new Color(0,150,0));
		prenom = new JTextField(10);
		prenom.setBackground(new Color(0,0,0));
		prenom.setForeground(new Color(0,150,0));
		prenom.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		//JLabel libA = new JLabel("Adresse");
		//adresse = new JTextField(40);
		JLabel libRue = new JLabel("N°");
		libRue.setForeground(new Color(0,150,0));
		rue = new JTextField(3);
		rue.setBackground(new Color(0,0,0));
		rue.setForeground(new Color(0,150,0));
		rue.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		JLabel libRue2 = new JLabel("Rue");
		libRue2.setForeground(new Color(0,150,0));
		rue2 = new JTextField(30);
		rue2.setBackground(new Color(0,0,0));
		rue2.setForeground(new Color(0,150,0));
		rue2.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		JLabel libVille = new JLabel("Ville");
		libVille.setForeground(new Color(0,150,0));
		ville = new JTextField(20);
		ville.setBackground(new Color(0,0,0));
		ville.setForeground(new Color(0,150,0));
		ville.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		JLabel libCP = new JLabel("Code postal");
		libCP.setForeground(new Color(0,150,0));
		CP = new JTextField(5);
		CP.setBackground(new Color(0,0,0));
		CP.setForeground(new Color(0,150,0));
		CP.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		
		JLabel libT = new JLabel("Tel");
		libT.setForeground(new Color(0,150,0));
		tel = new JTextField(10);
		tel.setBackground(new Color(0,0,0));
		tel.setForeground(new Color(0,150,0));
		tel.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		ajout = new JButton("Ajouter");
		ajout.setBackground(new Color(0,0,0));
		ajout.setForeground(new Color(0,150,0));
		ajout.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		ajout.addActionListener(this);

		
		Container p = this.getContentPane();
		
		p.setLayout(new GridLayout(6,1));
		
		JPanel g1 = new JPanel();
		g1.setBackground(new Color(0,0,0));
		
		JPanel g2 = new JPanel();
		g2.setBackground(new Color(0,0,0));
		
		JPanel g3 = new JPanel();
		g3.setBackground(new Color(0,0,0));
		
		JPanel g32 = new JPanel();
		g32.setBackground(new Color(0,0,0));
		
		JPanel g4 = new JPanel();
		g4.setBackground(new Color(0,0,0));
		
		JPanel g5 = new JPanel();
		g5.setBackground(new Color(0,0,0));
		
		g1.add(libN);
		g1.add(nom);
		
		g2.add(libP);
		g2.add(prenom);
		

		g3.add(libRue);
		g3.add(rue);
		
		g3.add(libRue2);
		g3.add(rue2);
		
		g32.add(libCP);
		g32.add(CP);
		
		g32.add(libVille);
		g32.add(ville);
		
		g4.add(libT);
		g4.add(tel);
		
		g5.add(ajout);
		
		p.add(g1);
		p.add(g2);
		p.add(g3);
		p.add(g32);
		p.add(g4);
		p.add(g5);
		
		setVisible(true);
		setResizable(false);
		pack();
	}
	
	public void actionPerformed(ActionEvent event)
	{

		
		if (event.getSource().equals(ajout))
		{
			
			try {
				String[] info = new String[7];
				info[0]=nom.getText();
				info[1]=prenom.getText();
				info[2]=rue.getText();
				info[3]=rue2.getText();
				info[4]=ville.getText();							
				info[5]=CP.getText();
				info[6]=tel.getText();
				
				Personne p = new Personne(info);				
				Fenetre.repertoire.ajouter(Passerelle.ajouter(p),p);
				setVisible(false);
			}
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}

		}
}
