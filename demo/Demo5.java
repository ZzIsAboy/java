public class Demo5
{
	public static void main(String []args)
	{
		int lay=10;
		for(int i=1;i<=lay;i++)
		{
			
			for(int k=1;k<=lay-i;k++)
				
				System.out.print("*");
					for(int l=1;l<=2*i-3;l++)
					{
						
						System.out.print(" ");
						
					}
					System.out.print("*");
					

				System.out.println();
		}
	}
}