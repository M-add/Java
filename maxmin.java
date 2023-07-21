import java.util.*;
class maxmin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
        int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        int result[]=new int[n];
        sc.close();
        int index=0,num=n-1;
        for (i = 0; i < n; i += 2) 
        {
            result[i] = a[num--];
        }
        for (i = 1; i < n; i += 2) 
        {
            result[i] = a[index++];
        }
        for(i=0;i<n;i++)
		{
			System.out.printf("%d ",result[i]);
		}
    }
}