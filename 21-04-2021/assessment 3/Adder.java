public class Adder {
	public static String getSum(int a,int b) {
		//int sum=a+b;
		return "sum="+ (a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(getSum(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}
}