import java.util.*;
public class Rec_Sum {
	public static int ADD(int arr[],int n)
	{
		if(n==0)
		{
			return 0;
		}
		return arr[n-1]+ADD(arr,n-1);
	}
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(ADD(arr,num));
		
	}
}
