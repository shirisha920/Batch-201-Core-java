public class SumOfDigits2 {
	static String calTotal(int num) {
		int num1=num/10;
		int num2=num%10;
		int sum=num1+num2;
		return "sum="+ sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(calTotal(Integer.parseInt(args[0])));
		}
		catch(Exception e) {
			System.out.println("error");
		}
		

	}

}
