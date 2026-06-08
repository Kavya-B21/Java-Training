import java.util.*;
public class Sum {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int a=sc.nextInt();
		while(a>0)
		{
			int n=a%10;
			sum=sum+n;
			a=a/10;
		}
		System.out.println(sum);
	}
	
}
