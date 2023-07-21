import java.util.*;
class box1
 {
  Scanner sc=new Scanner(System.in);
  double width=sc.nextDouble();
  double height=sc.nextDouble();
  double depth=sc.nextDouble();
 }
class box
{
    public static void main(String args[])
    {
		box1 obj=new box1();
		double vol;
		vol=obj.width*obj.height*obj.depth;
		System.out.print(vol);
	}
}