import java.util.*;
public class Nth_Prime {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int check=1;
		for(int i=2;i<10000;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				if(check==num)
				{
					System.out.print(i);
					break;
				}
				else
				{
					check++;
				}
			}
			
		}
		
	}
}
