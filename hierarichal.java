//import java.util.*;
class one
{
    int a=10;
}
class two extends one
{
   int b=20;
}
class three extends one
{
    int c=25;
}
class hierarichal
{
    public static void main(String[] args)
    {
      three obj=new three();
      System.out.println(obj.c+obj.a);
    }
}