import java.sql.*;


//   DAO  stands for data Access object in which  with the use of 2 statements (below eg)  we can pass values in database. 
//  compiling java program with passing classpath of mysql.jar file like  below
// " javac -cp mysql-connector-java-5.1.49.jar: jdbc_DAO_insert.java "


class jdbc_DAO_insert
{
	

	public static void main(String[] args)
	{

			GameDAO dao = new GameDAO();
			 dao.addGame(9,"Neon Green");
			//adding game name Neon Green with id 9
	//Now by abv 2 statements we can add values to database  and this is known as  
	//separating the technical details from the rest of the app  i.e  /****DAO (Data access Object)***/
	}

}

class GameDAO 
{

public void addGame(int id , String name)
{
	

	try
	{	

		int coming_id=id;
		
		String coming_name=name;
		

		String query="insert into game values (?,?)";

	   	


	   	 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","sumit","Ubuntu@007");


		java.sql.PreparedStatement  st = con.prepareStatement(query);
 
		

		st.setInt(1,coming_id);				// "1"is '? no 1' in query and and method setInt passing int coming_id to query 
		st.setString(2,coming_name);        // "2"is '? no 2' in query and and method setString passing String coming_name to query 
		


		int count= st.executeUpdate();    // Now count will be get stored by the no of rows affected by Query.
	
		System.out.println("\n\n No of rows affected :" + count);
	

	}

	catch(Exception e)	{System.out.println(" \n\n Exception in class addGame" + e);}


	

}


}
/*
class Student
{
	int id,result;
	String name;

}

*/
