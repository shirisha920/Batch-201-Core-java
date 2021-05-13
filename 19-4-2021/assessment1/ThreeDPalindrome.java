public class ThreeDPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=args[0];
		int a=s.charAt(0);
		int b=s.charAt(1);
		int c=s.charAt(2);
		String s1="";
		s1=s1+s.charAt(2)+s.charAt(1)+s.charAt(0);
		System.out.println(s.equals(s1));

	}

}
