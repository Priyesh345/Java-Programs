public class Coincount
{
    static int getCount(int[] coins,int n,int sum)
    {

	int dp[][]=new int[sum+1][n+1];

	for(int i=0;i<=n;i++)
	    dp[0][i]=1;
	for(int i=1;i<=sum;i++)
	    dp[i][0]=0;

	for(int i=1;i<=sum;i++)
	    {
		for(int j=1;j<=n;j++)
		    {
			dp[i][j]=dp[i][j-1];
			if(coins[j-1]<=i)
			    dp[i][j]+=dp[i-coins[j-1]][j];
		    }
	    }
	return dp[sum][n];
    }

    public static void main(String[] args)
    {
	int[] coins={2,5,3,6};
	int n=4;
	int sum=10;

	System.out.println(getCount(coins,n,sum));
    }
}
