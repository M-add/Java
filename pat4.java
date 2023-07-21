import java.util.*;
class pat4
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		 int m=sc.nextInt();
		 int i,j,n=m*2;
		 int y=0;
		 for(i=1;i<=m;i++)
		 {
		  for(j=1;j<=i;j++)
		  {
			System.out.printf("*"); 
		  }
		  for(j=i+1;j<=n-i;j++)
		  {
			  System.out.printf("#");
		  }
		  for(j=n-y;j<=n;j++)
		  {
			System.out.printf("*"); 
		  }
		  y++;
		   System.out.printf("\n");
		 }
		 t--;
		 n=0;
		}
		
	}
}