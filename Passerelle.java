import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Passerelle
{
	public static Repertoire initRepertoire()
	{
		Repertoire rep = new Repertoire();
		
		Connection connexion;
		try {
			connexion = Connect.getConnexion();
			Statement st = connexion.createStatement();
			String req = "SELECT * FROM contact";
			ResultSet res = st.executeQuery(req);
			

			
			String[] info = new String[7];
			while(res.next())
			{
				int id = res.getInt(1);
				for(int i=2; i<=8; i++)
				{
					info[i-2]=res.getString(i);
				}
				rep.ajouter(id,new Personne(info));
			}
		
			res.close();
			st.close();

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rep;
	}
	
	public static int ajouter(Personne p) throws ClassNotFoundException, SQLException
	{
		Connection connexion = Connect.getConnexion();
		
		//String[] info = p.toString().split(";");
		
		PreparedStatement sp = connexion.prepareStatement("INSERT INTO CONTACT (nom,prenom,numrue,adresse,ville,cp,tel) values(?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
		sp.setString(1,p.getNom());
		sp.setString(2,p.getPrenom());
		sp.setString(3,p.getAdresse().getNumRue());
		sp.setString(4,p.getAdresse().getRue());
		sp.setString(5,p.getAdresse().getVille());
		sp.setString(6,p.getAdresse().getCP());
		sp.setString(7,p.getTel());
		
		
		ResultSet res = sp.getGeneratedKeys();
		
		int id=0;
		if(res.next())
		{
			id=res.getInt(1);
		}
		
		sp.executeUpdate();
		sp.close();
		
		return id;
	}
	
/*	
	public static void supprimer(Personne p) throws SQLException
	{
		Connection c = Connect.getConnexion();
		String req = "DELETE FROM contact WHERE nom = ? AND prenom = ?";
		
		
		
		PreparedStatement ps = c.prepareStatement(req);
		ps.setString(1,p.getNom());
		ps.setString(2,p.getPrenom());
		
		ps.executeUpdate();
		
		ps.close();
		c.close();		
	}
*/
	
	public static void supprimer(int id) throws SQLException
	{
		Connection c;
		try {
			c = Connect.getConnexion();
			String req = "DELETE FROM contact WHERE id=?";		
			
			PreparedStatement ps = c.prepareStatement(req);
			ps.setInt(1,id);
			
			ps.executeUpdate();
			
			ps.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void modifier(int id,String nom, String prenom, String ad1, String ad2, String ville, String codeP, String tel) throws SQLException
	{
		Connection c;
		try {
			c = Connect.getConnexion();
			String req = "UPDATE contact " +
					 "SET nom=?, prenom=?, numrue=?, adresse=?, cp=?, ville=?, tel = ? " +
					 "WHERE id=?";		
		
		PreparedStatement ps = c.prepareStatement(req);

		ps.setString(1,nom);
		ps.setString(2,prenom);
		ps.setString(3,ad1);
		ps.setString(4,ad2);
		ps.setString(5,codeP);
		ps.setString(6,ville);
		ps.setString(7,tel);
		
		ps.setInt(8,id);

		
		ps.executeUpdate();
		
		ps.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	
}