import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.SQLException;


//test onglets
public class Fenetre extends JFrame implements ActionListener
{
	
	private JTextField nom;
	private JTextField prenom;
	private JTextField rue;
	private JTextField rue2;
	private JTextField ville;
	private JTextField CP;
		
	private JTextField tel;
	
	
	private JTextField nomA;
	private JTextField prenomA;
	private JTextField rueA;
	private JTextField rue2A;
	private JTextField villeA;
	private JTextField CPA;
		
	private JTextField telA;
	
	public static final Repertoire repertoire = Passerelle.initRepertoire();

	private JButton ajout;
	private JButton precedent;
	private JButton suivant;
	private JButton quitter;
	private JButton supprimer;	
	private JButton modifier;
	private JButton dernier;	
	private JButton premier;
	
	
	private int index=-1;
	
	public Fenetre(String titre, int larg, int hau) throws IOException, SQLException, ClassNotFoundException
	{
		super(titre);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		setSize(larg,hau);
		
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
		
		JLabel libNA = new JLabel("Nom");
		libNA.setForeground(new Color(0,150,0));
		nomA = new JTextField(10);
		nomA.setBackground(new Color(0,0,0));
		nomA.setForeground(new Color(0,150,0));
		nomA.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
	
		
		JLabel libPA = new JLabel("Prenom");
		libPA.setForeground(new Color(0,150,0));
		prenomA = new JTextField(10);
		prenomA.setBackground(new Color(0,0,0));
		prenomA.setForeground(new Color(0,150,0));
		prenomA.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));

		JLabel libRueA = new JLabel("N°");
		libRueA.setForeground(new Color(0,150,0));
		rueA = new JTextField(3);
		rueA.setBackground(new Color(0,0,0));
		rueA.setForeground(new Color(0,150,0));
		rueA.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		JLabel libRue2A = new JLabel("Rue");
		libRue2A.setForeground(new Color(0,150,0));
		rue2A = new JTextField(30);
		rue2A.setBackground(new Color(0,0,0));
		rue2A.setForeground(new Color(0,150,0));
		rue2A.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		JLabel libVilleA = new JLabel("Ville");
		libVilleA.setForeground(new Color(0,150,0));
		villeA = new JTextField(20);
		villeA.setBackground(new Color(0,0,0));
		villeA.setForeground(new Color(0,150,0));
		villeA.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		JLabel libCPA = new JLabel("Code postal");
		libCPA.setForeground(new Color(0,150,0));
		CPA = new JTextField(5);
		CPA.setBackground(new Color(0,0,0));
		CPA.setForeground(new Color(0,150,0));
		CPA.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		
		JLabel libTA = new JLabel("Tel");
		libTA.setForeground(new Color(0,150,0));
		telA = new JTextField(10);
		telA.setBackground(new Color(0,0,0));
		telA.setForeground(new Color(0,150,0));
		telA.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		ajout = new JButton("Ajouter");
		ajout.setBackground(new Color(0,0,0));
		ajout.setForeground(new Color(0,150,0));
		ajout.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		supprimer = new JButton("Supprimer");
		supprimer.setBackground(new Color(0,0,0));
		supprimer.setForeground(new Color(0,150,0));
		supprimer.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		modifier = new JButton("Modifier");
		modifier.setBackground(new Color(0,0,0));
		modifier.setForeground(new Color(0,150,0));
		modifier.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		precedent = new JButton("<< Affiche");
		precedent.setBackground(new Color(0,0,0));
		precedent.setForeground(new Color(0,150,0));
		precedent.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		suivant = new JButton("Affiche >>");
		suivant.setBackground(new Color(0,0,0));
		suivant.setForeground(new Color(0,150,0));
		suivant.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		quitter = new JButton("Quitter");
		quitter.setBackground(new Color(0,0,0));
		quitter.setForeground(new Color(0,150,0));
		quitter.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		dernier = new JButton("Dernier>>>");
		dernier.setBackground(new Color(0,0,0));
		dernier.setForeground(new Color(0,150,0));
		dernier.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		premier = new JButton("<<<Premier");
		premier.setBackground(new Color(0,0,0));
		premier.setForeground(new Color(0,150,0));
		premier.setBorder(BorderFactory.createLineBorder(new Color(0,150,0)));
		
		

		//Container p = this.getContentPane();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		//p.add(premier);
		
		p1.setLayout(new GridLayout(6,1));
		p2.setLayout(new GridLayout(6,1));
		
		
		JPanel lesOnglets = new JPanel();
		
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
		
		JPanel g6 = new JPanel();
		g6.setBackground(new Color(0,0,0));
		
		JPanel h1 = new JPanel();
		h1.setBackground(new Color(0,0,0));
		
		
		JPanel h2 = new JPanel();
		h2.setBackground(new Color(0,0,0));
		
		JPanel h3 = new JPanel();
		h3.setBackground(new Color(0,0,0));
		
		JPanel h32 = new JPanel();
		h32.setBackground(new Color(0,0,0));
		
		JPanel h4 = new JPanel();
		h4.setBackground(new Color(0,0,0));
		
		
		g1.add(libN);
		g1.add(nom);
		h1.add(libNA);
		h1.add(nomA);
		
		g2.add(libP);
		g2.add(prenom);
		h2.add(libPA);
		h2.add(prenomA);
		

		g3.add(libRue);
		g3.add(rue);
		h3.add(libRueA);
		h3.add(rueA);
		
		g3.add(libRue2);
		g3.add(rue2);
		h3.add(libRue2A);
		h3.add(rue2A);
		
		g32.add(libCP);
		g32.add(CP);
		h32.add(libCPA);
		h32.add(CPA);
		
		g32.add(libVille);
		g32.add(ville);
		h32.add(libVilleA);
		h32.add(villeA);
		
		g4.add(libT);
		g4.add(tel);
		h4.add(libTA);
		h4.add(telA);
		
		g6.add(ajout);
		g5.add(supprimer);
		g5.add(modifier);
		g5.add(premier);
		g5.add(precedent);
		g5.add(suivant);
		g5.add(dernier);
		g5.add(quitter);		
		
		suivant.addActionListener(this);
		precedent.addActionListener(this);
		ajout.addActionListener(this);
		quitter.addActionListener(this);
		supprimer.addActionListener(this);
		modifier.addActionListener(this);
		dernier.addActionListener(this);
		premier.addActionListener(this);	
		
		
		//p.add(onglets);
		
		

		
		
		
		p1.add(g1);
		p1.add(g2);
		p1.add(g3);
		p1.add(g32);
		p1.add(g4);
		p1.add(g5);
		
		p2.add(h1);
		p2.add(h2);
		p2.add(h3);
		p2.add(h32);
		p2.add(h4);
		p2.add(g6);
		
		
		
		
		tabbedPane.addTab("Voir les contacts",p1);
		tabbedPane.addTab("Ajouter un contact",p2);
		lesOnglets.add(tabbedPane);
		getContentPane().add(lesOnglets);
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
	    addWindowListener(new WindowAdapter()
           {
	    		public void windowClosing(WindowEvent e)
	    		{
		   			int quit = JOptionPane.showConfirmDialog(null, "Êtes vous réellement sûr d'être certain de vouloir vraiment quitter???");
		   			if(quit == JOptionPane.YES_OPTION)
		   			{
		   				System.exit(0);
		   			}
                  }
             }); 
		pack();
	}
	
	public void affiche_precedent()
	{
		if(index>0)
		{
			index --;
			Personne laPersonne = repertoire.recherche_personne(index);
			
			nom.setText(laPersonne.getNom());
			prenom.setText(laPersonne.getPrenom());
			//adresse.setText(laPersonne.getAdresse());
			rue.setText(laPersonne.getAdresse().getNumRue());
			rue2.setText(laPersonne.getAdresse().getRue());
			CP.setText(laPersonne.getAdresse().getCP());
			ville.setText(laPersonne.getAdresse().getVille());
			tel.setText(laPersonne.getTel());

		}
	}

	
	public void affiche_suivant()
	{
		if(index<repertoire.getTaille()-1)
		{
			index ++;
			Personne laPersonne = repertoire.recherche_personne(index);
			
			nom.setText(laPersonne.getNom());
			prenom.setText(laPersonne.getPrenom());
			//adresse.setText(laPersonne.getAdresse());
			
			rue.setText(laPersonne.getAdresse().getNumRue());
			rue2.setText(laPersonne.getAdresse().getRue());
			CP.setText(laPersonne.getAdresse().getCP());
			ville.setText(laPersonne.getAdresse().getVille());
			tel.setText(laPersonne.getTel());
		}		
	}
	
	public void ajoute_pers() throws ClassNotFoundException, SQLException
	{
		try {
			String[] info = new String[7];
			info[0]=nomA.getText();
			info[1]=prenomA.getText();
			info[2]=rueA.getText();
			info[3]=rue2A.getText();
			info[4]=villeA.getText();							
			info[5]=CPA.getText();
			info[6]=telA.getText();
			
			nomA.setText("");
			prenomA.setText("");
			rueA.setText("");
			rue2A.setText("");
			villeA.setText("");
			CPA.setText("");
			telA.setText("");
			
			Personne p = new Personne(info);				
			Fenetre.repertoire.ajouter(Passerelle.ajouter(p),p);
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
	
	public void supprimer() throws SQLException
	{
		if(repertoire.getTaille()>0 && index!=-1)
		{
			Passerelle.supprimer(repertoire.getCle(index));
			repertoire.supprimer(index);
			if(index==repertoire.getTaille())
			{
				index--;
			}
			if(repertoire.getTaille()!=0)
			{
				Personne laPersonne = repertoire.recherche_personne(index);
				
				nom.setText(laPersonne.getNom());
				prenom.setText(laPersonne.getPrenom());
				//adresse.setText(laPersonne.getAdresse());
				rue.setText(laPersonne.getAdresse().getNumRue());
				rue2.setText(laPersonne.getAdresse().getRue());
				CP.setText(laPersonne.getAdresse().getCP());
				ville.setText(laPersonne.getAdresse().getVille());
				tel.setText(laPersonne.getTel());
			}
			else
			{
				nom.setText("");
				prenom.setText("");
				//adresse.setText("");
				
				
				rue.setText("");
				rue2.setText("");
				ville.setText("");
				CP.setText("");
				tel.setText("");
			}

		}

	}
	
	
	public void modifier() throws SQLException
	{
		if(index!=-1)
		{
			Personne p = repertoire.recherche_personne(index);
			Passerelle.modifier(repertoire.getCle(index),nom.getText(),prenom.getText(),rue.getText(),rue2.getText(),CP.getText(),ville.getText(),tel.getText());
			p.setNom(nom.getText());
			p.setPrenom(prenom.getText());
			p.getAdresse().setAdresse(rue.getText(),rue2.getText(),CP.getText(),ville.getText());
			p.setTel(tel.getText());
		}
	}
	
	public void afficher()
	{
		Personne laPersonne = repertoire.recherche_personne(index);
		
		nom.setText(laPersonne.getNom());
		prenom.setText(laPersonne.getPrenom());
		//adresse.setText(laPersonne.getAdresse());
		rue.setText(laPersonne.getAdresse().getNumRue());
		rue2.setText(laPersonne.getAdresse().getRue());
		CP.setText(laPersonne.getAdresse().getCP());
		ville.setText(laPersonne.getAdresse().getVille());
		tel.setText(laPersonne.getTel());
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource().equals(suivant))
		{
			this.affiche_suivant();
		}
		
		else if(event.getSource().equals(precedent))
		{
			this.affiche_precedent();
		}
		
		else if (event.getSource().equals(ajout))
		{
			try {
				this.ajoute_pers();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(event.getSource().equals(quitter))
		{
			int quit = JOptionPane.showConfirmDialog(null, "Êtes vous réellement sûr d'être certain de vouloir vraiment quitter???");
			if(quit == JOptionPane.YES_OPTION)
			{
				//sauvegarde();
				System.exit(0);
			}
		}
		
		else if(event.getSource().equals(supprimer))
		{
			try {
				this.supprimer();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(event.getSource().equals(modifier))
		{						
			try {
				this.modifier();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(event.getSource().equals(premier) && repertoire.getTaille()!=0)
		{
			index=0;
			this.afficher();
		}
		
		else if(event.getSource().equals(dernier) && repertoire.getTaille()!=0)
		{
			index=repertoire.getTaille()-1;
			this.afficher();
		}
	}
	
	public void ouvre_toi()
	{
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
}
