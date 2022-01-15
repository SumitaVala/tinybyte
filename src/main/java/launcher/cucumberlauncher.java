package launcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import commonUtilities.propertyfileutil;
import io.cucumber.java.After;


/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;*/


/*@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\sumita\\Eclipse_project\\src\\test\\resources\\features/second.feature", glue = {
		"stepdefs" }, plugin = { "pretty", "html:reports/html-report", "json:reports/json/cucumber-report.json",
               //       "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, tags = { "@regression" });*/
public class cucumberlauncher {

	@Before
	  public  void beforetest() throws FileNotFoundException, IOException {
		
		System.out.println("************************Inside BEFORE test*****************************************************");
	}
	@BeforeClass
	  public static void beforeclass() throws FileNotFoundException, IOException {
		
		System.out.println("############################################### BEFORE CLASS ###################################");
	}
	
	
	
	@Test 
	  public void triggertest() throws FileNotFoundException, IOException {
		
		String tags_include_exclude=propertyfileutil.getinstance().getproperty("feature.inlude.tags");
		  
		  String featurefileList=System.getProperty("user.dir") +  propertyfileutil.getinstance().getproperty("feature.file.list1");
			  
			  System.out.println("featurefileList=" + featurefileList);
			  
			  
			  io.cucumber.core.cli.Main.main(new String[]{"-g", "stepdefs",
							  "-t",tags_include_exclude, "-p"
							  ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							  featurefileList});
				
	  }

		
		  @After public void aftertest() throws FileNotFoundException, IOException {
		  String filepath = System.getProperty("user.dir")
		  +"/test-output/HtmlReport/ExtentHtml.html";
		  sendEmail("sumitavala.online@gmail.com","sumitavala.online@gmail.com",
		  filepath, "sumitavala.online@gmail.com","Pune@123"); System.out.
		  println("************************Inside After test*****************************************************"
		  ); }
		  
		  @AfterClass public static void afterclass() throws FileNotFoundException,
		  IOException { System.out.
		  println("############################################### AFTER CLASS ###################################"
		  );
		  
		  }
		 
	 
	
		
		
		  public static void main(String[] args) { String filepath =
		  System.getProperty("user.dir") +"/test-output/HtmlReport/ExtentHtml.html";
		  sendEmail("sumitavala.online@gmail.com","sumitavala.online@gmail.com",
		  filepath, "sumitavala.online@gmail.com","Pune@123"); }
		 
		  
		  public static void  sendEmail(String fromEmail,String toEmail,String filepath,String uid,String pwd) {

			  String to =toEmail;// "sumitavala.online@gmail.com";

		        // Sender's email ID needs to be mentioned
		        String from = fromEmail;//"sumitavala.online@gmail.com";

		        // Assuming you are sending email from through gmails smtp
		        String host = "smtp.gmail.com";

		        // Get system properties
		        Properties properties = System.getProperties();

		        // Setup mail server
		        properties.put("mail.smtp.host", host);
		        properties.put("mail.smtp.port", "465");
		        properties.put("mail.smtp.ssl.enable", "true");
		        properties.put("mail.smtp.auth", "true");

		        
		        properties.put("mail.smtp.user", "sumitavala.online@gmail.com");


		        properties.put("mail.smtp.starttls.enable","true");

		        properties.put("mail.smtp.auth", "true");
		        properties.put("mail.smtp.socketFactory.port", 465);
		        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		        properties.put("mail.smtp.socketFactory.fallback", "false");
		        
		        // Get the Session object.// and pass username and password
		        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

		            protected PasswordAuthentication getPasswordAuthentication() {

		                return new PasswordAuthentication(uid, pwd);

		            }

		        });

		        // Used to debug SMTP issues
		        session.setDebug(true);

		        try {
		            // Create a default MimeMessage object.
		            MimeMessage message = new MimeMessage(session);

		            // Set From: header field of the header.
		            message.setFrom(new InternetAddress(from));

		            // Set To: header field of the header.
		            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

		            // Set Subject: header field
		            message.setSubject("Test Automation Execution report ");

		            
		            //************************* For Attachement
		            Multipart multipart = new MimeMultipart();

		            MimeBodyPart attachmentPart = new MimeBodyPart();

		            MimeBodyPart textPart = new MimeBodyPart();

		            try {

		                File f =new File(filepath);

		                attachmentPart.attachFile(f);
		                textPart.setText("PLease find latest Automation Execution report as an attachment.");
		                multipart.addBodyPart(textPart);
		                multipart.addBodyPart(attachmentPart);

		            } catch (IOException e) {

		                e.printStackTrace();

		            }

		            message.setContent(multipart);
		            
		            
		            //************************* Attachement END
		            Transport.send(message);
		            System.out.println("Sent message successfully....");
		        } catch (MessagingException mex) {
		            mex.printStackTrace();
		        }
		  }

}
