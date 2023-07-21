import java.util.*;
public class finger 
{
    public static void main(String args[])
    {
        Scanner sc  =  new Scanner(System.in);
        int n=sc.nextInt();
        String stringArray[] = {"Thumb","Index","Middle","Ring","Little"};
        n = n-5;
        int identifier = n/4;
        int rem = n%4;
        if(identifier%2 != 0)
        {
            System.out.print(stringArray[rem]);
        }
        else
        {
            System.out.print(stringArray[stringArray.length-rem-1]);
        }
    }
}