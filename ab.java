abstract class one{
    public one()
    {
        System.out.println("This is a constructor of abstract class");
    }
    public abstract void a_method();
    public void normal()
    {
        System.out.println("This is normal mthod of abstract class");
    }
}
class subclass extends one{
    public void a_method()
    {
        System.out.println("This is abstract method");
    }
}
class ab
{
    public static void main(String[] args)
    {
        subclass obj=new subclass();
        obj.a_method();
        obj.normal();
    }
}