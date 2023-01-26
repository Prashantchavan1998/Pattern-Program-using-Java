package pattern;

public class Example22 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==0 || i==4 || j==0 | j==4)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=0;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
