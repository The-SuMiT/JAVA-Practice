import java.sql.*;
//imports all required Classes  

//************* Some imp  Tips **********//
/*

-> pay close attention while typing class names and methods
-> make sure you have correct username and passcode while getting connection 
	with SQL
-> compile jdbc's java prog. with classpath of   mysql-connector.jar file
	(: after jar file ) (they must be in same folder)
	eg.  javac -cp mysql-connector-java-5.1.49.jar: jdbc.java


  */




class jdbc_test
{

public static void main(String[] args)

{

//try catch is must for  exceptions 
   try {

    String url       = "jdbc:mysql://localhost:3306/temp";
//abv url is means  connecting to jdbc mysql  on localhost(i.e current machine)
// at 3306 port no & 3306 is default port no of mysql database
// temp is database name in which we are going to work 




    String user      = "sumit";	//name of the localhost(current machine) user
    String password  = "Ubuntu@007";	//password of the localhost
    String query ="select * from game";		
	// query which  is going to execute

    

	// creating a connection to the database
	
	Class.forName("com.mysql.jdbc.Driver");
	//forName  method  returns the obj  (of provided class in its args)
	 //forName method returns obj via its Static block which automatically invokes itself when class is declared.  
	 //and instance block also can be invoke abv  by adding ".newInstance();" before ";".  
    	Connection con = DriverManager.getConnection(url, user, password);

	 Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);	
	//rs where query result is stored




//Rem, after getting access to desired database  table the pointer is at 
//0th position So , rs.next() will take us to 1st position
//(where 1st value of table lies) . 

	while(rs.next())	
	{
	String name = rs.getString("name");
	System.out.println("Game  :" + name);
	}

	st.close();
	con.close();


  }

catch(Exception e)
	{
		System.out.println(e);
	}

}

}
