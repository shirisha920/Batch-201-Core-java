public class EvenOrOdd1 {
	public static boolean isEven(int num) {
		boolean b=false;
		if(num%2==0)
			b=true;
		return b;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=Integer.parseInt(args[0]);
		System.out.println(isEven(num));
		}
		catch(Exception e) {
		System.out.println("error");
		}
	}

}
