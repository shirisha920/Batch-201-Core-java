public class CollatzSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(getSequence(Integer.parseInt(args[0])));
			
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

	private static String getSequence(int n) {
		// TODO Auto-generated method stub
		while(n!=1) {
		System.out.print(n + " ");
	        if ((n & 1) == 1)
	        	n= 3 * n + 1;
	        else  
	        	n=n / 2;
	         
		}
			return ""+ n;
	}

}
