import java.util.*;
public class Num_of_one {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int count=0;
		int max=0;
		int row=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]==1)
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				row=i;
			}
			count=0;
		}
		System.out.println(row);
	}
}
