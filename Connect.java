import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect 
{

	private static Connection c;
	
	public static Connection getConnexion() throws SQLException, ClassNotFoundException
	{
		if(c==null)
		{
			c = DriverManager.getConnection("jdbc:mysql://localhost/repertoire","root","");
		}
		return c;
	}
}
