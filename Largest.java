import java.util.*;
public class Largest {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int max=0;
		while(a>0)
		{
			int n=a%10;
			if(n>max)
			{
				max=n;
			}
			a=a/10;
		}
		System.out.println(max);
	}
}
