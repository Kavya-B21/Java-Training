import java.util.*;
public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int copy=num;
		int n,rev=0;
		while(num>0)
		{
			n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		if(copy==rev)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
