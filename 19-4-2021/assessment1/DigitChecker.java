public class DigitChecker {
	public static void main(String[] args) {
		
		int n=0;
		n=Integer.parseInt(args[0]);
		int a=n/10;
		int b=n%10;
		int diff=a-b;
		System.out.println(diff);
	}
}
