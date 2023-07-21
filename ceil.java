import java.util.*;
public class ceil
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
		int a[]=new int[n];
		int x=-1,s,i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int i,j,f=0;
		for(i=0;i<10;i++)
		{ 
           s=a[i];
		  for(j=i;j<n;j++)
		  {
			if(i<a[j])
			{
				System.out.printf("Number %d-->ceil is %d,floor is %d",i,a[j],x);
				break;
			}
			else if(i==a[j])
			{
				System.out.printf("Number %d-->ceil is %d,floor is %d",i,a[j],s);
			}	
		  }
		}
	}
}