package srcpackg;

abstract  class Anomy22
{

	public abstract  void m1();
	
}
public class Anomy2
{
	public static void main(String[] args)
	{
		Anomy22 a1=new Anomy22() 
		{
			public void m1()
			 {
				 System.out.println("showing knowledge");
			 }
			
		};
		
		a1.m1();
	}
}