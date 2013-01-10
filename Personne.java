import java.io.Serializable;

public class Personne implements Serializable
{

	private int id;
	
	private String nom;
	private String prenom;
	private String tel;
	private Adresse adresse;
	
	
	/*
	public Personne(String nom, String prenom, String adresse, String tel)
	{
		this.adresse=adresse;
		this.nom=nom;
		this.prenom=prenom;
		this.tel=tel;
	}
	
	public Personne(String[] info)
	{		
		this.adresse=info[2];
		this.nom=info[0];
		this.prenom=info[1];
		this.tel=info[3];
	}
	*/
	
	//nom;prenom;rue1;rue2;codepostal;ville;tel
	public Personne(String[] info)
	{
		nom = info[0];
		prenom = info[1];
		
		adresse = new Adresse(info[2],info[3],info[4],info[5]);
		
		tel=info[6];
	}
	
	public Personne(int id, String[] info)
	{
		this.id=id;
		
		nom = info[0];
		prenom = info[1];
		
		adresse = new Adresse(info[2],info[3],info[4],info[5]);
		
		tel=info[6];
	}
	
	public void afficher()
	{
		System.out.println("Nom : "+nom);
		System.out.println("Prenom : "+prenom);
		System.out.println("Telephone : "+tel);
		System.out.println("Adresse : "+adresse);
	}
	
	public Adresse getAdresse()
	{
		return adresse;
	}
	
	public String getTel()
	{
		return tel;
	}

	public String getNom() 
	{
		return nom;
	}

	public String getPrenom() 
	{
		return prenom;
	}
	
	
	public void setNom(String nom)
	{
		this.nom=nom.replace(";", " ");
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom=prenom.replace(";", " ");		
	}
	/*	
	public void setAdresse(String adresse)
	{
		this.adresse=adresse;
	}
	 */
	
	public void setTel(String tel)
	{
		this.tel=tel.replace(";", " ");
	}
	
	public int geId()
	{
		return id;
	}
	
	public String toString()
	{
		System.out.println(nom);
		if(nom==null || nom=="")
		{
			nom="ND";	System.out.println(nom);
		}
		String sPersonne = (nom+";"+prenom+";"+adresse+";"+tel+";").replace(";;",";non defini;");
		sPersonne = sPersonne.replace(";;",";non defini;");

		return sPersonne;
	}
}