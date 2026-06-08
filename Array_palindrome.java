public class Array_palindrome {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,3,2,1};
		int start=0;
		int end=arr.length-1;
		boolean palindrome=true;
		while(start<end)
		{
			if(arr[start]==arr[end])
			{
				start++;
				end--;
			}
			else
			{
				palindrome=false;
				break;
			}
		}
		if(palindrome)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
