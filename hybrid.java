//import java.util.*;
class grandfather
{
    void show()
    {
        System.out.println("grandfather");
    }
    
}
class father extends grandfather
{
    void show1()
    {
        System.out.println("father");
    }
}
class son extends father
{
   void show2()
   {
       System.out.println("son");
   }
}
class daughter extends father
{
    void show3()
    {
        System.out.println("daughter");
    }
}

class hybrid 
{
    public static void main(String[] args)
    {
       son obj=new son();
       obj.show();
       obj.show1();
       obj.show2();
    }
    
}
