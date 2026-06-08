public class Three_digit_Amstrong {
	public static void main(String args[])
	{
		for(int i=100;i<999;i++)
		{
			int num=i;
			int sum=0;
			while(num>0)
			{
				int a=num%10;
				int prod=a*a*a;
				sum=sum+prod;
				num=num/10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
	}
}
