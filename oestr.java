import java.util.*;
public class oestr 
{
    public static void main(String[] args) 
    {
      //Scanner sc=new Scanner(System.in);
      String[] str={"abc","bd"};
       int sum=0,cal;
       for(int i=0;i<str.length;i++)
       {
        cal=1;
        char[] temp=str[i].toCharArray();
         for(int j=0;j<temp.length;j++)
         {
            //System.out.println((int)temp[j]);
            cal*=temp[j]*temp[j];
         }
         sum+=cal;
       }
       System.out.println(sum); 
       if(sum%2==0)
       {
        System.out.println("even");
       }
       else
       {
        System.out.println("odd");
       }
    }
}
