import java.sql.*;
//database name = temp 


class jdbc_DAO 
{
	public static void main(String[] args)
	{

			GameDAO dao = new GameDAO();
			Game s1 = dao.getGame(13);
			System.out.println(s1.name);		
	}

}

class GameDAO 
{

public Game getGame(int id)
{
	

	try
	{
	String query="select name from game where id="+id;
	//table name = game,name = column name

	Game s = new Game();
	s.id=id;



		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost/temp","sumit","Ubuntu@007");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
		s.name=name;


		return s;
	}
	

	catch(Exception e)	{System.out.println(" \n\n Exception in class StudentDAO " + e);}


	return null;
}

}


class Game
{
	int id;
	String name;
}
