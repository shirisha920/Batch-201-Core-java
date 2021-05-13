
public class GeneratePalindrome {
	public static String getPalindrome(int n) {
		int reminder, rev=0,temp;
		temp=n;
		while(n!=0) {
			reminder=n%10;
			rev=(rev*10)+reminder;
			n=n/10;
		}
		if(temp==rev)
			System.out.println(rev);
		return "result="+rev;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(getPalindrome(Integer.parseInt(args[0])));
			
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}