import java.util.Arrays;

public class Sort {
	public static void main(String[] args)
	{
		int lp[]= {13,2,4,15,12,10,6,5};
		Arrays.sort(lp);
		int start=0;
		int end=lp.length-1;
		while(start<end)
		{
			System.out.print(lp[end]+" "+lp[start]+" ");
			start++;
			end--;
		}
	}
}
