import java.util.*;
class leader
{
	void printLeaders(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
		{
			int j;
			for (j = i + 1; j < n; j++)
			{
				if (arr[i] <=arr[j])
					break;
			}
			if (j == n)
            {
				System.out.print(arr[i] + " ");
            }
		}
	}
	public static void main(String[] args)
	{
		leader lead = new leader();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        sc.close();
		lead.printLeaders(arr, n);
	}
}