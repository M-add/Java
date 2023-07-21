class a extends Thread
{
    public void run()
    {
        System.out.println("hello");
    }
}
class b extends Thread
{
    public void run(){    
        for(int i=1;i<5;i++){   
        // the thread will sleep for the x? milli seconds
          try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}    
          System.out.println(i);    
        }    
       }  
}
// class a implements Runnable
// {
//     public void run()
//     {
//         int i;
//         for(i=0;i<5;i++)
//         {
//           System.out.println(i);
//         }
//     }
// }
// class b implements Runnable
// {
//     public void run()
//     {
//         int i;
//         for(i=10;i<15;i++)
//         {
//            System.out.println(i);
//         }
//     }
// }
public class thr 
{
    public static void main(String[] args)
    {
        a obj = new a();
        //Thread ta=new Thread(obj);
         b obj1 = new b();
        // Thread tb=new Thread(obj1);
        // ta.start();
        // tb.start();
        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(6);
        //obj.start();
        obj1.start();
    }
    
}
