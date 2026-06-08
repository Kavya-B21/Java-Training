import java.util.*;
public class Reverse {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int n,rev=0;
		while(num>0)
		{
			n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		System.out.println(rev);
	}
}
