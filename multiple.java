interface a
{
    void p1();
}
interface b
{
   void p1();
}
class child implements a,b
{
    public void p1()
    {
        System.out.println("dad");
    }
    public void p2()
    {
        System.out.println("mom");
    }
}

public class multiple 
{
    public static void main(String[] args)
    {
         child c=new child();
         c.p1();
         c.p2();
    }
}
