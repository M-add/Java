import java.util.*;
class complex
{
  void add( int[] a,int[] b)
  {
	 int add=0,img=0,i;
	 for(i=0;i<2;i++)
	 {
	   add+=a[i];
	   img+=b[i];
	 } 
	 System.out.printf("\n%d + %di",add,img);
  }
  void multi(int[] a,int[] b,int n)
  {
	int multi=0,img1,i,j=n;
	 for(i=0;i<2;i++)
	 {
	    multi+=a[i]*b[n-1];
		n--;
	 } 
	 img1=multi;
	 System.out.printf("\n%d + %di",multi,img1);
  }	
  void sub(int[] a,int[] b)
  {
    int sub=a[0],img2=b[0],i;
	 for(i=1;i<2;i++)
	 {
	   sub-=a[i];
	   img2-=b[i];
	 } 
	 System.out.printf("\n%d + %di",sub,img2);	 
  }	 
}
class real
{
    public static void main(String args[])
    {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		complex obj=new complex();
		obj.add(a,b);
		obj.sub(a,b);
		obj.multi(a,b,n);
	}
}