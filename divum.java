import java.util.*;
class divum
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int i,j,k=0;  
      int n=sc.nextInt();
      String str[]=new String[n+1];
      String[] str2=new String[n+1];
      for(i=0; i<str.length; i++)
      {
        str[i]=sc.nextLine();
      }
      for(i=0; i<str.length; i++)
      {
        for(j=i+1; j<str.length; j++)
        {
            if(str[i].equals(str[j]))
            {
                str2[k]=str[j];
                k++;
                break;
            }
        }
      }
      String temp="";
      for(i=0; i<k; i++)
      {
        for(j=i+1; j<k;j++)
        {
           if(str2[i].length()>str2[j].length())
           {
              temp=str2[i];
              str2[i]=str2[j];
              str2[j]=temp;
           }
        }
      }
      System.out.printf("\n");
      for(i=0;i<k; i++)
      {
        System.out.print(str2[i]+"  ");
      }
    }
}
