public class SignFinder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n=Integer.parseInt(args[0]);
			String res=(n>0)?"positive number":((n<0)?"negative":"zero");
			System.out.println(res);
			
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
