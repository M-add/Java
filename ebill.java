import java.util.*;
class ebill  
{   
    public static void main(String args[])   
    {   
		Scanner sc= new Scanner(System.in);
        int u = sc.nextInt();   
        double bill = 0;  
        // if(u <= 100)  
        // {  
        //     bill = u * 1;  
        // }
        // else if(u >= 101 && u <= 200)
		// {  
        //     bill = 100 * 1 + (u - 100) * 2.50;  
        // }  
        // else if(u >= 201 && u <=500)  
        // {  
        //     bill = 100 * 1 + 200 * 2.50 + (u - 200) * 4;  
        // }
		// else  
        // {  
        //     bill = 100 * 1 + 100 * 2.50 + 300 * 4 + (u - 500) * 6;  
        // } 
        while(u>0)
        {
            if(u==100)
            {
                bill=100*1;
                u-=u;
            }
            if(u>=100)
            {
                bill=100*1;
                u-=100;
            }
            
        }		
        System.out.println("The electricity bill for " +u+ "unitt is : " + bill);   
    }   
}