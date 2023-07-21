import java.util.*;
class photo
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int w=sc.nextInt();
			int h=sc.nextInt();
			if((w<l)||(h<l))
             {
				System.out.printf("UPLOAD ANOTHER");
			 }
			 else if(w==h)
			 {
				System.out.printf("ACCEPTED");
			 }
			 else
			 {
				System.out.printf("CROP IT");
			 }
		}
	}
}
			