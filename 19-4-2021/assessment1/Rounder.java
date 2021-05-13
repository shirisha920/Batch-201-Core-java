public class Rounder {

	public static void main(String[] args) {
		
		try {
			int n=Integer.parseInt(args[0]);
											
			String res=n>0?(String.valueOf((n%2!=0)?n:(((n+9)/10)*10))):"Error";
			
			System.out.println(res);
			}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

}
