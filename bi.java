//import java.io.*;
class bi
{
  public static void main(String[] args)
  {
    int num=40,val=0;
    while(num!=0)
    {
      int a=num%2;
      val=val*10+a;
      num=num/2;
    }
    System.out.println(val);
  }
}