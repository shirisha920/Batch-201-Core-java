public class DigitChecker2 {
	public static String calDiff(int num) {
		int num1=num%10;
		int num2=num/10;
		int diff=num1-num2;
		return "checker" + Math.abs(diff);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(calDiff(Integer.parseInt(args[0])));
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
