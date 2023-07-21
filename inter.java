interface a
{
    void print();//(abstract)
    default void print1(){System.out.println("default method");}

}
class a6 implements a
{
    public void print()
    {
        System.out.println("Hello");
    }
}
class inter 
{
    public static void main(String[] args) 
    {
        a obj=new a6();
        obj.print();   
        obj.print1();
    }
}
