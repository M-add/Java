import java.util.*;
class switch1
 {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your age:");
	int n=1;
	int age=sc.nextInt();
    switch (n) 
	{
      case 1:
	  if(age<18)
	  {
		System.out.println("Your minor");
		break;
	  }
	  else 
	  {
		  goto case 2;
	  }
 
	  case 2:
	   if(age>18)
	  {
		System.out.println("Your major");
	  }
	   break;
	  default:
	   System.out.println("provide a valid age");
	}
  }
 }