
import java.util.Scanner;

public class StringDemoTest 
{
	public static void main(String[] args)
	{	
		StringDemo s1=new StringDemo("java");
		System.out.println(s1);
		s1.setS("hello");
		System.out.println(s1.getS());
		Scanner s2=new Scanner(System.in);
		String s3=s2.nextLine();
		
		s1.getRequiredData(s3);
	//	String s2 = s1.toString();
	//	System.out.println(s2);
	}

}
