
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(isPalinDrome(Integer.parseInt(args[0])));
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}
	public static String isPalinDrome(int num) {
		int  rev=0,temp;
		temp=num;
			while(num!=0) {
				int reminder=num%10;
				rev=(rev*10)+reminder;
				num=num/10;
			}
				return "result =" + ((temp==rev)?true:false);
	}

}