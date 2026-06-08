import java.util.*;
public class Nth_Summation {
	static int c=0;
	static int summ=0;
	public static void summation(int n)
	{
		summ=0;
		for(int i=1;i<n+1;i++)
		{
			summ=summ+i;
		}
		while(c>1)
		{
			c--;
			summation(summ);
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		c=m;
		summation(n);
		System.out.println(summ);
	}
}
