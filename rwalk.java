import java.util.*;
class rwalk
{
	public static void main(String[] arg)
	{
		int c=0;
		int cmax=0;
		int cmin=0;
		while(c!=3&&c!=-3)
		{
		  double random=Math.random();
		  if(random>0.5)
		  {
			  c++;
			  if(c>cmax)
			  {
				  cmax=c;
			  }
		  }
		  else
		  {
			  c--;
			  if(c<cmin)
			  {
				  cmin=c;
			  }
		  }  
		 System.out.println("The current position:"+c);  
		}
		if(c==3)
		{
			System.out.println("The minimum position:"+cmin);
		}
		else
		{
			System.out.println("The maximum position:"+cmax);
		}
	}
}