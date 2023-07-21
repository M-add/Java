import java.util.*;
class copy
{
	public static void main(String arg[])
	{
		int[] a={1,2,3,4};
		int[] b=new int[4];
		int i;
		for(i=0;i<4;i++)
		{
			b[i]=a[i];
		}
	    System.out.println("First array \n");
		for(i=0;i<4;i++)
		{
			System.out.print(a[i]);	
		}
		System.out.println("\nSecond array");
		for(i=0;i<4;i++)
		{
			System.out.print(b[i]);	
		}
	}
}
		
		