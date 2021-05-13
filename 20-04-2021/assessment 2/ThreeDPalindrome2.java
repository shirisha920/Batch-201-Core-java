public class ThreeDPalindrome2 {
	public static String isPalindrome(int num) {
		int reminder, rev=0,temp;
		temp=num;
		while(num!=0) {
			reminder=num%10;
			rev=(rev*10)+reminder;
			num=num/10;
		}
		return "num is " + ((rev==temp)?true:false);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(121));

	}

}
