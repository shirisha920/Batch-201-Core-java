public class Multiple1 {
	public static String calMulti(int num) {
	return "Multi=" + (((num+99)/100)*100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=Integer.parseInt(args[0]);
			System.out.println(calMulti(num));
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}

}
