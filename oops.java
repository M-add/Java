import java.util.*;
class employee
{
  String name,job;
  int salary;
  employee(String a,String b,int c)
  {
	  name=a;
	  job=b;
	  salary=c;
  }
  void display()
  {
	System.out.print("name:"+name+"\njob:"+job+"\nsalary:"+salary);  
  }
}
class oops
{
 public static void main(String args[])
 {
    employee obj=new employee("Mathan","software_developer",10000);
	obj.display();
 }
}