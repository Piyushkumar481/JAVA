package abstraction;

import java.util.Scanner;

interface MessageService
{
	boolean sendMessage(String message);
	
}
class EmailService implements MessageService
{
	public boolean sendMessage(String message)
	{
	System.out.println("Message sent via Email");
	return true;
	}
}
class SMSService implements MessageService
{
	public boolean sendMessage(String message)
	{
	System.out.println("Message sent via SMS");
	return true;
	}
}
class WhatsappService implements MessageService
{
	public boolean sendMessage(String message)
	{
	System.out.println("Message sent via Whatsapp");
	return true;
	}
}

class NotificationService
{
	public void notifyUser(MessageService service,String message)
	{
		if(service.sendMessage(message))
		{
			System.out.println("Notification Sent Successfully");
		}
		else
		{
			System.out.println("Notification failed");
		}
	}
}

class MessageFactory
{
	public static MessageService getService(int choice)
	
	{
		MessageService obj = null;
		
		switch(choice)
		{
		case 1-> 
		{
			obj = new EmailService();
		}
		case 2-> 
		{
			obj = new SMSService();
		}
		case 3-> 
		{
			obj = new WhatsappService();
		}
		
		}
		return obj;
	}
	
}




public class NotificationSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the message...!!");
		String msg = sc.nextLine();
		MessageService ms = MessageFactory.getService(choice);
		NotificationService ns = new NotificationService();
		ns.notifyUser(ms, msg);
		
	}

}
