   import java.util.Properties;    
   import javax.mail.*;    
   import javax.mail.internet.*;    

//sending e-mail through Server of Gmail to multiple users 

/*

There are main 3 types of SMTP servers from which you can send mail 
 

1.    Install and use any SMTP server such as Postcast server, Apache James server, cmail server etc.
2.    Use the SMTP server provided by the host provider e.g. my SMTP server is mail.javatpoint.com
3.    Use the SMTP Server provided by other companies e.g. gmail etc.
---------------------------------------------------------------------------------------------------------------
For sending the email using JavaMail API, you need to load the two jar files:
1. mail.jar
2. activation.jar

--------------------------------------------------
how to compile code in cmd  : 

" javac -cp activation.jar:mail.jar:. sendmail.java "
//-cp = its shortcut for  setting class path at command line
//in Linux above code 
//in win ';' use betwn jar files 7 at end ".;"
eg.  " javac -cp activation.jar;mail.jar.; sendmail.java "
-------------------------------------------------------
how to execute code: 
" java -cp activation.jar:mail.jar:. sendmail "
----------------------------------------------------------

*/

class Mailer
{


      public static void send(String from,String password,String to[],String sub,String msg)
      
  {  
              //Get properties object    
              Properties props = new Properties();    
              props.put("mail.smtp.host", "smtp.gmail.com");    
              props.put("mail.smtp.socketFactory.port", "465");    
              props.put("mail.smtp.socketFactory.class",    
                        "javax.net.ssl.SSLSocketFactory");    
              props.put("mail.smtp.auth", "true");    
              props.put("mail.smtp.port", "465");    


		//get Session   
              Session session = Session.getDefaultInstance(props,    
               new javax.mail.Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {    
               return new PasswordAuthentication(from,password);  
               }    
              });    


              //compose message    
              try {    
               MimeMessage message = new MimeMessage(session);    
 
	//sending mail to multiple recipients 
		for(int i=0;i<to.length;i++)
	  {
		 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to[i]));   
	      


	       message.setSubject(sub);    
               message.setText(msg);    
               //send message  
               Transport.send(message);    
               System.out.println("\n Message sent successfully : " + to[i]);
             
	}
} 

	catch (MessagingException e) {throw new RuntimeException(e);}
                 
        }  
    
}  

    public class sendmail
{    
     public static void main(String[] args)
 {    
	String[]  recipients={"recipient1@gmail.com","recipient2@gmail.com"};

         //pass parameters below with respective information to there name
	//passing array of multiple destinations as parameter
         Mailer.send("sender@gmail.com","passcode_of_sender",recipients,"sub. of mail" , "Body of mail");  

  }
}
