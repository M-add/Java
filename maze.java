import java.util.*;
class maze
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int a[][] = new int[n][n];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++){
	     a[i][j] = sc.nextInt ();
      }
    }
    int result[][] = new int[n][n];
    boolean vist[][] = new boolean[n][n];
      vist[0][0] = true;
    for (int i = 0; i < n; i++)
      {
	    for (int j = 0; j < n; j++)
	   {
	    if (i == 0 && j == 0)
	      continue;
	      if (a[i][j] == 0)
	      {
		   if (i == 0 && j != 0 && a[i][j - 1] == 0 && vist[i][j - 1])
		   {
		     result[i][j] = result[i][j - 1] + 1;
		     vist[i][j] = true;
		   }
		  if (i != 0 && j == 0 && a[i - 1][j] == 0 && vist[i - 1][j])
		  {
		    result[i][j] = result[i - 1][j] + 1;
		    vist[i][j] = true;
		  }
		if (i == j && a[i - 1][j - 1] == 0 && vist[i - 1][j - 1])
		  {
		    result[i][j] = result[i - 1][j - 1] + 1;
		    vist[i][j] = true;
		  }
		else if (i != 0 && j != 0)
		  {
		    if (a[i - 1][j] == 0 && a[i][j - 1] == 0&& vist[i - 1][j] && vist[i][j - 1])
		      {
			  result[i][j] =(result[i][j - 1] <result[i - 1][j] ? result[i][j - 1] : result[i - 1][j]) + 1;
			  vist[i][j] = true;
		      }
		    else if (a[i - 1][j] == 0 && vist[i - 1][j])
		      {
			result[i][j] = result[i - 1][j] + 1;
			vist[i][j] = true;
		      }
		    else if (a[i][j - 1] == 0 && vist[i][j - 1])
		      {
			result[i][j] = result[i][j - 1] + 1;
			vist[i][j] = true;
		      }
		  }
	      }
	    }
      }
    System.out.println (result[n - 1][n - 1]);

  }
}
