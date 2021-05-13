public class EvenFinder1 {
	public static String isEven(int num) {
		return "num is " + ((num%2==0)?true:false);
		
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
