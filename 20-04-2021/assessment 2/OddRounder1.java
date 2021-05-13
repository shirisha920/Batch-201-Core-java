public class OddRounder1 {
	public static String oddRounder(int n) {
		String res=n>0?((n%2==0)?"even number":String.valueOf(((n+9)/10)*10)):"error";
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n=Integer.parseInt(args[0]);
			System.out.println(oddRounder(n));
			
			
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
