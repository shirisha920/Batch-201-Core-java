public class BiggestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("enter only two numbers");
			return;
		}
		try {
		int big;
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		if(num1 > num2 ) {
			big = num1;
		}
		else {
			big = num2;
		}
		System.out.println("biggest number " + big);
		}
		catch(Exception e) {
			System.out.println("please enter numbers only");
		}

}

}
