import java.sql.*;
import java.io.*;
// Creating  a table   "CREATE TABLE image (name varchar(33), img LONGBLOB); "
//select * from image;
//it will return  a huge binary data.


class jdbc_storing_img
{

public static void main (String[] args)
{

try {

		String URL = "jdbc:mysql://localhost:3306/temp";
		//" :post no " is optional
		String username = "sumit";	
		String passcode = "Ubuntu@007";


	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(URL,username,passcode);

	PreparedStatement ps = con.prepareStatement("INSERT INTO img VALUES (?,?)");

	ps.setString(1,"Zayn");

	FileInputStream fin = new FileInputStream("/home/sumit/Pictures/Wallpapers/Zayn.jpg");
	//dont forget to  provide proper image path 
	ps.setBinaryStream(2,fin,fin.available());
	//parameters :  ' 2=? no 2nd','input stream','length of ip stream'
	
	int i =  ps.executeUpdate();
	System.out.println(" \n\n Records Affected :"+i); 


}

	catch (Exception e)	{System.out.println(e);}


}

}
