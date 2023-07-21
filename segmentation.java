import java.util.*;
class segmentation
{
    static boolean check(String res, String[] dict)
    {
        for(int i = 0; i <dict.length; i++)
        {
           if(res.equals(dict[i]))
           {
            return true;
           }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String []dict={"apple","pie","pear"};
        String str=sc.nextLine();
        String res="";
        boolean c;
        String s="";
        for(int i=0; i<str.length(); i++)
        {
            res+=str.charAt(i);
            c=check(res,dict);
            if(c==true)
            {
                s+=res;
                res="";
            }
            else
            {
                continue;
            }
        }
        if(s.equals(str))
        {
           System.out.println("Input string can be segmented");
        }
        else
        {
             System.out.println("Input string cannot be segmented");
        }
        
    }
}