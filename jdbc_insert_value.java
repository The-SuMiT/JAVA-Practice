import  java.sql.*;





class jdbc_insert_value
{
public static void main(String[] args)
{

	int id=13;
	String coming_name="TheSuMiT."; 


	try {
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","sumit","Ubuntu@007");


		Statement st = con.createStatement();

		int count  = st.executeUpdate("insert into game values ("+id+",'"+coming_name+"' )");
			//pay close attention while passing variables in the query
			//for insert operation on table executeUpdate method is used.

                 System.out.println("\n  No of rows affected : "+ count);



	    st.close();
	con.close();

	}

	catch (Exception e)
	{
	System.out.println(e);
	}

}

}
