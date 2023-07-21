import java.util.*;

class basket 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int b1[]=new int[n];
    int b2[]=new int[n];
    int i,j,temp=0,c=0;
    for(i=0;i<n;i++)
    {
        b1[i] =sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        b2[i] =sc.nextInt();
    }
    Arrays.sort(b1);
    Arrays.sort(b2);
    for(i=0;i<n;i++)
    {
       if(b1[i]!=b2[i])
       {
           temp=b1[i];
           b1[i]=b2[i];
           b2[i]=temp;
           c++;
           Arrays.sort(b2);
           Arrays.sort(b1);
        }    
    }
    boolean res=Arrays.equals(b1,b2);
    if(res)
    {
        System.out.println(c);
    }
    else{
       System.out.println(-1);
    }
  }  
}
