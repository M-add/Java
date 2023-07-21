import java.util.*;
class patx
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if((i%2==0)&&(j%2==0))
				{
					System.out.print("x");
				}
				else if((i%2!=0)&&(j%2==0))
				{
					System.out.print("0");
				}
				else if((i%2!=0)&&(j%2!=0))
				{
						System.out.print("x");
				}
				else if((i%2==0)&&(j%2!=0))
				{
					System.out.print("0");
				}
			}
			System.out.print("\n");
		}
	}
}
		