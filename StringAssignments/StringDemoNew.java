
public class StringDemoNew 
{
	public static void main(String[] args)
	
	{
		String s = new String("hello");
		String s2= new String("hello");
		
	//	String s="hello";
	//	String s2="hello";
	
	if(s.equals(s2))
	{
		System.out.println("objects are equal");
		System.out.println(s2.hashCode()+""+s.hashCode());
	}
	
	
}
}
