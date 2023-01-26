package pattern;

public class Heart 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i && j<=5)
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=5-i;j--)
			{
				if(j>=i)
				{
				System.out.print("");
				}
				else
				{
					System.out.print(" * ");
				}
			}			
			System.out.println();
		}
		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=5;j++) { if(i==1 || i==5|| j==1 ||
		 * j==5) { System.out.print(" * "); } else
		 * 
		 * { System.out.print("   "); } } System.out.println(); }
		 */

	}

}
