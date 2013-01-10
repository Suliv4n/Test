import java.io.IOException;
import java.sql.SQLException;


public class GestionRepertoire 
{
	public static void main(String[] args) 
	{

		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try {
			Fenetre sesame = new Fenetre("Mon Répetoire de la mort qui tue!",800,200);
			sesame.ouvre_toi();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(" pp");

	}
}
