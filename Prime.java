import java.util.*;
public class Prime {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for (int i=start;i<end;i++)
		{
			int count=0;
			for (int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if (count==0 && i!=1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
