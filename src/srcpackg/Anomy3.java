package srcpackg;

abstract  class Anomy12
{

	public abstract  void m1();
	
}
public class Anomy3
{
	public static void main(String[] args)
	{
		Anomy12 a1=new Anomy12() 
		{
			public void m1()
			 {
				 System.out.println("showing knowledge");
			 }
			
		};
		
		a1.m1();
	}
}