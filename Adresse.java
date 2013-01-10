import java.io.Serializable;

public class Adresse implements Serializable
{
	private String rue;
	private String rue2;
	private String codeP;
	private String ville;
	
	public Adresse(String rue, String rue2, String codeP,String ville)
	{
		this.rue=rue;
		this.rue2=rue2;
		this.codeP=codeP;
		this.ville=ville;
	}
	
	public void afficher()
	{
		System.out.println(rue+" "+rue2);
		System.out.println(codeP+" "+ville);
	}
	
	
	public String getAdresse()
	{
		return rue+" "+rue2+"\n"+codeP+" "+ville;
	}	
	
	public String toString()
	{
		return (rue+";"+rue2+";"+codeP+";"+ville);
	}

	public String getNumRue() {
		return rue.replace(";", " ");
	}

	public String getRue() {
		return rue2.replace(";", " ");
	}

	public String getCP() {
		return codeP.replace(";", " ");
	}

	public String getVille() {
		return ville.replace(";", " ");
	}

	public void setAdresse(String rue, String rue2, String CP, String ville) 
	{
		this.rue=rue;
		this.rue2=rue2;
		this.codeP=CP;
		this.ville=ville;		
	}
	
	

}
