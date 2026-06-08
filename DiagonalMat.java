import java.util.*;
public class DiagonalMat {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int arr[][]=new int[num][num];
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		boolean isdia=true;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i!=j && arr[i][j]!=0)
				{
					isdia=false;
					break;
				}
			}
		}
		if(isdia)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
