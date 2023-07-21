import java.util.*;
class neck
{
static int Count(int N, int L, int R)
{

	int[][] dp = new int[N][(R - L) + 1];

	int ans = 0;

	for(int i = 0; i < N; i++)
	{
		dp[i][0] = 1;
	}
	for(int i = 1; i < dp[0].length; i++)
	{
		dp[0][i] = dp[0][i - 1] + 1;
	}

	ans = dp[0][R - L];
	for(int i = 1; i < N; i++)
	{
		for(int j = 1; j < dp[0].length; j++)
		{
			dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
		}
		ans += dp[i][R - L];
	}
	return ans;
}
public static void main(String args[])
{
	int N = 1;
	int L = 8;
	int R = 9;
	System.out.println(Count(N, L, R));
}
}

