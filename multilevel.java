class one
{
    int a()
    {
        return 10;
    }
}
class two extends one
{
   int b=5;
}
class three extends two
{
    int c=10;
}
class multilevel
{
    public static void main(String[] args)
    {
       three obj1=new three();
       System.out.println(obj1.a()+obj1.b+obj1.c);
    }
}