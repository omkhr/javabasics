

import java.util.Scanner;

public class NumberToString 
{
  double number;


 public String numberOutputInString()
{
	 
	 
	System.out.println("Enter the Number:");
	Scanner scanner= new Scanner(System.in);
	number = scanner.nextDouble();
	 int castIntNo = (int) number;
	String s = Integer.toString(castIntNo); 
	return "" + s.charAt(s.length()-2) + s.charAt(s.length()-1);
}

public static void main(String[] args)
{
	NumberToString n = new NumberToString();
	System.out.println(n.numberOutputInString());
	
}


}