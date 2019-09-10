
import java.util.Scanner;

public class Employee 
{
	String firstName,lastName,company,role;
	public String generatePassword()
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the firstName:");
		String s1=s.nextLine();
		String s5=s1.substring(0,2);
		System.out.println("Enter the lastName:");
		String s2=s.nextLine();
		String s6=s2.substring(0,2);
		System.out.println("Enter the companyName:");
		String s3=s.nextLine();
		String s7=s3.substring(0,2);
		System.out.println("Enter the Role:");
		String s4=s.nextLine();
		String s8=s4.substring(0,2);
		//String s1 =
		//return password;
		return s5+s6+s7+s8;
		
	}
	
	
}
