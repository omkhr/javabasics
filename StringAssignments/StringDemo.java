public class StringDemo 
{
	String s;

	StringDemo(String s1)
	{
		this.s=s1;
	}
	
	
	
	@Override
	public String toString() {
		return s;
	}



	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	void getRequiredData(String input)
	{
		if(input.isEmpty())
		{
			System.out.println("there is no string");
			
		}
		else
		{
			System.out.println(input);
		}
			
	}
	
	
}
