import  java.sql.*;





class PreparedStatement
{
public static void main(String[] args)
{

	int id=100;
	String coming_name="Neon"; 
	String query = "INSERT INTO game VALUES (?,?)";



	try {
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","sumit","Ubuntu@007");


		java.sql.PreparedStatement  st = con.prepareStatement(query);
		// you need to specify that your going to use the java.sql.PreparedStatement class 
		//Statement class is use for executing a SQL statement in jdbc and PrepareStatement  
		//uses precompile SQL statement in  jdbc 


		Statement st_obj= con.createStatement();
		ResultSet rs = st_obj.executeQuery("Select * from game ");


		st.setInt(1,id);		//st.setInt(no of ? in query,inserting which variables value );
		st.setString(2,coming_name);	//eg. In ? no 2nd of query , we want to pass our  coming_name variables value

			int count  = st.executeUpdate();
		//for insert operation on table executeUpdate method is used. 
		//and the rows afffected returns by this method



                 System.out.println("\n  No of rows affected : "+ count);



		while(rs.next())
		{
			String temp = rs.getString("name");
			System.out.println(" \n\n" + temp);
		}


		rs.close();
	    st.close();
	con.close();

	}

	catch (Exception e)
	{
	System.out.println(e);
	}

}

}
