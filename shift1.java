import java.util.*;
class shift1
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int i,j;
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	    int min=a[0],index=0;
		for(i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				index=i;
			}
		}
		System.out.println(index);
	}
}