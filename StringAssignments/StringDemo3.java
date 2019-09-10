
class Dog
{
	
	public String toString() {
		return getClass().getName() + "  Object";
	}
	
}


public class StringDemo3 
{
	
	public static void main(String[] args)
	{
		Dog d = new Dog();
		String str= new String("hello");
		System.out.println(d);
		System.out.println();
	}

	
}
