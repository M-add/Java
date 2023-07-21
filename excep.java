import java.util.*;
class excep 
{
    void divide()
{
    Scanner sc=new Scanner(System.in); 
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    try 
    {
        int result=n1/n2;
        System.out.println(result);
    }
    catch(Exception e)
    {
        System.out.println("check the numbers");
        divide();
    }
}
    public static void main(String[] args)
    {
     excep obj=new excep();
     obj.divide();
    }
}
