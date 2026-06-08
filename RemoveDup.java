public class RemoveDup {
	public static void main(String args[])
	{
		String s1 = "abcaabcade";
	      String res="";
	      int n = s1.length();
	      for(int i=0;i<n;i++){
	        char c = s1.charAt(i);
	        if(!res.contains(c+"")){
	          res += c;
	        }
	      }
	      System.out.println(res);
	}
}
