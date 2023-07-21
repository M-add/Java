import java.util.*;
class linkedlist
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        //Iterator itr=list.iterator();  
        // while(itr.hasNext()){  
        //  System.out.println(itr.next()); }
        System.out.println("After invoking add(E e) method: "+list);
        list.add(3,4);
        System.out.println("After invoking add(E e) method: "+list);
    }
}
