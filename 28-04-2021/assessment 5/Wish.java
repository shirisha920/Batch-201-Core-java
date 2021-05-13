public class Wish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time = args[0];
		
		if(time.equals("am")) {
		System.out.println(" Good Morning " + args[1]);
		}
		else if(time.equals("pm")) {
			System.out.println(" Good Evening " + args[1]);
		}
		else {
			System.out.println("First argument should be either 'Am' or 'pm");
		}

	}

}
