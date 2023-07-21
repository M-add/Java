import java.util.*;
class r
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,mid=n/2,w=n-1;
		for(i = 0; i <n; i++)
		{  
            System.out.printf("* ");  
            for(j = 0; j < w; j++) {  
                if((i == 0 || i == mid) && j < (w - 2)) 
				{  
                    System.out.printf("*");  
                }
				else if(j == (w- 2) && !(i == 0 || i == mid))
				{  
                    System.out.printf("* ");  
                }
				else 
				{  
                    System.out.printf(" ");  
                }  
            }  
            System.out.printf("\n");  
        } 
	}
}