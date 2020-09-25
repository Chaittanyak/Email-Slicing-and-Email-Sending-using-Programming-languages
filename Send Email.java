import jdk.internal.joptsimple.internal.Strings;
import jdk.internal.net.http.websocket.Transport;
import javax.activation.*;
import javax.imageio.spi.IIORegistry;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
public class SendEmail {
    private static IIORegistry Session;

    public static <MimeMessage> void main(String[] args) {
        //Recipient email to be mentioned...
        Strings to = "nkc123@gmail.com"
                //Sender's email to be mentioned
        String from = "nkc123@gmail.com";
        //Assuming tht ew are sending mail from localhost
        String host = "localhost";
        //Get system PropertieS
        Properties properties = System.getProperties();
        //SettingUp Mail Server
        properties setProperty("mail.smtp.host", host);
        //Get the default Session object.
        Session session = Session.getDefaultInstance(properties);
        try {
            //Create a default MimeMessaage object.
            MimeMessage message = new MimeMessage(session);
            //Set From: header field of the header .
            message.setFrom(new InternetAddress(from));
            //Set to : header field of the header.
            message.addRecipient(Message.RecipientType.TO, newInternetAddress(to));
            //Set Subject: header field
            message.setSubject("This is the Subject line!!!");
            //Now set the actual message
            message.setText("This is Actual Message");
            //Send Message
            Transport.send(message);
            System.out.println("Sent Message Sucessful...");
        }catch(MessagingException mex) {
            mex.printStackTrace();
        }
    }
}