import java.util.*;
class max1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int a[][]=new int[n][n1];
		int b[]=new int[n];
		int i,j;
		int count;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	   for(i=0;i<n;i++)
       {
         count=0;
        for(j=0;j<n1;j++)
        {
           if(a[i][j]==1)
          {
            count++;
          }
        }
		b[i]=count;
      }
     int index=0,max=b[0];
     for(i=0;i<n;i++)
     {
          if(b[i]>max)
          {
            max=b[i];
            index=i;
          }
     }
	 System.out.println(index+1);
	}
}