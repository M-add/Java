import java.util.*;

public class book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] book = new int[n];
        int i,j,k=1;
        for (i = 0; i < n; i++) 
        {
            book[i] = sc.nextInt();
        }
        int[] ans=new int[n];
        for(i=0;i<book.length;i++)
        {
            int a=book[i]+m;
            for(j=0;j<book.length;j++)
            {
                if(a==book[j])
                {
                    ans[k]=book[j];
                    k++;
                    book[j] = 0;
                    ans[k]=book[i];
                    k++;
                    book[i]=0;
                }
            }
        }
        for(i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
