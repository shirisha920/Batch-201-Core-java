public class SignFinder2 {
	public static String sign(int n) {
	String res=(n>0)?"positive number":((n<0)?"negative":"zero");
	return res;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n=Integer.parseInt(args[0]);
			System.out.println(sign(n));
			
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}
}
