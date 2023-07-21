import java.util.*;

class oddstr
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       String[] s =new String[n];
       for(int i=0;i<n;i++)
       {
             s[i]=sc.next();
       }
       String result = getSmallestAlphabetically(s);
       System.out.println(result);
       sc.close();
    }
    public static String getSmallestAlphabetically(String[] words) 
   { 
    return Arrays.stream(words)
            .min(String::compareTo)
            .orElse("");
   }
}