package Lec_13;

public class Polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(7,3));

	}
	public static int solve(int x, int n)
	{
		int c=1;
		int var=(int)Math.pow(x, n);
		int ans=0;
		while(c<=n)
		{
			ans+=c*var;
			c++;
			var/=x;
		}
		return ans;
	}

}
