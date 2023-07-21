import java.util.*;
class phy
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		int size=a.length;
		int i,j;
		char b[][]=new char[size][size];
		int m=size/2;
		for (i = 0; i <size; i++) 
		{
         for (j = 0; j <size; j++) 
	     {
          b[i][j]=' ';
		 }
		}
		for(i=0;i<size;i++)
		{
			b[i][m]=a[i];
		}
		for(i=0;i<size;i++)
		{
			b[m][i]=a[i];
		}
       for (i=0;i<size;i++)
       {
        for (j=0;j<size;j++)
        {
            System.out.print(b[i][j] + " ");
        }
        System.out.print("\n");
      }
	}
}