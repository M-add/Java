class switch1
 {
  public static void main(String[] args) 
  {
    Scanner sc=new.scanner(System.in);
    System.out.println("enter your age:");
	int n=sc.nextInt();
    switch (n) 
	{
      case 18:
	   System.out.println("Your minor");
        break;
	  case 19:
	   System.out.println("Your major");
	  default:
	   System.out.println("provide a valid age");
	}
  }
 }