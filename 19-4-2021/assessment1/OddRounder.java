public class OddRounder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n=Integer.parseInt(args[0]);
			
			String res=n>0?((n%2==0)?"Even Number":String.valueOf(((n+9)/10)*10)):"error";
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
