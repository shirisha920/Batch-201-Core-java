public class GretestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int large=(a>b)?a:b;
			System.out.println(large);
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
